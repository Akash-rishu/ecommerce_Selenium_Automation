package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveCartItemTest {

    public static void main(String[] args) {

        WebDriver driver =
                new ChromeDriver();

        driver.manage()
                .window()
                .maximize();
        
        driver.get(
                "http://localhost:3000"
        );

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

        } catch (Exception e) {
        }

        driver.get(
                "http://localhost:3000/cart"
        );

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }

        driver.findElement(
                By.xpath("//button[contains(text(),'Remove')]")
        ).click();

        System.out.println(
                "Item Removed Successfully"
        );

        driver.quit();
    }
}