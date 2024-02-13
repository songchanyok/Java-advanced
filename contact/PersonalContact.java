package com.test.contact;

public class PersonalContact extends Contact{
    String relation;
    public PersonalContact(String name, String number, String relation) {
        super(name, number);
        this.relation=relation;
    }

    @Override
    void displayContacts() {
        System.out.print("이름: " + name + ", 전화번호: "+ number + ", 관계: " + relation +"\n");
    }
}
