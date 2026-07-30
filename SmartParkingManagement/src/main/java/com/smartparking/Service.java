package com.smartparking;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Service {

    @PostConstruct
    public void initializeParkingInfrastructure() {
        System.out.println("🚧 Activating Parking Gate Sensors");
        System.out.println("📷 Initializing CCTV Cameras");
        System.out.println("💳 Connecting Payment Gateway");
        System.out.println("🖥️ Starting Vehicle Detection System");
        System.out.println("✅ Parking System Ready");
    }
}