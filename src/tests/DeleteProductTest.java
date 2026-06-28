package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteProductTest {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://localhost:3000/admin/products");

        Thread.sleep(3000);

        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[1]/div[2]/button[2]")
        ).click();

        Thread.sleep(2000);

        driver.switchTo().alert().accept();

        Thread.sleep(2000);

        System.out.println("T114 PASSED");

        driver.quit();
    }
}