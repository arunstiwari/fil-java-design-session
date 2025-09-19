package com.fil.patterns.ocp;

public class CheckingInterestRule implements InterestRule {
    @Override
    public double calculateInterest(double balance) {
        return balance * 0.001;
    }
}
