package SpringCore.Program01;

public class Employee 
{
 private int empId;
 private String name;
 private double salary;
 
 public void setEmpId(int empId) {
	this.empId = empId;
 }
 
 public void setName(String name) {
	this.name = name;
 }
 
 public void setSalary(double salary) {
	this.salary = salary;
 }
 
 public void display()
 {
	 IO.println("empId : "+empId);
	 IO.println("Name : "+name);
	 IO.println("Salary : "+salary);
 }
}
