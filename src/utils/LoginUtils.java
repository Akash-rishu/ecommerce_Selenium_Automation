package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginUtils {
	
	public static void login(WebDriver driver, String email, String password) {
		
		driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div/div[2]/div/form/div[1]/input")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div/div[2]/div/form/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div/div[2]/div/form/button")).click();
		
	}

}
