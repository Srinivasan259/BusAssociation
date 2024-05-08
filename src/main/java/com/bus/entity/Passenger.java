package com.bus.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "passenger")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int passengerId;
	private int noOfSeats;
	private String pickupLoc;
	private String dropLoc;
	

	@ManyToOne(targetEntity = Bus.class, cascade = CascadeType.MERGE)
	private Bus bus;

	@OneToOne
	private Payment payment;

}
