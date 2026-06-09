package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By email = By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[1]/input");
	By password = By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/input");
	By loginBtn = By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/button");
	
	public void enterEmail(String userEmail) {
		
		driver.findElement(email).sendKeys(userEmail);
	}
	
	public void enterPassword(String userPassword) {
		
		driver.findElement(password).sendKeys(userPassword);
	}
	
	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}
	
	public void login(String userEmail, String userPassword) {
		
		enterEmail(userEmail);
		enterPassword(userPassword);
		clickLogin();
	}
	
}
