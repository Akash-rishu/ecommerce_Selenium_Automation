package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminDashboardTest {

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

        driver.get("http://localhost:3000/admin");

        Thread.sleep(3000);

        boolean dashboardVisible =
                driver.findElement(By.tagName("body"))
                      .getText()
                      .contains("Dashboard");

        if(dashboardVisible) {
            System.out.println("T110 PASSED");
        } else {
            System.out.println("T110 FAILED");
        }

        driver.quit();
    }
}