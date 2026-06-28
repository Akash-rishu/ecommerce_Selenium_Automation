package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyOrdersNavigationTest {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://localhost:3000");

        // Login
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
        
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div[5]/div")).click();
        Thread.sleep(2000);

        // Open My Orders
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div[5]/div[2]/div[2]")).click();

        Thread.sleep(3000);

        if(driver.getCurrentUrl().contains("my-orders")) {
            System.out.println("T105 PASSED");
        } else {
            System.out.println("T105 FAILED");
        }

        driver.quit();
    }
}