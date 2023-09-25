package Base;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Config {

    public static WebDriver driver;

    public static void main (String [] args){

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.get("https://prod.taltektc.com/home/signup");
        driver.findElement(By.xpath("//button[@type='submit']")).click();




        driver.findElement(By.xpath("//form[@id='signup-form']/div[3]/div[2]")).click();
        driver.findElement(By.name("firstName")).sendKeys("mohammad");
        driver.findElement(By.name("lastName")).sendKeys("Ismail");

        driver.findElement(By.name("email")).sendKeys("imamBukhari1@gmail.com");

        driver.findElement(By.name("password")).sendKeys("Bukhari@123");

        driver.findElement(By.name("confirmPassword")).sendKeys("Bukhari@123");
        driver.findElement(By.name("month")).click();

        driver.findElement(By.name("year")).click();
        new Select(driver.findElement(By.name("year"))).selectByVisibleText("1980");
        driver.findElement(By.id("male")).click();
        driver.findElement(By.id("defaultCheck1")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }



    }



