package com.fil.patterns.ocp;

public class PremiumInterestRule implements InterestRule {
    @Override
    public double calculateInterest(double balance) {
        return balance * 0.035;
    }
}
