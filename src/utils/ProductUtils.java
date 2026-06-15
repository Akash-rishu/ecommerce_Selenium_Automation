package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ProductUtils {

    public static void openProducts(

            WebDriver driver

    ) {

        driver.get(
                "http://localhost:3000/products"
        );
    }

    public static void searchProduct(

            WebDriver driver,

            String product

    ) {

        driver.findElement(
                By.xpath("//input[@type='text']")
        ).sendKeys(product);

        driver.findElement(
                By.xpath("//input[@type='text']")
        ).sendKeys(Keys.ENTER);
    }

    public static void openFirstProduct(

            WebDriver driver

    ) {

        driver.findElement(
                By.tagName("button")
        ).click();
    }
}