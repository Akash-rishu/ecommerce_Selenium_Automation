package searchModule;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchBox {
	
	public static void main(String[] args) {
		WebDriver driver =
                new ChromeDriver();

        driver.get(
                "http://localhost:3000/home"
        );

        driver.manage()
                .window()
                .maximize();
        
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[1]/input")).sendKeys("ak418206@gmail.com");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/input")).sendKeys("@Akash1234");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();
        
        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(100)
                );
        WebElement searchBox =
                wait.until(

                        ExpectedConditions
                                .visibilityOfElementLocated(

                                        By.xpath(
                                                "//input[@placeholder='Search for products, brands and more']"
                                        )
                                )
                );

		if(searchBox.isDisplayed()) {

		    System.out.println(
		            "Search box visible"
		    );
		}
		
		driver.close();
	}

}
