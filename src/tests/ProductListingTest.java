package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ProductListingTest {

    public static void main(String[] args) {

        WebDriver driver =
                new ChromeDriver();

        driver.manage()
                .window()
                .maximize();

        // OPEN APPLICATION
        driver.get(
                "http://localhost:3000/products"
        );
        
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[1]/input")).sendKeys("ak418206@gmail.com");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/input")).sendKeys("@Akash1234");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();

        // WAIT
        try {

            Thread.sleep(3000);

        } catch (Exception e) {

        }

        // GET PRODUCTS
        List<WebElement> products =

                driver.findElements(
                        By.cssSelector("div")
                );

        System.out.println(
                "Total Products : "
                + products.size()
        );

        // VALIDATION
        if(products.size() > 0) {

            System.out.println(
                    "Product Listing Test Passed"
            );

        } else {

            System.out.println(
                    "Product Listing Test Failed"
            );
        }

        driver.quit();
    }
}