package com.fil.patterns.ocp;

public class BusinessInterestRule implements InterestRule {
    @Override
    public double calculateInterest(double balance) {
        return balance * 0.01;
    }
}
