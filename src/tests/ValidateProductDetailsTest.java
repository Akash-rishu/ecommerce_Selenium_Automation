package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ValidateProductDetailsTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://localhost:3000/");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[1]/input")).sendKeys("ak418206@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/input")).sendKeys("@Akash1234");
        
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/button")).click();

        driver.get("http://localhost:3000/products");

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }

        List<WebElement> productNames =
                driver.findElements(By.tagName("h4"));

        List<WebElement> prices =
                driver.findElements(By.xpath("//*[contains(text(),'₹')]"));

        System.out.println(
                "Products Found : " +
                productNames.size()
        );

        System.out.println(
                "Prices Found : " +
                prices.size()
        );

        if(productNames.size() > 0 &&
                prices.size() > 0) {

            System.out.println(
                    "Validate Product Listing PASSED"
            );

        } else {

            System.out.println(
                    "Validate Product Listing FAILED"
            );
        }

        driver.quit();
    }
}