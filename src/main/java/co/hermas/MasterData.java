package co.hermas;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class MasterData {
    public static List<User> userList=new ArrayList<>();
    public static List<Disount> disountList=new ArrayList<>();
    public static List<UserTypeDiscountCode> userTypeDiscountCodeList=new ArrayList<>();

    public static void loadMasterData(){

        // load Store User Data

        userList.add(new User("Shashi","employee",new DateTime()));
        userList.add(new User("Ram","affiliated",new DateTime()));
        userList.add(new User("Kumar","others",new DateTime().minusYears(3)));
        userList.add(new User("Arvind","employee",new DateTime().minusYears(2)));
        userList.add(new User("Supriya","affiliated",new DateTime().minusYears(4)));

        // load Store Disount Scheme

        disountList.add(new Disount("ED","Applicable for store employee users",30) );
        disountList.add(new Disount("AD","Applicable for store affiliated users",10) );
        disountList.add(new Disount("OD","Applicable for those users who are customer for more than 2 years ",5) );

        // user type and applicable discount mapping

        userTypeDiscountCodeList.add(new UserTypeDiscountCode("employee","ED"));
        userTypeDiscountCodeList.add(new UserTypeDiscountCode("affiliated","AD"));
        userTypeDiscountCodeList.add(new UserTypeDiscountCode("others","OD"));
    }
}
