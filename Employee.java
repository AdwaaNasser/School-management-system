
package helloall;

import java.util.Scanner;
import javax.swing.JOptionPane;
public abstract class Employee extends Member {
protected double salary;
protected int absensDays;
protected int yearsOfwork;
Scanner input=new Scanner(System.in); 

public Employee(String firstName, String lastNmae, String email, double salary) {
super(firstName, lastNmae, email);
try{
this.salary=salary;
if (salary<=0) throw new InputOutOfRangeException ();
}catch(InputOutOfRangeException e){
JOptionPane.showMessageDialog(null,"please enter a vaild salary");

} }


public abstract void bonus();

public double calculateSalay() {
return salary;

}


public void setYearsOfwork() {
Scanner input = new Scanner(System.in);
//System.out.println("enter how many years that you have worked");
//checks invaild input
try{
yearsOfwork=input.nextInt();
if (yearsOfwork<0|| yearsOfwork>45)
throw new InputOutOfRangeException ();
    }catch(InputOutOfRangeException e){
JOptionPane.showMessageDialog(null,"invaild input!! enter again");
 }


}





}
