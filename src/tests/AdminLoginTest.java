package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLoginTest {

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
        
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/button"))
        .click();
        
        Thread.sleep(3000);

        if(driver.getCurrentUrl().contains("admin")) {
            System.out.println("T109 PASSED");
        } else {
            System.out.println("T109 FAILED");
        }

        driver.quit();
    }
}