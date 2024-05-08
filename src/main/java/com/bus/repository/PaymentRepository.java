package com.bus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bus.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

	Payment findByPaymentId(int paymentId);
		
	@Query("select paymentId from Payment")
	public List<Integer> getPaymentId();

}
