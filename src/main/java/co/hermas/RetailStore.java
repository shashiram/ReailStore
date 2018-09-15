package co.hermas;

import org.joda.time.DateTime;
import org.joda.time.Years;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.Scanner;

public class RetailStore
{
    public static void main( String[] args )
    {

       BillDetails billDetails=new BillDetails();


       System.out.println("************Hermas Retail Store************");
       System.out.print("Biller Name : ");

       String name=(new Scanner(System.in)).nextLine();
       billDetails.setBillName(name);

       System.out.print("Bill Amt : ");
       double billAmt=(new Scanner(System.in)).nextDouble();
       billDetails.setBillAmt(billAmt);

       System.out.print("Grocery bill? Y / N :");

       String res=new Scanner(System.in).nextLine();

       billDetails.setGrocery(res.toLowerCase().equals("y")?true:false);

      double finalPaybaleAmt= processBillingDetails(billDetails);

        System.out.println("Amount to be pay : "+finalPaybaleAmt);

    }

    public static double processBillingDetails(BillDetails billDetails) {
        MasterData.loadMasterData();
        double discountAmt=0;
        if(billDetails.isGrocery()){
            discountAmt=calculatePreHundredDiscount(billDetails.getBillAmt());
        }
        else {
            discountAmt=calculatePercentageDis(billDetails.getBillName(),billDetails.getBillAmt());
        }

        return (billDetails.getBillAmt()-discountAmt);
    }

    public static double calculatePercentageDis(final String name, double billAmt) {
        double discountAmt=0;
        Optional<User> user =MasterData.userList.stream()
                                        .filter(x-> x.getUserName().toLowerCase().equals(name.toLowerCase()))
                                        .findFirst();

         if (user.isPresent()){
             String userType=user.get().getUserType();
             if (userType.toLowerCase()=="others"){
                 int years = Years.yearsBetween(user.get().getRegDate(),new DateTime()).getYears();
                 if(years>=2){
                     discountAmt= discountAmtByUserType(userType,billAmt);
                 }
                 else
                     discountAmt=calculatePreHundredDiscount(billAmt);

             }
             else {
                 discountAmt=discountAmtByUserType(userType,billAmt);
             }
         }
         else
             discountAmt=calculatePreHundredDiscount(billAmt);

        return discountAmt;
    }

    public static double discountAmtByUserType(String userType, double billAmt) {

        String discountCode=MasterData.userTypeDiscountCodeList.stream().filter(x-> x.getUserType().toLowerCase().equals(userType)).findFirst().get().getDiscountCode();
        double discountPert=MasterData.disountList.stream().filter(y-> y.getDiscountCode().equals(discountCode))
                                                            .findFirst().get().getDiscountPercentage();

        double  discountAmt= (billAmt*discountPert/100);
        double billAmtAfterDis=billAmt-discountAmt;
        double discountAmtPreHundred=calculatePreHundredDiscount(billAmtAfterDis);
        double actualDiscountAmt=discountAmt+discountAmtPreHundred;
        return  actualDiscountAmt;
    }

    public static double calculatePreHundredDiscount(double billAmt) {
         return Math.floor(billAmt/100)*5;
    }
}
