package co.hermas;

public class UserTypeDiscountCode {
    private String userType;
    private String discountCode;

    public UserTypeDiscountCode(String userType,String discountCode){
        this.userType=userType;
        this.discountCode=discountCode;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }
}
