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

public class SeleniumCreateOpty {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/chrismile/eclipse-workspace/SeleniumProject/Drivers/geckodriver-v0.32.0-macos.tar");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Test ID TC15
		//Launch and Login to SalesForce Application
		driver.get("https://tekarch.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("chris.mile-z38j@force.com");
		driver.findElement(By.id("password")).sendKeys("Homework#1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Click on opportunities link from the main menu
		WebElement opportunitiesLink = driver.findElement(By.id("Opportunities"));
		opportunitiesLink.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.close();
		
		//Test ID TC16
		//Launch and Login to SalesForce Application
		driver.get("https://tekarch.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("chris.mile-z38j@force.com");
		driver.findElement(By.id("password")).sendKeys("Homework#1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Click on opportunities link from the main menu
		WebElement opportunitiesLink2 = driver.findElement(By.id("Opportunities"));
		opportunitiesLink2.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Click the Create New Opportunity Button
		WebElement newOpportunityButton = driver.findElement(By.id("Opportunity"));
		newOpportunityButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.close();
		
		//Edit new opportunity page
		driver.findElement(By.id("Opportunity Name")).sendKeys("Chris ");
		driver.findElement(By.id("Account Name")).sendKeys("Chris ");
		driver.findElement(By.id("Close Date")).sendKeys("10/20/2022");
		driver.findElement(By.id("Stage")).sendKeys("1 ");
		driver.findElement(By.id("Probability")).sendKeys("1 ");
		driver.findElement(By.id("Lead Source")).sendKeys("SalesForce");
		driver.findElement(By.id("Primary Campaign")).sendKeys("SalesForce ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Test ID TC 17
		//Test ID TC16
		//Launch and Login to SalesForce Application
		driver.get("https://tekarch.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("chris.mile-z38j@force.com");
		driver.findElement(By.id("password")).sendKeys("Homework#1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Click on opportunities link from the main menu
		WebElement opportunitiesLink3 = driver.findElement(By.id("Opportunities"));
		opportunitiesLink3.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Click on opportunities pipeline link from the main menu
		WebElement opportunitiespipelineLink = driver.findElement(By.id("Opportunities Pipeline"));
		opportunitiespipelineLink.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
}