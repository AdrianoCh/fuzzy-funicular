package verificationpoints;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

public class LoginVerificationPoint {
	private WebDriver driver;
	
	public LoginVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}
	
	public void checkHelloMessage() {
		if(this.driver.getPageSource().contains("Hi demo")) {
			System.out.println("Entrou");
		} else {
			System.out.println("Falhou");
		}
		//ou fazer com assert
		//assertTrue(this.driver.getPageSource().contains("Hi demo"));
	}
}
