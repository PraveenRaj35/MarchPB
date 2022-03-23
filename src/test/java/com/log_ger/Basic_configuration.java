package com.log_ger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Basic_configuration {
	
	static Logger log = Logger.getLogger(Basic_configuration.class);
public static void main(String[] args) {
	PropertyConfigurator.configure("log4j.properties");
	log.debug("debug");
	log.info("informtion");
	log.warn("warining");
	log.error("err");
	log.fatal("fat");
	
}
}
