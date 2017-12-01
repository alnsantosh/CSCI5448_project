package com.flight.business.service;

import javax.persistence.Entity;
import com.flight.bean.Flight;
import com.flight.bean.Person;
import com.flight.entity.PersonEntity;
import com.flight.bean.Reservation;
import com.flight.bean.Transportation;

import java.util.Scanner; 

public class ViewControl {
	
	private PersonEntity person1;
	
	
	public ViewControl() {

	}
	
	public boolean viewSignUp()
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = read.nextInt();
		read.close();
		return n==2;
	}
	
	public boolean viewLogin()
	{
		return false;
	}
	
	public boolean viewSignOut()
	{
		return false;
	}
	
	public void viewSelectReservation()
	{
		
	}
	
	public boolean viewConfirmReservation()
	{
		return false;
	}
	
	public boolean viewQueryPassenger()
	{
		return false;
	}
	
	public boolean viewDisplayList()
	{
		return false;
		
	}
	
	public boolean displayQueriedRes()
	{
		return false;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to OOAD Flight Reservation System!!\n");
		ViewControl v = new ViewControl();
		boolean x = v.viewSignUp();
		System.out.println(x);
		System.out.println("Thank you for Signing up!");
		
	}


	

}
