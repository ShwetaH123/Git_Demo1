package com.selenium.Testbase;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.config.Config;
import com.selenium.constants.ConfigKeys;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Config config;
	public static Properties prop;
	public static WebDriverWait wait;
	
	public void initialization() throws InterruptedException {	

		//prop.getProperty("browser");
//		WebDriverManager.chromedriver().setup();
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CA-SWETABHOKARE\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		config = Config.getInstance();
		String URL=config.getProperty(ConfigKeys.appUrl);
		System.out.println(URL);
		driver.navigate().to(URL);
	}
}
