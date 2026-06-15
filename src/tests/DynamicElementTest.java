package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DynamicElementTest {

    public static void main(String[] args) {

        WebDriver driver =
                new ChromeDriver();

        driver.manage()
                .window()
                .maximize();

        driver.get(
                "http://localhost:3000/products"
        );

        WebDriverWait wait =

                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(10)
                );

        wait.until(

                ExpectedConditions
                        .visibilityOfElementLocated(

                                By.tagName("h3")
                        )
        );

        System.out.println(
                "Dynamic Elements Loaded Successfully"
        );

        driver.quit();
    }
}