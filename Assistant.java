
package helloall;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Assistant extends Employee {


public Assistant(String firstName, String lastNmae, String email, double salary,int yearsOfwork,int absensDays) {
super(firstName, lastNmae, email, salary,yearsOfwork,absensDays); }


public String bonus () {

      
// when input is vaild calculate bonus
if (absensDays == 0) {
     salary += 2000;
            return "Congratulations!! Administrator " + firstName + " " + lastName + " got a bonus of 2000 riyals.";
           
        } else if (absensDays <= 5) {
             salary += 550;
            return "Congratulations!! Administrator " + firstName + " " + lastName + " got a bonus of 550 riyals.";
           
        } else if (absensDays <= 10) {
            salary += 350;
            return "Congratulations!! Administrator " + firstName + " " + lastName + " got a bonus of 350 riyals." ;
            
        } else {
           return "Administrator " + firstName + " " + lastName + " doesn't get a bonus.";
        }
    }

// calculate salary based on working years

public String calculateSalay() {
 double adjustedSalary = salary;
        if (yearsOfwork <= 5) {
           return "Your salary based on the years you worked: " + salary;
        } else if (yearsOfwork <= 10) {
            adjustedSalary += salary * 0.15;
            return"Your salary based on the years you worked: " + adjustedSalary;
        } else if (yearsOfwork <= 15) {
            adjustedSalary += salary * 0.20;
            return"Your salary based on the years you worked: " + adjustedSalary;
        } else if (yearsOfwork <= 20) {
            adjustedSalary += salary * 0.25;
            return "Your salary based on the years you worked: " + adjustedSalary;
        } else if (yearsOfwork <= 25) {
            adjustedSalary += salary * 0.30;
           return "Your salary based on the years you worked: " + adjustedSalary;
        } else {
            adjustedSalary += salary * 0.35;
            return "Your salary based on the years you worked: " + adjustedSalary;
        }
    }

    @Override
    public String toString() {
        return "Assistant first Name: " + firstName + ", last Name: " + lastName;
    }
}
   














