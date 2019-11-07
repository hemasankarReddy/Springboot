package com.mkyong.model;



public class Employee {
	

	private long id;
	private String name;
	private String lastName;
	private String email;
	private String phone;
	private boolean active;
	private String firstName="firstName";

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getEmial1() {
		return emial1;
	}

	public void setEmial1(String emial1) {
		this.emial1 = emial1;
	}

	private String middleName="middleName";
	private String emial1="abc@gmail.com";
	public Employee() {
		super();
	}
	
	public Employee(String name, String lastName, String email, String phone, boolean active) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.active = active;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

}
