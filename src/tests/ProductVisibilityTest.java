package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ProductVisibilityTest {

    public static void main(String[] args) {

        WebDriver driver =
                new ChromeDriver();

        driver.manage()
                .window()
                .maximize();

        driver.get(
                "http://localhost:3000/products"
        );

        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[1]/input")).sendKeys("ak418206@gmail.com");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/input")).sendKeys("@Akash1234");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();
        // WAIT
        try {

            Thread.sleep(3000);

        } catch (Exception e) {

        }

        // PRODUCT TITLES
        List<WebElement> titles =

                driver.findElements(
                        By.tagName("h3")
                );

        // PRODUCT IMAGES
        List<WebElement> images =

                driver.findElements(
                        By.tagName("img")
                );

        // BUTTONS
        List<WebElement> buttons =

                driver.findElements(
                        By.tagName("button")
                );

        System.out.println(
                "Titles : "
                + titles.size()
        );

        System.out.println(
                "Images : "
                + images.size()
        );

        System.out.println(
                "Buttons : "
                + buttons.size()
        );

        // VALIDATION
        if(

                titles.size() > 0 &&

                images.size() > 0 &&

                buttons.size() > 0

        ) {

            System.out.println(
                    "Product Visibility Test Passed"
            );

        } else {

            System.out.println(
                    "Product Visibility Test Failed"
            );
        }

        driver.quit();
    }
}