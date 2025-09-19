package com.fil.patterns.srp;

public class AccountRepository implements BankRepository {
    public void saveToDatabase(){
        System.out.println("Account INformation saved");
    }

    public void loadFromDatabase(){
        System.out.println("Loaded account information from database");
    }
}
