package searchModule;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class ExactKeyword {
		
	public static void main(String[] args) throws Exception {

        WebDriver driver =
                new ChromeDriver();

        driver.get(
                "http://localhost:3000/home"
        );

        driver.manage()
                .window()
                .maximize();
        
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[1]/input")).sendKeys("ak418206@gmail.com");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/input")).sendKeys("@Akash1234");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();
        
        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(100)
                );
        
        WebElement searchBox =
                wait.until(

                        ExpectedConditions
                                .visibilityOfElementLocated(

                                        By.xpath(
                                                "//input[@placeholder='Search for products, brands and more']"
                                        )
                                )
                );

        /* Full Key Search */
//        searchBox.sendKeys(
//                "realme GT 7T"
//        );
        
        /* Partial Key Search */
//        searchBox.sendKeys(
//                "realme"
//        );
        
        /* Random Key Search */
        searchBox.sendKeys(
                "xyz"
        );
        
        Thread.sleep(2000);

        searchBox.sendKeys(
                Keys.ENTER
        );

        wait.until(

                ExpectedConditions.urlContains(
                        "products"
                )
        );

        // PRINT URL
        System.out.println(
                driver.getCurrentUrl()
        );

        // VERIFY WEBSITE
        if (
                driver.getCurrentUrl()
                        .contains("products")
        ) {

            System.out.println(
                    "Search Navigation Passed"
            );
        } else {

            System.out.println(
                    "Search Failed"
            );
        }

        // WAIT 5 SEC TO SEE RESULT
        Thread.sleep(5000);

        driver.quit();
    }
}
