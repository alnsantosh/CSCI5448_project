package com.flight.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.flight.bean.AvailableTransport;
import com.flight.bean.Customer;
import com.flight.bean.Reservation;
import com.flight.bean.Transportation;

public class Database {
	
	private static SessionFactory factory;
	
	public static synchronized SessionFactory getDBTable()
	{
		if(factory==null)
		{
			factory=new Configuration().configure().buildSessionFactory();
		}
		return factory;
	}
	
	public List<Reservation> addReservationtToDb(Reservation reservation)
	{
		return null;
		
	}
	
	public boolean addCustomerToDb()
	{
		return false;
	}
	
	public boolean checkCustomerInDb(Customer customer)
	{
		return false;
	}
	
	public AvailableTransport getFlightListFromDb(List<Transportation> transports)
	{
		return null;
	}

}
