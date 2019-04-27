package com.speinnov.logmonitoring;
/**
 * *
 * Log4j will inspect the "log4j.configurationFile" system property and, if set, will attempt to load the configuration using the ConfigurationFactory that matches the file extension.
If no system property is set the properties ConfigurationFactory will look for log4j2-test.properties in the classpath.
If no such file is found the YAML ConfigurationFactory will look for log4j2-test.yaml or log4j2-test.yml in the classpath.
If no such file is found the JSON ConfigurationFactory will look for log4j2-test.json or log4j2-test.jsn in the classpath.
If no such file is found the XML ConfigurationFactory will look for log4j2-test.xml in the classpath.
If a test file cannot be located the properties ConfigurationFactory will look for log4j2.properties on the classpath.
If a properties file cannot be located the YAML ConfigurationFactory will look for log4j2.yaml or log4j2.yml on the classpath.
If a YAML file cannot be located the JSON ConfigurationFactory will look for log4j2.json or log4j2.jsn on the classpath.
If a JSON file cannot be located the XML ConfigurationFactory will try to locate log4j2.xml on the classpath.
If no configuration file could be located the DefaultConfiguration will be used. This will cause logging output to go to the console.
 **/
//import org.apache.log4j.Logger;
//import org.apache.log4j.LogManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class sl4jMonitoring {
 
// https://www.youtube.com/watch?v=M88sKbRDR8Y

		 private static final Logger LOGGER = LogManager.getLogger(sl4jMonitoring.class.getName());
	     
		    
		 public static void main(String[] args)
		    {
			 
			 String[] names = {"clio","mazda","citroin","berlingo"};
			 for (int l = 0; l < names.length; l++) {
				 
			 
			 System.out.format("********* VHECULE REF : %s! \n", names[l]);
			 LOGGER.info("Info Message Logged !!"+names[l]);
			 }
			 LOGGER.debug("Debug Message Logged !!");
		        LOGGER.info("Info Message Logged !!");
		        LOGGER.error("Another Debug Message !!");
		    }
	 

}
 
