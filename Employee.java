package csc113;
import java.util.Scanner;


public abstract class Employee extends Member {
protected double salary;
protected int absensDays;
protected int yearsOfwork;


public Employee(String firstName, String lastNmae, String email, double salary) {
super(firstName, lastNmae, email);
this.salary=salary;
while (salary<=0) {
System.out.println("enter a vaild salary");
this.salary=salary; } }


public abstract void bonus();


public double calculateSalay() {

return salary;

}


public void setYearsOfwork() {
Scanner input = new Scanner(System.in);
System.out.println("enter how many years that you have worked");
//checks invaild input
yearsOfwork=input.nextInt();
while (yearsOfwork<0|| yearsOfwork>45) {
System.out.println("invaild input!! enter again");
yearsOfwork=input.nextInt(); }
this.yearsOfwork = yearsOfwork;

}


}

