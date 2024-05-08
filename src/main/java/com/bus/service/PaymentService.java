package com.bus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.entity.Payment;
import com.bus.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepo;

	public String addPayment(Payment payment) {
		paymentRepo.saveAndFlush(payment);
		return "Payment added";
	}
	
	public Payment updatePayment(Payment payment) {
		return paymentRepo.save(payment);
	}
	
	public Payment findPaymentbyid(int paymentId) {
		return paymentRepo.findByPaymentId(paymentId);
	}

	public List<Payment> findAllPayment() {
		return paymentRepo.findAll();

	}
	
	public List<Integer> findAllPaymentId(){
		return paymentRepo.getPaymentId();
	}
	
	public String deletePayment(int bus) {
		paymentRepo.deleteById(bus);
		return null;
	}
}
