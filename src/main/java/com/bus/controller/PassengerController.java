package com.bus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bus.entity.Bus;
import com.bus.entity.Passenger;
import com.bus.service.PassengerService;

@RestController
@CrossOrigin("*")
public class PassengerController {

	@Autowired
	private PassengerService service;
	
	@PostMapping("/addPass")
	public String addPassengers(@RequestBody Passenger passenger){
		return service.addPassenger(passenger);	
	}
	
	@PutMapping("/updatePassengers")
	public Passenger updatePassengers(@RequestBody Passenger passenger) {
		return service.updatepassenger(passenger);
	}
	
	@GetMapping("/findpassengerbyId/{passengerId}")
	public Passenger findBussessbyId(@PathVariable("passengerId") int passenger) {
		return service.findPassengerbyId(passenger);
	}
	
	@GetMapping("/findallPass")
	public List<Passenger> findAllPassengers(){
		return service.findAllPassenger();
	}
	

	@GetMapping("/getAllpassengerId")
	public List<Integer> getAllPassengerId(){
		return service.findAllPassengerId();
	}
	
	@DeleteMapping("/deletePassenger/{passengerId}")
	public String deletePAssenger(@PathVariable("passengerId") Integer passenger) {
		 service.deletepassenger(passenger);
		 return "Passenger deleted";
	}
	
}
