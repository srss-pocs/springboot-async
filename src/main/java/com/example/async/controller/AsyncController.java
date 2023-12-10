package com.example.async.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.async.dto.OrderDTO;
import com.example.async.service.OrderFulfillmentService;

@RestController
@RequestMapping("/api/orders")
public class AsyncController {


    @Autowired
    private OrderFulfillmentService service;

    @PostMapping
    public ResponseEntity<OrderDTO> processOrder(@RequestBody OrderDTO order) throws InterruptedException {
    	//Synchronous
    	service.processOrder(order); 
        //Asynchronous
        service.notifyUser(order);
        service.assignVendor(order);
        service.packaging(order);
        service.assignDeliveryPartner(order);
        service.assignTrailerAndDispatch(order);
        return ResponseEntity.ok(order);
    }
}
