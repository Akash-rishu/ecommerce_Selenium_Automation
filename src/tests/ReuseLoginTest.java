package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.LoginUtils;

public class ReuseLoginTest {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/");
		
		LoginUtils.login(driver, "admin@gmail.com", "admin@123");
		
		System.out.println("Reusable login Utility Passed");
		
		driver.quit();
	}

}
