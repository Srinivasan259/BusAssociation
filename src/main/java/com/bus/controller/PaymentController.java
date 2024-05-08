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
import com.bus.entity.Payment;
import com.bus.service.PaymentService;

@RestController
@CrossOrigin("*")
public class PaymentController {

	@Autowired
	private PaymentService service;
	
	@PostMapping("/addPayment")
	public String addPayments(@RequestBody Payment payment){
		return service.addPayment(payment);	
	}
	
	@PutMapping("/updatePayment")
	public Payment updatePayments(@RequestBody Payment payment) {
		return service.updatePayment(payment);		
	}
	
	@GetMapping("/findByPaymentId/{paymentId}")
	public Payment findBussessbyId(@PathVariable("paymentId") int payment) {
		return service.findPaymentbyid(payment);
	}
	

	@GetMapping("/getAllpaymentId")
	public List<Integer> getAllpaymentId(){
		return service.findAllPaymentId();
	}
	
	@GetMapping("/findallPayment")
	public List<Payment> findAllPayments(){
		return service.findAllPayment();
	}
	
	@DeleteMapping("/deletePayment/{paymentId}")
	public String deletePayments(@PathVariable("paymentId")int payment) {
		return service.deletePayment(payment);
	}
}
