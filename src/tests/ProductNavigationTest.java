package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductNavigationTest {

    public static void main(String[] args) {

        WebDriver driver =
                new ChromeDriver();

        driver.manage().window().maximize();

        driver.get(
                "http://localhost:3000/products"
        );

        try {

            Thread.sleep(3000);

        } catch (Exception e) {
        }

        WebElement firstProduct =

                driver.findElement(
                        By.tagName("button")
                );

        firstProduct.click();

        try {

            Thread.sleep(2000);

        } catch (Exception e) {
        }

        String currentUrl =
                driver.getCurrentUrl();

        System.out.println(
                "Current URL : "
                + currentUrl
        );

        if(currentUrl.contains("/product/")) {

            System.out.println(
                    "Verify Product Navigation PASSED"
            );

        } else {

            System.out.println(
                    "Verify Product Navigation FAILED"
            );
        }

        driver.quit();
    }
}