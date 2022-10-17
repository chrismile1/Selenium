import java.util.concurrent.*;
import java.lang.*;
import java.time.Duration;
import static java.lang.Thread.currentThread;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SFDCLogin extends Thread {

		public static void main(String[] args) throws InterruptedException  {
			
			//Login Error Message 1 Firefox

			System.setProperty("webdriver.gecko.driver", System.getProperty("/Users/chrismile/eclipse-workspace/SeleniumProject/Drivers/geckodriver"));
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
			driver.get("https://tekarch.my.salesforce.com/");
			driver.findElement(By.id("username")).sendKeys("chris.mile-z38j@force.com");
			driver.findElement(By.id("password")).sendKeys("");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.findElement(By.id("Login")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.close();
			
			//Login To SalesForce 2 Firefox
			//Chrome
			WebDriver driver2 = new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver", "/Users/chrismile/eclipse-workspace/SeleniumProject/Drivers/geckodriver-v0.32.0-macos.tar");
			
			driver2.get("https://tekarch.my.salesforce.com/");
			driver2.findElement(By.id("username")).sendKeys("chris.mile-z38j@force.com");
			driver2.findElement(By.id("password")).sendKeys("Homework#1");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver2.findElement(By.id("Login")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver2.close();
			
			//Forgot Password 4-B
			WebDriver driver5 = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "/Users/chrismile/eclipse-workspace/SeleniumProject/Drivers/chromedriver");
			driver5.get("https://tekarch.my.salesforce.com/");
			driver5.findElement(By.id("username")).sendKeys("123");
			driver5.findElement(By.id("password")).sendKeys("22131");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver5.findElement(By.id("Login")).click();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver5.close();
			
		}
}
