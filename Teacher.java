package csc113;


import java.util.Scanner;


public class Teacher extends Employee{

public Teacher(String firstName, String lastNmae, String email, double salary) {
super(firstName, lastNmae, email, salary); }


public void bonus () {
Scanner input = new Scanner(System.in);
System.out.println("enter how many days the teacher has missed");
absensDays=input.nextInt();
//checks invaild input
while (absensDays<0|| absensDays>300) {
System.out.println("invaild input!! enter again");
absensDays=input.nextInt(); }
// when input is vaild calculate bonus
if (absensDays==0) {
System.out.println("congratulations !! teacher " + firstName +" " + lastName + " got a bonus of 1000 riyals");
salary+=1000;
}

else if (absensDays<=5) {
System.out.println("congratulations !! teacher " + firstName +" " + lastName + " got a bonus of 500 riyals");
salary+=500;
}

else if (absensDays<=10) {
System.out.println("congratulations !! teacher " + firstName +" " + lastName + " got a bonus of 250 riyals");
salary+=250;
}

else {
System.out.println("teacher " + firstName +" " + lastName + " dosen't get a bonus");
}}

// calculate salary based on working years

public double calculateSalay() {
if(yearsOfwork<=5)
return salary;

else if(yearsOfwork<=10)
return salary+= (salary*0.10);

else if(yearsOfwork<=15)
return salary+= (salary*0.15);

else if(yearsOfwork<=20)
return salary+= (salary*0.20);

else if(yearsOfwork<=25)
return salary+= (salary*0.25);

else
return salary+= (salary*0.30);

}

public String toString() {
return "Teacher first Name= " + firstName + ", last Name= " + lastName ;
}


}





