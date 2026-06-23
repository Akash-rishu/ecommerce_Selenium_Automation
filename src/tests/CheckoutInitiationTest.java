package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutInitiationTest {

    public static void main(String[] args) {

        WebDriver driver =
                new ChromeDriver();

        driver.manage()
                .window()
                .maximize();

        // Login
        driver.get("http://localhost:3000");

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
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Open Cart
        driver.get(
                "http://localhost:3000/cart"
        );

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click Checkout
        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/button")
        ).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String currentUrl =
                driver.getCurrentUrl();

        if(currentUrl.contains("checkout")) {

            System.out.println(
                    "T096 PASSED"
            );

        } else {

            System.out.println(
                    "T096 FAILED"
            );
        }

        driver.quit();
    }
}