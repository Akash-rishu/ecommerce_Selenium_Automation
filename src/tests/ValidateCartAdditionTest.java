package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateCartAdditionTest {

    public static void main(String[] args) {

        WebDriver driver =
                new ChromeDriver();

        driver.manage()
                .window()
                .maximize();

        // Login
        driver.get(
                "http://localhost:3000"
        );

        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[1]/input")
        ).sendKeys(
                "ak418206@gmail.com"
        );

        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/input")
        ).sendKeys(
                "@Akash1234"
        );

        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/button")
        ).click();

        try {

            Thread.sleep(3000);

        } catch (Exception e) {
        }

        // Products Page
        driver.get(
                "http://localhost:3000/products"
        );

        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/button")
        ).click();

        try {

            Thread.sleep(2000);

        } catch (Exception e) {
        }

        // Add To Cart
//        driver.findElement(
//                By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/button[1]")
//        ).click();
//
//        try {
//
//            Thread.sleep(2000);
//
//        } catch (Exception e) {
//        }

        // Open Cart
//        driver.get(
//                "http://localhost:3000/cart"
//        );
        driver.findElement(
              By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div[2]")
      ).click();

        try {

            Thread.sleep(3000);

        } catch (Exception e) {
        }

        WebElement cartItem =
                driver.findElement(
                        By.tagName("h3")
                );

        if(cartItem.isDisplayed()) {

            System.out.println(
                    "T089 PASSED - Product Found In Cart"
            );

        } else {

            System.out.println(
                    "T089 FAILED"
            );
        }

        driver.quit();
    }
}