package com.test;

public class Customer {

	private int id;
	private String name;
	private String email;
	
	private Address address;
	
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Customer()
	{
		
	}
	
	public Customer(int id,String name,String email,Address address)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.address=address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+email);
		address.details();
	}
	
	
}
