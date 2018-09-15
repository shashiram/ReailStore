package co.hermas;

public class BillDetails {
    private String billName;
    private double billAmt;
    private boolean Grocery;



    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public double getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(double billAmt) {
        this.billAmt = billAmt;
    }

    public boolean isGrocery() {
        return Grocery;
    }

    public void setGrocery(boolean grocery) {
        Grocery = grocery;
    }
}
