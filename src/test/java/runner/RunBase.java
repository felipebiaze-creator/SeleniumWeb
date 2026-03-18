package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class RunBase {

    public static WebDriver driver;

    public static WebDriver getDriver(){

        return driver;
    }

    public static WebDriver getDriver(String browser) {

        if(driver != null) {
            driver.quit();
        }

         switch (browser) {
             case "chrome":
                 driver = new ChromeDriver();
                 driver.manage().window().maximize();

                 break;
             case "firefox":
                 driver = new FirefoxDriver();
                 driver.manage().window().maximize();


                 break;

             default:
                 throw new IllegalArgumentException("****************Passe um navegador válido");

         }

         if(driver != null){
             driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
         return driver;


     }


    }