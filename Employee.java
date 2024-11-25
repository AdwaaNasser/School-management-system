
package helloall;

import java.util.Scanner;
import javax.swing.JOptionPane;
public abstract class Employee extends Member {
protected double salary;
protected int absensDays;
protected int yearsOfwork;
Scanner input=new Scanner(System.in); 

public Employee(String firstName, String lastNmae, String email, double salary,int yearsOfwork,int absensDays) {
super(firstName, lastNmae, email);
//checks invaild input
if (setSalary( salary)==false)
    return;
if (setAbsensDays( absensDays)==false)
    return;
if (setYearsOfwork( yearsOfwork)==false)
    return;

 JOptionPane.showMessageDialog(null, "Assistant added successfully!");
}


public abstract String bonus();

public abstract String calculateSalay() ;


//methods to checks invaild input
public boolean setSalary(double salary){
    try{
if (salary<=0) throw new UnmatchedRangeException ();
else {
    this.salary=salary;
    return true;}
}catch(UnmatchedRangeException e){
JOptionPane.showMessageDialog(null,"Invalid salary!! Employee cant be added");
return false;
    
}}
public boolean setAbsensDays(int absensDays) {

try{
 if (absensDays < 0 || absensDays > 300)
                throw new UnmatchedRangeException();
 else{
     this.absensDays = absensDays;
      return true;}
        } catch (UnmatchedRangeException e) {
            JOptionPane.showMessageDialog(null, "Invalid absens Days!!Employee cant be added "); 
        return false;}


}

public boolean setYearsOfwork(int yearsOfwork) {
try{
if (yearsOfwork<0|| yearsOfwork>45)
throw new UnmatchedRangeException ();
else {
    this.yearsOfwork = yearsOfwork;
     return true;}
    }catch(UnmatchedRangeException e){
JOptionPane.showMessageDialog(null,"invaild years Of work!! Employee cant be added");
return false;
 }
}



}
