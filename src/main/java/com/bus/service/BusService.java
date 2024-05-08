package com.bus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.bus.entity.Bus;
import com.bus.repository.BusRepository;

@Service
public class BusService {

	@Autowired
	private BusRepository busRepo;
	
	public String addBus(Bus bus) {
		 busRepo.save(bus);
		return "bus added";
	}
	
	public Bus findBusbyId(int busId){
		return busRepo.findByBusId(busId);
		 
	}
	
	public List<Bus> findAllBus(){
		return busRepo.findAll();
	}
	
	public List<Integer> findAllBusId(){
		return busRepo.getBusId();
	}
	
	public List<Bus> findBusName(String busName) {

		return busRepo.findByBusNameContaining(busName);
	}
	
	public Bus updateBus(Bus bus) {
		return busRepo.save(bus);
	}
	
	public String deleteBus(Integer bus) {
		busRepo.deleteById(bus);
		return null;
	}
}
