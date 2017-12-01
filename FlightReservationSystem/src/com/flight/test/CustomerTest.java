package com.flight.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.flight.entity.AddressEntity;
import com.flight.entity.PassengerEntity;
import com.flight.entity.PersonEntity;
import com.flight.entity.CustomerEntity;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.getCurrentSession();
		try
		{
			System.out.println("Creating Passenger object");
			AddressEntity a=new AddressEntity("NewtonCt",6,"Boulder", "CO", "USA", 80304);
			PersonEntity p=new PersonEntity("shruthi", "sukumar", a, "M", new Date(2017,2, 11),"sru6ts@gmail.com", "123456");
			PassengerEntity pass = new PassengerEntity("F","Economy","Veg","npjr7hf",p);
			//List<PassengerEntity> passenger_list = Arrays.asList(pass);
			List<PassengerEntity> passenger_list=new ArrayList<>();
			passenger_list.add(pass);
			CustomerEntity cust = new CustomerEntity(passenger_list,1);
			System.out.println("Beginning Transaction");
			session.beginTransaction();
			System.out.println("Saving a customer in database");
			session.save(a);
			session.save(p);
			session.save(pass);
			session.save(cust);
			session.getTransaction().commit();
			System.out.println("Commit completed");
			
			//primary id
			PersonEntity pass_person = pass.getPerson();
			
			System.out.println("Passenger: "+pass_person.getFirstName()+" "+pass_person.getLastName());
			 //get a session and start transaction
			session=factory.getCurrentSession();
			session.beginTransaction();
			PassengerEntity f=session.get(PassengerEntity.class,pass.getPassportNo());
			System.out.println("Passenger:"+f);
			session.getTransaction().commit();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			factory.close();
		}

	}

}
