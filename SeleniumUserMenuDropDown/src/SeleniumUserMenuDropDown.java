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

public class SeleniumUserMenuDropDown {
	public static void main (String [] args) {
		
	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "/Users/chrismile/eclipse-workspace/SeleniumUserMenuDropDown/Drivers/chromedriver");
	driver.manage().window().maximize();
	
	//Test ID TC05
	//Launch and Login to SalesForce Application
	driver.manage().window().maximize();
	driver.get("https://tekarch.my.salesforce.com/");
	driver.findElement(By.id("username")).sendKeys("chris.mile-z38j@force.com");
	driver.findElement(By.id("password")).sendKeys("Homework#1");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("Login")).click();
	
	
	//Test ID TC06
	//Click on post link on the home page
	driver.findElement(By.linkText("post")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//Click on file link on the home page
	driver.findElement(By.linkText("file")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//Click on Add photo link on the home page
	driver.findElement(By.linkText("Add photo")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//Test ID TC07
	//Click on personal link on the home page
	driver.findElement(By.linkText("personal")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//Click on Login History link on the home page
	driver.findElement(By.linkText("Login History")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//Click on Display & Layout link on the home page
	driver.findElement(By.linkText("Display & Layout")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//Click on Customize My Tabs link on the home page
	driver.findElement(By.linkText("Customize my Tabs")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//Click on Email link on the home page
	driver.findElement(By.linkText("Email")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//Click on email settings link on the home page
	driver.findElement(By.linkText("email settings")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//Click the Save Button
	WebElement saveButton30 = driver.findElement(By.id("Save Button"));
	saveButton30.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//Click the Calendar & Reminders link
	WebElement calendarAndReminders = driver.findElement(By.id("Calendar & Reminders"));
	calendarAndReminders.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//Click the Activity Reminders link
	WebElement activityReminders = driver.findElement(By.id("Activity Reminders"));
	activityReminders.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//Click the Open a test Remainder Button
	WebElement testReminder = driver.findElement(By.id("Open a Test Reminder"));
	testReminder.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.close();
	}
}
