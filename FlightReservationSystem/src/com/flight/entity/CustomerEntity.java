package com.flight.entity;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;  
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.flight.bean.Passenger;

@Entity
@Table(name="customer")
public class CustomerEntity{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="customer_id")
	private int customerId;
	
	@ManyToMany
	@JoinTable(name="customer_passenger", joinColumns=@JoinColumn(name="customer_id"), inverseJoinColumns=@JoinColumn(name="passport_no"))
	private List<PassengerEntity> passenger;
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public CustomerEntity(List<PassengerEntity> passenger, int noOfReservation) {
		super();
		this.passenger = passenger;
		this.noOfReservation = noOfReservation;
	}


	@Column(name="no_of_reservation")
	private int noOfReservation;
	
	public List<PassengerEntity> getPassenger() {
		return passenger;
	}

	public void setPassenger(List<PassengerEntity> passenger) {
		this.passenger = passenger;
	}

	public int getNoOfReservation() {
		return noOfReservation;
	}

	public void setNoOfReservation(int noOfReservation) {
		this.noOfReservation = noOfReservation;
	}


	
}
