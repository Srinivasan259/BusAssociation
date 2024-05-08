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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bus.entity.Bus;
import com.bus.service.BusService;

@RestController
@CrossOrigin("*")
public class BusController {

	@Autowired
	private BusService service;

	@PostMapping("/addBus")
	public String addBusess(@RequestBody Bus bus) {
		return service.addBus(bus);
	}

	@PutMapping("/updateBusses")
	public Bus updateBussess(@RequestBody Bus bus) {
		return service.updateBus(bus);
	}
	
	@GetMapping("/findBusbyId/{busId}")
	public Bus findBussessbyId(@PathVariable("busId") int bus) {
		return service.findBusbyId(bus);
	}

	@GetMapping("/getAllbus")
	public List<Bus> getAllBus() {
		return service.findAllBus();
	}
	
	@GetMapping("/getAllbusId")
	public List<Integer> getAllbusId(){
		return service.findAllBusId();
	}
	
	@GetMapping("/findBusbyName/{busName}")
	List<Bus> findBusName(@PathVariable("busName") String busName) {

		return service.findBusName(busName);

	}

	@DeleteMapping("/deleteBus/{busId}")
	public String deleteBusses(@PathVariable("busId") Integer bus) {
		service.deleteBus(bus);
		return "Bus deleted";
	}
}
