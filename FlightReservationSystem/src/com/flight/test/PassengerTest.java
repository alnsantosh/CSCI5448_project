package com.flight.test;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.flight.entity.AddressEntity;
import com.flight.entity.PassengerEntity;
import com.flight.entity.PersonEntity;

public class PassengerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.getCurrentSession();
		try
		{
			System.out.println("Creating Passenger object");
			AddressEntity a=new AddressEntity("NewtonCt",6,"Boulder", "CO", "USA", 80304);
			PersonEntity p=new PersonEntity("shruthi", "sukumar", a, "M", new Date(2017,2, 11),"ffkkts@gmail.com", "123456");
			PassengerEntity pass = new PassengerEntity("F","Economy","Veg","pjr7hf");
			pass.setAddress(a);
			pass.setFirstName(p.getFirstName());
			pass.setLastName(p.getLastName());
			pass.setGender(p.getGender());
			pass.setDate(p.getDate());
			pass.setEmail(p.getEmail());
			pass.setPassword(p.getPassword());
			
			
			System.out.println("Beginning Transaction");
			session.beginTransaction();
			System.out.println("Saving the passenger in database");
			session.save(a);
			session.save(p);
			session.save(pass);
			session.getTransaction().commit();
			System.out.println("Commit completed");
			
			//primary id
//			PersonEntity pass_person = pass.getPerson();
//			
//			System.out.println("Passenger: "+pass_person.getFirstName()+" "+pass_person.getLastName());
//			 //get a session and start transaction
//			session=factory.getCurrentSession();
//			session.beginTransaction();
//			PassengerEntity f=session.get(PassengerEntity.class,pass.getPassportNo());
//			System.out.println("Passenger:"+f);
//			session.getTransaction().commit();
			
			
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
