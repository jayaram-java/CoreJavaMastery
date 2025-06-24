package com.program.s1.oops.part2;

class UserDetails {
	
	// global variable
	private int id;
	private String username;
	private String gender;
	private String emailId;
	private String mobileNumber;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	
}

// this -> to access the current class global variable

// It is the process of wrapping code & data into a single unit.

// getter & setter methods

public class EncapsulationSample {

	public static void main(String[] args) {

		UserDetails ob = new UserDetails();
		
		ob.setUsername("Ramu");
		
		System.out.println(ob.getUsername());

	}

}
