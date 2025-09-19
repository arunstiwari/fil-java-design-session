package com.fil.patterns.srp;

import java.util.List;

public class StringReportingService implements  ReportingService {
    public String generateReports(BankAccount bankAccount){
        System.out.println("Report generated");
        StringBuilder sb = new StringBuilder();
        sb.append("Statement for ").append(bankAccount.getCustomerName()).append(" (").append(bankAccount.getAccountNumber()).append(")\n");
        sb.append("------------------------------------------\n");
        List<String> transactions = bankAccount.getTransactions();
        for (String t : transactions) sb.append(t).append("\n");
        sb.append("------------------------------------------\n");
        sb.append("Current balance: ").append(bankAccount.getBalance()).append("\n");
        return sb.toString();
    }
}
