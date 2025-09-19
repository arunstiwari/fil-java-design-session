package com.fil.patterns.ocp;

public class SavingInterestRule implements InterestRule {
    @Override
    public double calculateInterest(double balance) {
        return balance * 0.02;
    }
}
