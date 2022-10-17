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

public class SeleniumLeads {

	public static void main(String[] args) {

			System.setProperty("webdriver.gecko.driver", "/Users/chrismile/eclipse-workspace/SeleniumProject/Drivers/geckodriver-v0.32.0-macos.tar");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
			//Test ID TC 1
			//Launch and Login to SalesForce Application
			driver.get("https://tekarch.my.salesforce.com/");
			driver.findElement(By.id("username")).sendKeys("chris.mile-z38j@force.com");
			driver.findElement(By.id("password")).sendKeys("Homework#1");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			//Click leads tab link from Home Page
			
			//Click the Go Button
			WebElement goButton = driver.findElement(By.id("Go"));
			goButton.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			//Click the New Button
			WebElement newButton = driver.findElement(By.id("New"));
			newButton.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.findElement(By.id("Last Name")).sendKeys("ABCD");
			driver.findElement(By.id("Company Name")).sendKeys("ABCD");
			
			//Click the Save Button
			WebElement saveButton = driver.findElement(By.id("Save"));
			saveButton.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.close();
	}
}