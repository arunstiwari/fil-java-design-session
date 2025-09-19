package com.fil.patterns.ocp;

import java.util.HashMap;
import java.util.Map;

public class InterestCalculator {
    Map<String, InterestRule> interestRateMap = new HashMap<>();

    public InterestCalculator(Map<String, InterestRule> interestRateMap){
        this.interestRateMap = interestRateMap;
    }

    public double calculateInterest(String accountType, double balance) {
        double interest = interestRateMap.get(accountType).calculateInterest(balance);

//        if (accountType.equals("SAVINGS")) {
//            return balance * 0.02;
//        } else if (accountType.equals("CHECKING")) {
//            return balance * 0.001;
//        } else if (accountType.equals("PREMIUM")) {
//            return balance * 0.035;
//        } // <-- MODIFICATION REQUIRED HERE for new types (BUSINESS, STUDENT, etc.)
        return 0;
    }
}
