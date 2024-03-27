package com.deliveryBoy.deliveryBoy.service;

import com.deliveryBoy.deliveryBoy.config.AppConstants;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class kafkaService {

    @Autowired
    private KafkaTemplate<String,String>kafkaTemplate;


    private static final Logger logger = Logger.getLogger(kafkaService.class.getName());

    public boolean updateLocation(String location)
    {
        this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME,location);
        logger.info("This message got printed");
        return true;
    }




}
