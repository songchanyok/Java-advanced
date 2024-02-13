package com.test.contact;

public class BusinessContact extends Contact{
    String companyName;
    public BusinessContact(String name, String number,String companyName) {
        super(name, number);
        this.companyName=companyName;
    }

    @Override
    void displayContacts() {
        System.out.print("이름: " + name + ", 전화번호: "+ number + ", 회사명: " + companyName +"\n");
    }
}
