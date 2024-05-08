package com.bus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.entity.Bus;
import com.bus.entity.Passenger;
import com.bus.repository.PassengerRepository;

@Service
public class PassengerService {

	@Autowired
	private PassengerRepository passengerRepo;

	public String addPassenger(Passenger passenger) {
		passengerRepo.save(passenger);
		return "Passenger added";
	}

	public Passenger updatepassenger(Passenger passenger) {
		return passengerRepo.saveAndFlush(passenger);
	}
	
	public Passenger findPassengerbyId(int passengerId){
		return passengerRepo.findByPassengerId(passengerId);
		 
	}
	
	public List<Integer> findAllPassengerId(){
		return passengerRepo.getPassengerId();
	}

	public List<Passenger> findAllPassenger() {
		return passengerRepo.findAll();

	}

	public String deletepassenger(Integer passenger) {
		passengerRepo.deleteById(passenger);
		return null;
	}
}
