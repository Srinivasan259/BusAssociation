package com.bus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bus.entity.Bus;

public interface BusRepository extends JpaRepository<Bus, Integer>{

	Bus findByBusId(int busId);
	
	List<Bus> findByBusNameContaining(String busName);
	
	@Query("select busId from Bus")
	public List<Integer> getBusId();

}
