package com.flight.bean;

import java.util.Date;
import java.util.List;

import com.flight.business.service.ViewControl;

public class Customer extends Person {
	public Customer(String firstName, String lastName, Address address, String gender, Date date, String email,
			String password) {
		super(firstName, lastName, address, gender, date, email, password);
		// TODO Auto-generated constructor stub
	}
	private List<Passenger> passenger;
	private int noOfReservation;
	
	public boolean signUp(Person person)
	{
		ViewControl vc=new ViewControl();
		return vc.viewSignUp(person);
	}
	public boolean login()
	{
		return false;
	}
	public boolean signOut()
	{
		return false;
	}
	
	public List<Passenger> getPassenger() {
		return passenger;
	}
	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}
	public int getNoOfReservation() {
		return noOfReservation;
	}
	public void setNoOfReservation(int noOfReservation) {
		this.noOfReservation = noOfReservation;
	}
	
	
	

}
