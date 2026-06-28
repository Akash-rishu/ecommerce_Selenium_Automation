package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveCheckoutFlowTest {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

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
        
        Thread.sleep(3000);

        // Open Cart
        driver.get("http://localhost:3000/cart");

        Thread.sleep(2000);

        // Click Checkout
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/button"))
                .click();

        Thread.sleep(2000);

        // Place Order
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/button"))
                .click();

        Thread.sleep(3000);

        String url = driver.getCurrentUrl();

        if (url.contains("orders") || url.contains("success")) {
            System.out.println("T098 PASSED");
        } else {
            System.out.println("T098 FAILED");
        }

        driver.quit();
    }
}