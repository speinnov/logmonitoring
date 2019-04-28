package com.speinnov.logmonitoring;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

/**
public class KafkaMonitoring {
	private static final Logger LOGGER = LogManager.getLogger(sl4jMonitoring.class.getName());
    
	// merge request
	//https://www.youtube.com/watch?v=9aO4xOlma_k
    
	 public String Sample()
	    {
		 
		 Properties props = new Properties();
		 props.put("bootstrap.servers", "broker1:9092,broker2:9092");
		 props.put("group.id", "CountryCounter");
		 props.put("key.deserializer",
		     "org.apache.kafka.common.serialization.StringDeserializer");
		 props.put("value.deserializer",
		     "org.apache.kafka.common.serialization.StringDeserializer");

		 KafkaConsumer<String, String> consumer =  new KafkaConsumer<String, String>(props);
		 
		 consumer.subscribe(Collections.singletonList("customerCountries")); 
		 consumer.subscribe(Pattern.compile("test.*"));
		 
		 
		 try {
			    while (true) { 1
			        ConsumerRecords<String, String> records = consumer.poll(100); 2
			        for (ConsumerRecord<String, String> record : records) 3
			        {
			            log.debug("topic = %s, partition = %d, offset = %d,"
			                customer = %s, country = %s\n",
			                record.topic(), record.partition(), record.offset(),
			                record.key(), record.value());

			            int updatedCount = 1;
			            if (custCountryMap.countainsValue(record.value())) {
			                updatedCount = custCountryMap.get(record.value()) + 1;
			            }
			            custCountryMap.put(record.value(), updatedCount)

			            JSONObject json = new JSONObject(custCountryMap);
			            System.out.println(json.toString(4)) 4
			        }
			    }
			} finally {
			    consumer.close(); 5
			}
		 
		 while (true) {
			    ConsumerRecords<String, String> records = consumer.poll(100);
			    for (ConsumerRecord<String, String> record : records) {
			        System.out.printf("topic = %s, partition = %s, offset =
			            %d, customer = %s, country = %s\n",
			            record.topic(), record.partition(),
			            record.offset(), record.key(), record.value()); 1
			    }
			    try {
			        consumer.commitSync(); 2
			    } catch (CommitFailedException e) {
			        log.error("commit failed", e) 3
			    }
			}
		 
		 System.out.println("Kafka monitoring");
	        LOGGER.debug("Debug Message Logged !!");
	        LOGGER.info("Info Message Logged !!");
	        LOGGER.debug("Another Debug Message !!");
	        return "sample";
	    }


}
**/
