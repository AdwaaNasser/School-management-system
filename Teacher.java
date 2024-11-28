
package helloall;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Teacher extends Employee{

public Teacher(String firstName, String lastNmae, String email, double salary,int yearsOfwork,int absensDays) {
super(firstName, lastNmae, email, salary,yearsOfwork,absensDays);
 JOptionPane.showMessageDialog(null, "Teacher added successfully!"); }


public String bonus () {

// when input is vaild calculate bonus
if (absensDays == 0) {
    salary += 1000;
            return "Congratulations!! Teacher " + firstName + " " + lastName + " got a bonus of 1000 riyals.";
            
        } else if (absensDays <= 5) {
             salary += 500;
            return "Congratulations!! Teacher " + firstName + " " + lastName + " got a bonus of 500 riyals.";
           
        } else if (absensDays <= 10) {
             salary += 250;
          return "Congratulations!! Teacher " + firstName + " " + lastName + " got a bonus of 250 riyals.";
           
        } else {
           return "Teacher " + firstName + " " + lastName + " doesn't get a bonus.";
        }
    }

// calculate salary based on working years

public String calculateSalay() {
double adjustedSalary = salary;
        if (yearsOfwork <= 5) {
           return "Your salary based on the years you worked: " + salary;
        } else if (yearsOfwork <= 10) {
            adjustedSalary += salary * 0.10;
            return "Your salary based on the years you worked: " + adjustedSalary;
        } else if (yearsOfwork <= 15) {
            adjustedSalary += salary * 0.15;
            return "Your salary based on the years you worked: " + adjustedSalary;
        } else if (yearsOfwork <= 20) {
            adjustedSalary += salary * 0.20;
           return "Your salary based on the years you worked: " + adjustedSalary;
        } else if (yearsOfwork <= 25) {
            adjustedSalary += salary * 0.25;
            return "Your salary based on the years you worked: " + adjustedSalary;
        } else {
            adjustedSalary += salary * 0.30;
           return "Your salary based on the years you worked: " + adjustedSalary;
        }
    }

    @Override
    public String toString() {
        return "Teacher first Name: " + firstName + ", last Name: " + lastName;
    }
}





 

