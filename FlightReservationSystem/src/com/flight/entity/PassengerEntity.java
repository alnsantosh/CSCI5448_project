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
public class PassengerEntity {
	@Column(name="visa_type")
	private String visaType;
	@Column(name="ticket_type")
	private String ticketType;
	@Column(name="meal_type")
	private String mealType;
	@Id
	@Column(name="passport_no")
	private String passportNo;
	
	@OneToOne
	@JoinColumn(name="id",nullable=false)
	private AddressEntity address;



}
