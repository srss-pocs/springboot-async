package com.example.async.service;

import org.springframework.stereotype.Service;

import com.example.async.dto.OrderDTO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PaymentService {

	public void processPayment(OrderDTO order) throws InterruptedException {
		log.info("initiate payment for order " + order.getProductId());
		// call actual payment gateway
		Thread.sleep(2000L);
		log.info("completed payment for order " + order.getProductId());
	}
}
