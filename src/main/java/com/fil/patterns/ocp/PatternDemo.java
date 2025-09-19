package com.fil.patterns.ocp;

import java.util.HashMap;
import java.util.Map;

public class PatternDemo {
    public static void main(String[] args) {
        Map<String, InterestRule> interestRateMap = new HashMap<>();
        interestRateMap.put("PREMIUM", new PremiumInterestRule());
        interestRateMap.put("SAVINGS", new SavingInterestRule());
        interestRateMap.put("CHECKING", new CheckingInterestRule());
        interestRateMap.put("BUSINESS", new BusinessInterestRule());


        InterestCalculator calc = new InterestCalculator(interestRateMap);
        System.out.println("SAVINGS interest on 1000 = " + calc.calculateInterest("SAVINGS", 1000));
        System.out.println("CHECKING interest on 1000 = " + calc.calculateInterest("CHECKING", 1000));
        System.out.println("PREMIUM interest on 1000 = " + calc.calculateInterest("PREMIUM", 1000));
        // Adding BUSINESS would force us to modify InterestCalculator – a violation.
    }
}
