package com.speinnov.logmonitoring;

 
//https://medium.com/@thms.hmm/apache-kafka-json-format-for-broker-logs-76ed71a10b38
/*
 * {"timestamp":"2017-08-13 11:29:11,644","level":"INFO","logger":"kafka.server.KafkaServer","thread":"main","message":"Connecting to zookeeper on localhost:2181"}{"timestamp":"2017-08-13 11:29:11,870","level":"INFO","logger":"kafka.server.KafkaServer","thread":"main","message":"Cluster ID = vuvH5iL2SxyV9YVuD2YjBQ"}
 * 
 * https://github.com/danielwegener/logback-kafka-appender
 * 
 * */
/* 
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
*/
import org.apache.log4j.Layout;
import org.apache.log4j.spi.LoggingEvent;

import java.text.SimpleDateFormat;
import java.util.Date;
 

/**
 * Created by Thomas Hamm on 27.07.17.
 */


public class JsonLayout extends Layout {
 
	public void activateOptions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String format(LoggingEvent event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean ignoresThrowable() {
		// TODO Auto-generated method stub
		return false;
	}
/*
    private final ObjectMapper om;
    private SimpleDateFormat dateFormat;

    private static final String DEFAULT_DATE_FORMAT_PATTERN = "yyyy-MM-dd HH:mm:ss,SSS";

    public JsonLayout() {
        this.om = new ObjectMapper();
        this.om.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        this.dateFormat = new SimpleDateFormat(DEFAULT_DATE_FORMAT_PATTERN);
    }

    public void activateOptions() {
    }

    public boolean ignoresThrowable() {
        return false;
    }

    @Override
    public String format(LoggingEvent loggingEvent) {
        Date timestamp = new Date(loggingEvent.getTimeStamp());

        String stacktrace = null;

        if (loggingEvent.getThrowableStrRep() != null) {
            stacktrace = String.join("\n", loggingEvent.getThrowableStrRep());
        }

        LogItem li = new LogItem(
            this.dateFormat.format(timestamp),
            loggingEvent.getLevel().toString(),
            loggingEvent.getLoggerName(),
            loggingEvent.getThreadName(),
            loggingEvent.getMessage().toString(),
            stacktrace
        );

        String out;

        try {
            out = om.writeValueAsString(li);
        } catch (JsonProcessingException e) {
            return "JsonLayout - ERROR formatting log message\n";
        }

        return out + "\n";
    }

    public void setDatePattern(String pattern) {
        try {
            this.dateFormat = new SimpleDateFormat(pattern);
        } catch (Exception e) {
            this.dateFormat = new SimpleDateFormat(DEFAULT_DATE_FORMAT_PATTERN);
        }
    }
    */
}
