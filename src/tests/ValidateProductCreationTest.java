package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateProductCreationTest {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.get("http://localhost:3000");

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[1]/input"))
                .sendKeys("admin@gmail.com");

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/input"))
                .sendKeys("admin@123");

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/button"))
                .click();

        Thread.sleep(3000);

        driver.get("http://localhost:3000/admin/products");

        Thread.sleep(3000);

        String page = driver.getPageSource();

        if(page.contains("Samsung S25")) {

            System.out.println("T112 PASSED");

        } else {

            System.out.println("T112 FAILED");
        }

        driver.quit();
    }
}