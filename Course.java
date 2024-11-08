package csc113;


import java.util.Scanner;  


public class Course {  
private Student[] student; 
private String courseName;  
private String courseCode;  
private int courseCapasity;  
private int numOfStudents;  
private Teacher teacher; 

  

Scanner input=new Scanner(System.in);  
private String firstName;  
private String LastName;  
private String email;  

 


public Course (String courseName, String courseCode, int courseCapasity,String firstName, String lastNmae, String email, double salary) {  
this.courseCode=courseCode;  
this.courseName=courseName;  
this.courseCapasity=courseCapasity; 
this.student=new Student[courseCapasity]; 
this.teacher = new Teacher(firstName,  lastNmae,  email,  salary);   
this.numOfStudents=0; } 

  
 

public boolean CanSignIn() {  
// Check if the course is full  
if (numOfStudents >= courseCapasity) {  
System.out.println("Course is full. Cannot sign in ");  
   return false;  }
else  
return true;    }  

 
 

public void fillCourse() {  
// fills an arrary of student at once  

for (int i = 0; i < courseCapasity; i++) {  
System.out.println("enter student information \n  first name\n "); firstName=input.next() ;  
System.out.println("\nlast name"); LastName=input.next() ;  
System.out.println("\nemail"); email=input.next();  
student[i]= new Student( firstName, LastName,  email); 
numOfStudents++;} } 



 

public void AddStudent() {  
//checks if there is capastiy + adds a student to the arrey  
if(CanSignIn()== true) { 
System.out.print("enter student first name, last name and email");  
student[numOfStudents]= new Student(firstName, LastName,email );  
numOfStudents++; } }  

 
 

boolean SearchForStudent() {  
System.out.println("please enter the first name of the student you want to find"); 
String target=input.next(); 
for( int i = 0 ;i < numOfStudents ; i++ )  
if( student[i].firstName.equals(target) ) { 
System.out.println(target +"is found"); 
return true; } 
System.out.println("not found"); 
return false;}  

 
 

public boolean deleteStudent() {	  
System.out.println("please enter the first name of the student you want to delete"); 
String target=input.next(); 
for( int i = 0 ; i < numOfStudents ; i++ ) {  
if (student[i].getFirstName().equals(target)) {  
student[i] = student[ numOfStudents - 1] ;  
numOfStudents-- ;  
System.out.println("Student deleted successfully."); 
return true;  }  
} 
System.out.println("Student not found."); 

return false;} 

 

 

public void display() {  
// fills an arrary of student at once  
System.out.println("Students enrolled in " + courseName + ":"); 
for (int i = 0; i < numOfStudents; i++)  
System.out.println(student[i]); } 

 

 

public Teacher getTeacher() { 
return teacher; 

} 

 

 

 

 

 

 

} 
