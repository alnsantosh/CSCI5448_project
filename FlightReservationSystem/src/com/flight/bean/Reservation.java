package com.flight.bean;

import java.io.File;
import java.util.List;

public class Reservation {
	
	public SelectedTransport transport;
	public Customer customer;
	
	
	public SelectedTransport getTransport() {
		return transport;
	}

	public void setTransport(SelectedTransport transport) {
		this.transport = transport;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void selectSeat(List<Flight> flights)
	{
		
	}
	
	public void cancelReservation()
	{
		
	}
	
	public void selectReservation()
	{
		
	}
	
	public void modifyReservation()
	{		
		
	}
	
	public File generateBoardingPass()
	{
		return null;
	}
	
	public void emailBoardingPass(File file)
	{
		
	}

}
