package com.fil.patterns.srp;

public class WhatsAppService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Send notification to whatsapp");
    }
}
