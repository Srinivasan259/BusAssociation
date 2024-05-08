package com.bus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bus.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer>{

	Passenger findByPassengerId(int passengerId);
		
	@Query("select passengerId from Passenger")
	public List<Integer> getPassengerId();
}
