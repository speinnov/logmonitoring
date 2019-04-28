package com.speinnov.logmonitoring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class KafkaMonitoring {
	private static final Logger LOGGER = LogManager.getLogger(sl4jMonitoring.class.getName());
    
    
	 public String Sample()
	    {
		 System.out.println("Kafka monitoring");
	        LOGGER.debug("Debug Message Logged !!");
	        LOGGER.info("Info Message Logged !!");
	        LOGGER.debug("Another Debug Message !!");
	        return "sample";
	    }


}
