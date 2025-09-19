package com.fil.patterns.srp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance = 0.0;
    private String customerName;
    private final List<String> transactions = new ArrayList<>();
    private NotificationService notificationService ;
    private BankRepository bankRepository ;
    private ReportingService reportingService;

    public BankAccount(String accountNumber, String accountName,  String customerName, NotificationService notificationService, BankRepository bankRepository, ReportingService reportingService   ) {

        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.customerName = customerName;
        this.notificationService = notificationService;
        this.bankRepository = bankRepository;
        this.reportingService = reportingService;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public double getBalance() {
        return balance;
    }

    public void setBankRepository(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void setReportingService(ReportingService reportingService) {
        this.reportingService = reportingService;
    }

    public BankAccount(String accountNumber, String customerName) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = 0.0;
    }

    // --- Responsibility 1: Core Account Logic (Correct) ---
    public void deposit(double amount) {
        balance += amount;
        transactions.add(LocalDateTime.now() + " +"+amount+" -> "+balance);
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(LocalDateTime.now() + " -"+amount+" -> "+balance);
    }

    // --- 1: Persistence Logic ---
    public void saveToDatabase() {
        /* DB logic */
        this.bankRepository.saveToDatabase();
    }
    public void loadFromDatabase() {
        this.bankRepository.loadFromDatabase();
    }

    // ---  2: Notification Logic ---
    public void sendEmailNotification() {
        this.notificationService.sendNotification();
    }

    // ---  3: Presentation/Reporting Logic ---
    public String generateStatement() {
       return this.reportingService.generateReports(this);
    }
}
