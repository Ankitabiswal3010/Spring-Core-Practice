package com.nit.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("server")
public class Bankoperation 
{ 
 private double balance=1000;
 @Autowired
 private BankReport bankReport;

 public void deposit(double amount) {
     balance += amount;
     System.out.println("₹" + amount + " deposited successfully.");
 }

 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("₹" + amount + " withdrawn successfully.");
     } else {
         System.out.println("Insufficient Balance!");
     }
 }

 public void checkBalance() {
     System.out.println("Current Balance: ₹" + balance);
 }

 public void generateReport() {
     bankReport.generateReport(balance);
 }
}
