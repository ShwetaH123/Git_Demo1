package com.selenium.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.Testbase.TestBase;
//import com.selenium.config.Config;

public class TestDemo {
	
	public static TestBase testbase;
	
	public TestDemo() {
		 testbase=new TestBase();
	}

	@BeforeTest
	public void setUp() throws InterruptedException {
		
		testbase.initialization();
		
	}
	
	@Test
	public void login() {
		
		System.out.println("Web is opened");
	}
}
