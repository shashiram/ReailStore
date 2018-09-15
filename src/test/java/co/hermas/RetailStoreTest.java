package co.hermas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple RetailStore.
 */
public class RetailStoreTest
{

    @Test
    public void shashiUserTest(){
        BillDetails billDetails=null;

        billDetails=new BillDetails();
        billDetails.setBillName("shashi");
        billDetails.setBillAmt(990);
        billDetails.setGrocery(true);

        double finalPaybaleAmt=RetailStore.processBillingDetails(billDetails);

        assertEquals(945,finalPaybaleAmt,0.0);

        billDetails.setGrocery(false);

        finalPaybaleAmt=RetailStore.processBillingDetails(billDetails);

        assertEquals(663,finalPaybaleAmt,0.0);
    }
    @Test
    public void ramUserTest(){
        double finalPaybaleAmt=0;
        BillDetails billDetails=new BillDetails();
        billDetails.setBillName("ram");
        billDetails.setBillAmt(990);
        billDetails.setGrocery(true);

        finalPaybaleAmt=RetailStore.processBillingDetails(billDetails);

        assertEquals(945,finalPaybaleAmt,0.0);

        billDetails.setGrocery(false);

        finalPaybaleAmt=RetailStore.processBillingDetails(billDetails);

        assertEquals(851,finalPaybaleAmt,0.0);

    }

    @Test
    public void kumarUserTest(){
        double finalPaybaleAmt=0;
        BillDetails billDetails=new BillDetails();

        billDetails=new BillDetails();
        billDetails.setBillName("kumar");
        billDetails.setBillAmt(990);
        billDetails.setGrocery(true);

        finalPaybaleAmt=RetailStore.processBillingDetails(billDetails);

        assertEquals(945,finalPaybaleAmt,0.0);


        billDetails.setGrocery(false);

        finalPaybaleAmt=RetailStore.processBillingDetails(billDetails);

        assertEquals(895.5,finalPaybaleAmt,0.0);

    }

    @Test
    public void arvindUserTest(){
        double finalPaybaleAmt=0;
        BillDetails billDetails=new BillDetails();

        billDetails=new BillDetails();
        billDetails.setBillName("arvind");
        billDetails.setBillAmt(300);
        billDetails.setGrocery(true);

        finalPaybaleAmt=RetailStore.processBillingDetails(billDetails);

        assertEquals(285,finalPaybaleAmt,0.0);


        billDetails.setGrocery(false);

        finalPaybaleAmt=RetailStore.processBillingDetails(billDetails);

        assertEquals(200,finalPaybaleAmt,0.0);


    }


    @Test
    public void supriyaUserTest(){
        double finalPaybaleAmt=0;
        BillDetails billDetails=new BillDetails();


        billDetails=new BillDetails();
        billDetails.setBillName("supriya");
        billDetails.setBillAmt(300);
        billDetails.setGrocery(true);

        finalPaybaleAmt=RetailStore.processBillingDetails(billDetails);

        assertEquals(285,finalPaybaleAmt,0.0);


        billDetails.setGrocery(false);

        finalPaybaleAmt=RetailStore.processBillingDetails(billDetails);

        assertEquals(260,finalPaybaleAmt,0.0);


    }


    @Test
    public void notRegisteredUserTest(){
        double finalPaybaleAmt=0;
        BillDetails billDetails=new BillDetails();


        billDetails=new BillDetails();
        billDetails.setBillName("abc");
        billDetails.setBillAmt(990);
        billDetails.setGrocery(true);

        finalPaybaleAmt=RetailStore.processBillingDetails(billDetails);

        assertEquals(945,finalPaybaleAmt,0.0);


        billDetails.setGrocery(false);

        finalPaybaleAmt=RetailStore.processBillingDetails(billDetails);

        assertEquals(945,finalPaybaleAmt,0.0);


    }
}
