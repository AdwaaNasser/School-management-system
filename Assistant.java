
package helloall;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Assistant extends Employee {


public Assistant(String firstName, String lastNmae, String email, double salary) {
super(firstName, lastNmae, email, salary); }


public void bonus () {
Scanner input = new Scanner(System.in);
//System.out.println("enter how many days the Assistant has missed");
//checks invaild input
try{
absensDays=input.nextInt();
if(absensDays<0|| absensDays>300)
throw new InputOutOfRangeException ();
    }catch(InputOutOfRangeException e){
JOptionPane.showMessageDialog(null,"invaild input!! enter again");
 }
// when input is vaild calculate bonus
if (absensDays==0) {
JOptionPane.showMessageDialog(null,"congratulations !! adminstratior " + firstName +" " + lastName + " got a bonus of 2000 riyals");
salary+=2000;
}

else if (absensDays<=5) {
JOptionPane.showMessageDialog(null,"congratulations !! adminstratior " + firstName +" " + lastName + " got a bonus of 550 riyals");
salary+=550;
}


else if (absensDays<=10) {
JOptionPane.showMessageDialog(null,"congratulations !! adminstratior " + firstName +" " + lastName + " got a bonus of 350 riyals");
salary+=350;
}


else {
JOptionPane.showMessageDialog(null,"adminstratior " + firstName +" " + lastName + " dosen't get a bonus");
}}


// calculate salary based on working years

public double calculateSalay() {
if(yearsOfwork<=5)
return salary;


else if(yearsOfwork<=10)
return salary+= (salary*0.15);


else if(yearsOfwork<=15)
return salary+= (salary*0.20);


else if(yearsOfwork<=20)
return salary+= (salary*0.25);


else if(yearsOfwork<=25)
return salary+= (salary*0.30);


else
return salary+= (salary*0.35);


}




}









