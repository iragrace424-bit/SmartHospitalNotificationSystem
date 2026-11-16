
package com.hospital.notification;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class PatientAlertProcessor {

    private final NotificationService notification;
    private final NotificationService emergencyNotification;
    private final NotificationService smsNotification;

    public PatientAlertProcessor(
            NotificationService notification,
            @Qualifier("emergencyService") NotificationService emergencyNotification,
            @Qualifier("smsService") NotificationService smsNotification) {

        this.notification = notification;
        this.emergencyNotification = emergencyNotification;
        this.smsNotification = smsNotification;
    }

    public void processNormalAlert(String patientId, String message) {
        notification.sendNotification(patientId, message);
    }

    public void processEmergencyAlert(String patientId, String message) {
        emergencyNotification.sendNotification(patientId, message);
    }

    public void processSmsAlert(String patientId, String message) {
        smsNotification.sendNotification(patientId, message);
    }
}
