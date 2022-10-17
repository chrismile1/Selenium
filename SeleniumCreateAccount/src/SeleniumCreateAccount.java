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

public class SeleniumCreateAccount {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "/Users/chrismile/eclipse-workspace/SeleniumProject/Drivers/geckodriver-v0.32.0-macos.tar");
		driver.manage().window().maximize();
		
		//Test ID TC 10

		//Launch and Login to SalesForce Application
		driver.get("https://tekarch.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("chris.mile-z38j@force.com");
		driver.findElement(By.id("password")).sendKeys("Homework#1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.close();
		
		//Test ID TC 12
		//Launch and Login to SalesForce Application
		driver.get("https://tekarch.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("chris.mile-z38j@force.com");
		driver.findElement(By.id("password")).sendKeys("Homework#1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Click on Accounts link on the home page
		driver.findElement(By.linkText("Accounts")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Select the <view name> from the view drop down list on the account page. Click the Edit link the accounts page.
		driver.close();
		
		//Test ID TC 13
		//Launch and Login to SalesForce Application
		driver.get("https://tekarch.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("chris.mile-z38j@force.com");
		driver.findElement(By.id("password")).sendKeys("Homework#1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Click on Accounts link on the home page
		driver.findElement(By.linkText("Accounts")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("Account")).sendKeys("Account name");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Click on Merge Accounts link on the home page
		driver.findElement(By.linkText("Merge")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Click the OK Button
		WebElement okButton = driver.findElement(By.id("OK"));
		okButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.close();
		
		//Test ID TC 13
		//Launch and Login to SalesForce Application
		driver.get("https://tekarch.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("chris.mile-z38j@force.com");
		driver.findElement(By.id("password")).sendKeys("Homework#1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Click on Accounts link on the home page
		driver.findElement(By.linkText("Accounts")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Click the Save Button
		WebElement saveButton = driver.findElement(By.id("Save"));
		saveButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.close();
	}
}
