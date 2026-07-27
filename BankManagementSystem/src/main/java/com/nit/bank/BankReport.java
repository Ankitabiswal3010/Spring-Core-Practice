package com.nit.bank;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BankReport {

    public BankReport() {
        System.out.println("📊 Initializing Report Generation Module...");
    }

    public void generateReport(double balance) {
        System.out.println("📄 Generating Bank Report...");
        System.out.println("Current Balance: " + balance);
        System.out.println("Report Generated Successfully!");
    }
}