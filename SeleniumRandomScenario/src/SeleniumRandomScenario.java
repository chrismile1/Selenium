import java.util.concurrent.*;
import java.lang.*;
import java.time.Duration;
import static java.lang.Thread.currentThread;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumRandomScenario {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "/Users/chrismile/eclipse-workspace/SeleniumContacts/Drivers/msedgedriver");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		//Test ID TC 33
		//Launch and Login to SalesForce Application
		driver.get("https://tekarch.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("chris.mile-z38j@force.com");
		driver.findElement(By.id("password")).sendKeys("Homework#1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("Login")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Click on Home Tab
		WebElement element = driver.findElement(By.id("Home")); 
		element.sendKeys(Keys.TAB);
		element.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Click on the FirstName LastName link in the home page
		
		driver.close();
		
		//Test ID TC 34
		//Launch and Login to SalesForce Application
		driver.get("https://tekarch.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("chris.mile-z38j@force.com");
		driver.findElement(By.id("password")).sendKeys("Homework#1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("Login")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Click on Home Tab
		
		//Click on the FirstName LastName link at the left hand side of the home page
		
		//Click on the 'Edit Profile' icon near Contact
		
		//Click on the 'About'tab in the popup
		
		//Edit the LastName to 'Abcd' and click savell button
		
		//Test ID TC 35
		
		//Click on Save button 
		WebElement saveButton = driver.findElement(By.id("Save"));//click on save button 
		saveButton.click();

		driver.close();
	}

}
