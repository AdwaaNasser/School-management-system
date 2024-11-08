package csc113;

	import java.util.Scanner; 
	public class SchoolSystem1 { 

	public static void main (String[]args) { 
		
	Scanner input=new Scanner(System.in); 
	String firstName,lastNmae,email,courseName, courseCode;  


	double salary;  
	int choise1=0;  
	int cohise2=0;  
	int choise3=0;  
	int choise4=0; 


	do { 

	for(int i=0;i<=15;i++) 
	System.out.print("*"); 
	System.out.println("\nwellcome to the school manegment system\n"); 
	for(int i=0;i<=15;i++) 
	System.out.print("*"); 
	System.out.println("\n please enter your choise \n 1-Assistant \n 2-teacher \n3-exit"); 
	System.out.println(); 
	//main menu choice 
	choise1=input.nextInt();  
	//main switch  
	switch(choise1) { 
	 //Assistant  
	case 1 : 
	do { 
	for(int i=0;i<=15;i++) 
	System.out.print("-"); 
	System.out.println("\ndo you want to \n 1-manage an assistant \n 2-manage a course \n 3- exit \n");  
	for(int i=0;i<=15;i++) 
	System.out.print("-"); 
	System.out.println(); 
	cohise2=input.nextInt(); 

	//Assistant menu 
	switch(cohise2) { 

	//manage an Assistant 
	case 1 : 
	System.out.println("\n enter your First Name Last name, email ,salary \n");  
	firstName=input.next(); lastNmae=input.next();  email=input.next(); salary=input.nextInt();  
	Assistant obj1 = new Assistant(firstName,  lastNmae,  email,   salary);  
	obj1.setYearsOfwork();  
	System.out.println("\n your Salary based on the years you worked : "+obj1.calculateSalay());  
	obj1.bonus();  
	break; 

	 

	//manage a course 

	case 2 :  
	for(int i=0;i<=15;i++) 
	System.out.print("-"); 
	System.out.println("\nplease enter how many students you want to want to sign in");  
	System.out.println(); 
	int size =input.nextInt();  
	//checks validation  
	while(size<=0) { 
	System.out.println("!!!!invalid range!!!!");  
	System.out.println("please enter how many students do you want to want to sign in");  
	size =input.nextInt(); } 
	System.out.println("please enter the course's name and code");  
	 courseName=input.next();  
	  courseCode=input.next();
	 System.out.println("please enter the first name , Last name , email and salary for the teacher who is in charge of this course");  
	 firstName=input.next();  lastNmae=input.next();  email=input.next();  salary=input.nextDouble(); 
	 Course list= new Course (courseName,  courseCode, size,firstName,  lastNmae,  email,   salary);  

	 list.fillCourse();  


	 System.out.println("\nplease enter what you want to display \n1-students signed in this course \n2-teacher who is in charge \n3-nothing\n"); 
	 choise4= input.nextInt();  
	  if(choise4==1) 
	 list.display(); 

	if(choise4==2) 
	System.out.println(list.getTeacher()); 

	 do { //start of the operation menu 
	 for(int i=0;i<=15;i++) 
	System.out.print("-"); 
	 System.out.println("\nplease enter operation you want to do \n 1- add Student \n 2- delete Student \n 3- Search for a student \n 4- exit");  
	 for(int i=0;i<=15;i++) 
	System.out.print("-"); 
	 System.out.println(); 
	 choise3= input.nextInt();  
	//start of the operation switch 
	 if(choise3==1) 
	 list.AddStudent(); 

	 else if (choise3==2) 
	 list.deleteStudent(); 

	 else if (choise3==3) 
	 list.SearchForStudent(); 


	 
	  }while(choise3!=4); //end of Asisstent's opretion  
	break; 

	case 3: 
	    System.out.println("Exiting assistant menu..."); 
	    break;  

	} 

	} while (cohise2!=3); 
	break; 

	case 2 :  
	  for(int i=0;i<=15;i++) 
	System.out.print("-"); 
	  System.out.println("\nplease enter the first name , Last name , email and salary for the teacher ");  
	  for(int i=0;i<=15;i++) 
	System.out.print("-"); 
	  System.out.println(); 
	 firstName=input.next();  lastNmae=input.next(); email=input.next();  salary=input.nextDouble(); 
	  Teacher obj2 = new Teacher(firstName,lastNmae,email,salary);  
	     obj2.setYearsOfwork();  

	 System.out.println("your Salary based on the years you worked : "+obj2.calculateSalay());  
	 obj2.bonus();  


	 break;  
	case 3 : 
	 System.out.println("we hope you liked our services!!!"); 
	break; 

	 default: 
   System.out.println("Invalid choice. Please try again."); 


	} 

	
	}while(choise1!=3); 

	 

	 input.close(); 

	
	 

	} 

	 

	 

	}//end of class 

	 

	 

	 

	 
	


