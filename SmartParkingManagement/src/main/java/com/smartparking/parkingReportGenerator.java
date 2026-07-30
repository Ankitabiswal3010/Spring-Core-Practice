package com.smartparking;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class parkingReportGenerator {

    public parkingReportGenerator() {
        System.out.println("📑 Report Generation Service Initialized");
    }

    public void generateDailyReport() {
        System.out.println("Reading thousands of parking records");
        System.out.println("Calculating total revenue");
        System.out.println("Generating PDF report");
        System.out.println("Storing report in database");
        System.out.println("✅ Daily Parking Report Generated Successfully!");
    }
}