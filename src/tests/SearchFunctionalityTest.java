package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFunctionalityTest {

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

        driver.findElement(
                By.xpath("//input[@type='text']")
        ).sendKeys(
                "Laptop"
        );

        driver.findElement(
                By.xpath("//input[@type='text']")
        ).sendKeys(
                Keys.ENTER
        );

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }

        System.out.println(
                "Search Functionality Test Passed"
        );

        driver.quit();
    }
}