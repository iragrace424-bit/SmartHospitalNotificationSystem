package com.hospital.notification;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SmartHospitalNotificationSystemApplication {
    @Bean
    CommandLineRunner testNotifications(PatientAlertProcessor processor) {
        return args -> {
            processor.processNormalAlert("P001", "Your appointment is confirmed.");

            processor.processEmergencyAlert("P002", "Emergency! Immediate attention required.");
            processor.processSmsAlert("P003", "Your hospital appointment is tomorrow.");
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SmartHospitalNotificationSystemApplication.class, args);
    }

}
