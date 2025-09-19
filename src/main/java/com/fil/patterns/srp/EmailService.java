package com.fil.patterns.srp;

public class EmailService implements NotificationService {
    public void sendNotification(){
        System.out.println("Email Notification Sent");
    }
}
