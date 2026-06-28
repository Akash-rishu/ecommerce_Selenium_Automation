package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProductTest {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Login as Admin
        driver.get("http://localhost:3000");

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[1]/input"))
                .sendKeys("admin@gmail.com");

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/input"))
                .sendKeys("admin@123");

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/button"))
                .click();

        Thread.sleep(3000);

        // Open Add Product Page
        driver.get("http://localhost:3000/add-product");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/form/div[1]/input"))
                .sendKeys("Samsung S25");

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/form/div[2]/textarea"))
                .sendKeys("Latest Samsung Smartphone");

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/form/div[4]/div[1]/input"))
                .sendKeys("65000");

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/form/div[4]/div[2]/input"))
                .sendKeys("50");

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/form/div[5]/select"))
                .sendKeys("Mobiles");

        // Upload Image
//        driver.findElement(By.name("image"))
//                .sendKeys("\"C:\\Users\\ak418\\Downloads\\Screenshot 2026-06-28 154236.jpg\"");
        
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/form/button"))
                .click();

        Thread.sleep(3000);

        System.out.println("T111 PASSED");

        driver.quit();
    }
}