package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenLoginTest {

    public static void main(String[] args) throws Exception {

        String[][] data = {
                {"admin@gmail.com","admin@123"},
                {"user@gmail.com","123456"},
                {"ak418206@gmail.com","@Akash1234"}
        };

        for(String[] row : data){

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("http://localhost:3000");

            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[1]/input"))
                    .sendKeys(row[0]);

            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/input"))
                    .sendKeys(row[1]);

            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/button"))
                    .click();

            Thread.sleep(3000);

            System.out.println("Executed for : " + row[0]);

            driver.quit();
        }
    }
}