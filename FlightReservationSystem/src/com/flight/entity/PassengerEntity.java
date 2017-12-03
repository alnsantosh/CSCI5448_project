package com.flight.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="passenger")
public class PassengerEntity extends PersonEntity{
	@Column(name="visa_type")
	private String visaType;
	@Column(name="ticket_type")
	private String ticketType;
	@Column(name="meal_type")
	private String mealType;
	@Column(name="passport_no")
	private String passportNo;
	
//	@OneToOne
//	@JoinColumn(name="email",nullable=false)
//	private PersonEntity person;

	public PassengerEntity()
	{
		
	}
	public String getVisaType() {
		return visaType;
	}


	public PassengerEntity(String visaType, String ticketType, String mealType, String passportNo) 
	{
		super();
		this.visaType = visaType;
		this.ticketType = ticketType;
		this.mealType = mealType;
		this.passportNo = passportNo;
	}
	public void setVisaType(String visaType) {
		this.visaType = visaType;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public String getMealType() {
		return mealType;
	}

	public void setMealType(String mealType) {
		this.mealType = mealType;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}




}
