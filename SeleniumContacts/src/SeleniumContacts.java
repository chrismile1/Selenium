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
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumContacts {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "/Users/chrismile/eclipse-workspace/SeleniumContacts/Drivers/msedgedriver");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		//Test ID TC25
		
		//Launch and Login to SalesForce Application
		driver.get("https://tekarch.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("chris.mile-z38j@force.com");
		driver.findElement(By.id("password")).sendKeys("Homework#1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("Login")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Click on Contact Tab
		WebElement contactButton = driver.findElement(By.id("Contact"));
		contactButton.click();
		
		//Click on New Button
		WebElement newButton = driver.findElement(By.id("New"));
		newButton.click();
		
		//Enter last name in the last name field
		WebElement lastNameField = driver.findElement(By.name("Last Name"));
		lastNameField.sendKeys("Last Name");
		
		//Enter account name in account field
		WebElement viewName = driver.findElement(By.name("View Name"));
		viewName.sendKeys("View Name");
		
		//Click on save button
		WebElement saveButton = driver.findElement(By.id("Save"));//click on save button 
		saveButton.click();
		
		driver.close();
		
		//Test ID TC26
		//Launch and Login to SalesForce Application
		driver.get("https://tekarch.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("chris.mile-z38j@force.com");
		driver.findElement(By.id("password")).sendKeys("Homework#1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("Login")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

		//Click ON Contact Tab
		//Click on Create New View link
		
		//Enter the <View Name> field in the View Name field
		WebElement viewName26 = driver.findElement(By.name("View Name"));
		viewName26.sendKeys("View Name");
		
		//Enter the <Viiew Unique Name> field in the View Unique Name field
		WebElement viewUniqueName26 = driver.findElement(By.name("View Unique Name"));
		viewUniqueName26.sendKeys("View Unique Name");
		
		//Click on save button
		WebElement saveButton2 = driver.findElement(By.id("Save Button"));
		saveButton2.click();
		
		driver.close();
		
		//Test ID TC27
		//Launch and Login to SalesForce Application
		driver.get("https://tekarch.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("chris.mile-z38j@force.com");
		driver.findElement(By.id("password")).sendKeys("Homework#1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("Login")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Click ON Contact Tab
		//Select 'Recently created' from the drop down list in the right hand side of the 'Recent Contact' frame contact page
		
		driver.close();
		
		//Test ID TC28
		//Launch and Login to SalesForce Application
		driver.get("https://tekarch.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("chris.mile-z38j@force.com");
		driver.findElement(By.id("password")).sendKeys("Homework#1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("Login")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Click ON Contact Tab
		
		//Select 'My Contacts' View from the drop down list in contact page
		
		driver.close();
		
		//Test ID TC 29
		//Launch and Login to SalesForce Application
		driver.get("https://tekarch.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("chris.mile-z38j@force.com");
		driver.findElement(By.id("password")).sendKeys("Homework#1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("Login")).click();
		
		///Click on Contact Tab
		//Click on a <contact name> under the Name field in the Recent Contact Frame
		
		driver.close();
		
		//Test ID TC 30
		//Launch and Login to SalesForce Application
		driver.get("https://tekarch.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("chris.mile-z38j@force.com");
		driver.findElement(By.id("password")).sendKeys("Homework#1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("Login")).click();
		
		//Click on Contacts on the Menu bar
		driver.findElement(By.xpath("//span[text() = 'Menu']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.linkText("Contacts")).click();
		
		//Click on Create New View hyperlink
		WebElement c = driver.findElement(By.partialLinkText("Create New View"));
		c.click();
		
		//Click the View Unique Name (Unique Name: EFGH)
		
		//Click the Save Button
		WebElement saveButton30 = driver.findElement(By.id("Save Button"));
		saveButton30.click();
		
		//Test ID TC 31
		
		//Test ID TC 32
		

		//Click the Save Button
		WebElement saveButton32 = driver.findElement(By.id("Save Button"));
		saveButton32.click();
		
		//Click the New Button
		WebElement newButton32 = driver.findElement(By.id("New Button"));
		newButton32.click();	
	}
}
