package com.wyt.pojo;


public class Users {
    private Integer userID;
    private String uName;
    private String uPass;

    @Override
    public String toString() {
        return "Users{" +
                "userID=" + userID +
                ", uName='" + uName + '\'' +
                ", uPass='" + uPass + '\'' +
                '}';
    }

    public Users(String uName, String uPass) {
        this.uName = uName;
        this.uPass = uPass;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPass() {
        return uPass;
    }

    public void setuPass(String uPass) {
        this.uPass = uPass;
    }

    public Users() {
    }

    public Users(Integer userID, String uName, String uPass) {
        this.userID = userID;
        this.uName = uName;
        this.uPass = uPass;
    }
}
