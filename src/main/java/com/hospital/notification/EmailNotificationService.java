package com.hospital.notification;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String patientId, String message) {
        System.out.println("Sending EMAIL to patient: " + patientId);
        System.out.println("Message: " + message);
    }
}