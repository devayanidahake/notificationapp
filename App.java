package com;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.annotations.Test; 
import org.openqa.selenium.chrome.ChromeOptions; 
 
public class App 
{     
	@Test          
	public static void main(String[] args) throws InterruptedException {
                             
		System.setProperty("webdriver.chrome.driver","chromedriver");             
		
		ChromeOptions chromeOptions = new ChromeOptions();             
		
//	 chromeOptions.addArguments("--headless");
		WebDriver driver = new ChromeDriver(chromeOptions);                          
		
		System.out.println("Hi, Welcome to Edureka's certification project");
                                       
		driver.get("http://192.168.56.102:8091/notificationapp-1/devices");                          
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);   
		
		Thread.sleep(1000);
				
		driver.quit();    
	}           
} 