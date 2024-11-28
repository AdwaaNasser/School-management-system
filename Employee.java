
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

//call methodes to vaildate input
if (!setSalary(salary)) {
            throw new UnmatchedRangeException("Invalid salary! Employee cannot be added.");
        }
        if (!setAbsensDays(absensDays)) {
            throw new UnmatchedRangeException("Invalid absence days! Employee cannot be added.");
        }
        if (!setYearsOfwork(yearsOfwork)) {
            throw new UnmatchedRangeException("Invalid years of work! Employee cannot be added.");
        }

}


public abstract String bonus();

public abstract String calculateSalay() ;


//methods to checks invaild input
 public boolean setSalary(double salary) {
       
   if (salary <= 0) 
      return false;
    else {
     this.salary = salary;
      return true;
            }   }
    

    public boolean setAbsensDays(int absensDays) {
    
     if (absensDays < 0 || absensDays > 300) 
        return false;
      else {
          this.absensDays = absensDays;
         return true;
            }
        
    }

    public boolean setYearsOfwork(int yearsOfwork) {
     
    if (yearsOfwork < 0 || yearsOfwork > 45)
       return false;
      else {
        this.yearsOfwork = yearsOfwork;
         return true;
            }
    }

}
