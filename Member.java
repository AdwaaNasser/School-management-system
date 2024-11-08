package csc113;

public class Member {
	
	protected String firstName;
	protected String lastName;
	private String email;


	public Member(String firstName, String lastName, String email) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	}



	public String toString() {
	return "members information : first name= " + firstName + ", last name= " + lastName + ", email= " + email + "]";
	}


	public String getFirstName() {
	return firstName;

	}



	public void setFirstName(String firstName) {
	this.firstName = firstName;

	}

	}
