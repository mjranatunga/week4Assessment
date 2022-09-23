package model;

import javax.servlet.ServletRequest;

import controller.enterNameServlet;

public class usersName {

	private String firstName;
	private String lastName;
	
	public usersName() {

		super();

	}
	
	public usersName(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
			
	}
		
	             
	@Override
	public String toString() {
		return "You entered: " + firstName + " " + lastName + ". Great to meet you!";
	}
}