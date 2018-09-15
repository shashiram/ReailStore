package co.hermas;


import org.joda.time.DateTime;

public class User {
    private String userName;
    private String userType;
    private DateTime regDate;

    public User(String userName,String userType,DateTime regDate){
        this.userName=userName;
        this.userType=userType;
        this.regDate=regDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public DateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(DateTime regDate) {
        this.regDate = regDate;
    }
}
