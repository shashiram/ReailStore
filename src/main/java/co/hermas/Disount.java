package co.hermas;

public class Disount {
    private String discountCode;
    private String discountDesc;
    private double discountPercentage;

    public Disount(String discountCode,String discountDesc,double discountPercentage){
        this.discountCode=discountCode;
        this.discountDesc=discountDesc;
        this.discountPercentage = discountPercentage;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public String getDiscountDesc() {
        return discountDesc;
    }

    public void setDiscountDesc(String discountDesc) {
        this.discountDesc = discountDesc;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
