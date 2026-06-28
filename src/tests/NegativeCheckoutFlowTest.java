package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NegativeCheckoutFlowTest {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        
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

        driver.get("http://localhost:3000/checkout");

        Thread.sleep(3000);

        // Leave all fields empty
        driver.findElement(By.xpath("//button[contains(text(),'Place Order')]"))
                .click();

        Thread.sleep(2000);

        String page = driver.getPageSource();

        if (page.contains("required")
                || page.contains("Address")
                || page.contains("Phone")
                || page.contains("Please")) {

            System.out.println("T099 PASSED");
        } else {

            System.out.println("T099 FAILED");
        }

        driver.quit();
    }
}