package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartTest {

    public static void main(String[] args) {

        WebDriver driver =
                new ChromeDriver();

        driver.manage()
                .window()
                .maximize();

        // Login
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

        // Open Products
        driver.get(
                "http://localhost:3000/products"
        );

        try {

            Thread.sleep(3000);

        } catch (Exception e) {
        }

        // Open First Product
        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/h4")
        ).click();

        try {

            Thread.sleep(3000);

        } catch (Exception e) {
        }

        // Add To Cart
        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/button[1]")
        ).click();

        System.out.println(
                "Product Added To Cart Successfully"
        );

        driver.quit();
    }
}