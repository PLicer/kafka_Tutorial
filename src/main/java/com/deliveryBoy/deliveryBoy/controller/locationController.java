package com.deliveryBoy.deliveryBoy.controller;

import com.deliveryBoy.deliveryBoy.service.kafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
public class locationController {

    @Autowired
    private kafkaService kser;

    @PostMapping("/update")
    public String updateLocation()
    {

            kser.updateLocation("(" + Math.round(Math.random() * 100) + "," + Math.round(Math.random() * 100) + ")");
        return "Location Updated";

    }
}
