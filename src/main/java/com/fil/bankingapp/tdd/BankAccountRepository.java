package com.fil.bankingapp.tdd;

public class BankAccountRepository {
    public double fetchBalance(String customerId) {
        //Logic for querying towards
        if (customerId == null) {
            throw new RuntimeException("Account Not available");
        }
        return 0;
    }
}
