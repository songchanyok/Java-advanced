package com.test.contact;

public abstract class Contact {
    String name;
    String number;

    public Contact(String name, String number) {
        this.name=name;
        this.number=number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    abstract void displayContacts();



}
