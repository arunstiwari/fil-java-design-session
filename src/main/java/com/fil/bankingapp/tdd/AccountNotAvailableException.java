package com.fil.bankingapp.tdd;

public class AccountNotAvailableException extends Exception {
    public AccountNotAvailableException(String message) {
        super(message);
    }
}
