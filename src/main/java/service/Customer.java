package service;

public class Customer {
    private  static String name;
    private static String suranem;
    private static String phoneNumber;
    private static String address;
    private static String emailAddress;

    public Customer() {
    }

    public Customer(String name, String suranem, String phoneNumber, String address, String emailAddress) {
        this.name = name;
        this.suranem = suranem;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.emailAddress = emailAddress;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getSuranem() {
        return suranem;
    }

    public void setSuranem(String suranem) {
        this.suranem = suranem;
    }

    public  static String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    public static String tOString() {
        return
                         "Name          "+ getName() + "\n" +
                         "Surname       "+getSuranem() + "\n" +
                         "Phone Number  "+getPhoneNumber()+"\n"+
                         "Address       "+ getAddress() + "\n" +
                         "Email         "+ getEmailAddress()  ;
    }
}
