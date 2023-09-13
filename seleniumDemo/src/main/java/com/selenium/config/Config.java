package com.selenium.config;

import java.io.InputStream;
import java.util.Properties;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Config {

	public static Properties prop;
	private static Config instance = null;
	private static final String PROPERTY_FILENAME="config.properties";
	
	private Config() {

	}
	
	public void loadConfig() {
		prop = new Properties();
		try {
			InputStream is = getClass().getClassLoader().getResourceAsStream(PROPERTY_FILENAME);
			prop.load(is);
			log.info("Properties loaded successfully");
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Error loading properties");
		}
	}

	public static Config getInstance() {

		if (instance == null) {
			instance = new Config();
			instance.loadConfig();
		}
		return instance;
	}

	public String getProperty(String key) {

		return (String) prop.getProperty(key);
	}
    
}
