package com.sliit.mtit.microservice.orderservice.controller;

import com.sliit.mtit.microservice.orderservice.dto.OrderRequest;
import com.sliit.mtit.microservice.orderservice.dto.OrderResponse;
import com.sliit.mtit.microservice.orderservice.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;

    @PostMapping (consumes = "application/json", produces = "application/json")
    public @ResponseBody OrderResponse createOrder(@RequestBody OrderRequest request){

        System.out.println("Order Details : " + request);

//        var orderResponse = new OrderResponse();
//        orderResponse.setOrderId(UUID.randomUUID().toString());
//        orderResponse.setMessage("Successfully created the order");

        return orderService.createOrder(request);
    }

}
