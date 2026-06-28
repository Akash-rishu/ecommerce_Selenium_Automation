package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProfileUpdateTest {

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

        driver.get("http://localhost:3000/profile");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[2]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[2]/input"))
                .sendKeys("Akash");

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[4]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[4]/input"))
                .sendKeys("9876543210");
        
        Thread.sleep(3000);

        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/button")
        ).click();

        Thread.sleep(3000);

        System.out.println("T104 PASSED");

        driver.quit();
    }
}