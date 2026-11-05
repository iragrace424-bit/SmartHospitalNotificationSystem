package com.hospital.notification;

import org.springframework.stereotype.Component;

@Component("emergencyService")
public class EmergencyUrgentNotificationService implements NotificationService {

    @Override
    public void sendNotification(String patientId, String message) {
        System.out.println("!!! CRITICAL ICU ALERT !!!");
        System.out.println("Emergency notification for patient: " + patientId);
        System.out.println("Message: " + message);
    }
}