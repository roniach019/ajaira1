package com.example.mystore;

public class User {
    public String firstName;
    public String lastName;
    public String email;

    User(){};       // this is important noile error dekhabe

    User(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
