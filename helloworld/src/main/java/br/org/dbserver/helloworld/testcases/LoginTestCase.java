package br.org.dbserver.helloworld.testcases;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import verificationpoints.LoginVerificationPoint;

public class LoginTestCase {
	public WebDriver driver;
	private LoginVerificationPoint verificationPoint;

	@Before
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();;
		this.driver = new FirefoxDriver();
		this.driver.get("http://demo.virtuemart.net/");
		
		this.verificationPoint = new LoginVerificationPoint(driver);
		
	}
	
	@Test
	public void testMain() {
		String usuario = "demo";
		String senha = "demo";
 		WebElement usernameTextField = this.driver.findElement(By.id("modlgn-username"));
		usernameTextField.sendKeys(usuario);
		
		WebElement passwordTextField = this.driver.findElement(By.id("modlgn-passwd"));
		passwordTextField.sendKeys(senha);
		
		WebElement buton = this.driver.findElement(By.name("Submit"));
		buton.click();
		
		verificationPoint.checkHelloMessage();
	}


	
	@After
	public void tearDown() {
		this.driver.quit();
	}
	
}
