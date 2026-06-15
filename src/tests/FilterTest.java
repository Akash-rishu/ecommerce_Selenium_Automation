package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilterTest {

    public static void main(String[] args) {

        WebDriver driver =
                new ChromeDriver();

        driver.manage()
                .window()
                .maximize();

        driver.get(
                "http://localhost:3000/products"
        );

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }

        WebElement filter =

                driver.findElement(
                        By.id("category")
                );

        filter.click();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        System.out.println(
                "Filter Applied Successfully"
        );

        driver.quit();
    }
}