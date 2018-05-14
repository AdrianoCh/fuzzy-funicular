package br.org.dbserver.helloworld.testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCase {
	private WebDriver driver;

	@Before
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();;
		this.driver = new FirefoxDriver();
		this.driver.get("http://demo.virtuemart.net/");
	}
	
	@Test
	public void testMain() {
		
		
		
	}
	
	@After
	public void tearDown() {
		this.driver.quit();
	}
	
}
