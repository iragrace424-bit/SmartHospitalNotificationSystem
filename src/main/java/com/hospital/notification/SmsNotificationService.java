package com.hospital.notification;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SmsNotificationService implements NotificationService {

    @Override
    public void sendNotification(String patientId, String message) {
        System.out.println("Sending SMS to patient: " + patientId);
        System.out.println("Message: " + message);
    }
}