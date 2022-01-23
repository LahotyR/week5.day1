package week5.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public ChromeDriver driver;
	
	
	@BeforeMethod
	public void preCondition() {
		// Setup driver
		WebDriverManager.chromedriver().setup();
										
		// Launch browser
		driver = new ChromeDriver();
				
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
										
		// Load URL
		driver.get("http://leaftaps.com/opentaps/control/login");
										
		// Maximize browser
		driver.manage().window().maximize();
		
		// 2. Enter UserName
		driver.findElement(By.xpath("(//input[@id='username'])")).sendKeys("DemoCSR");
		
		// 3. Enter password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
				
		// 4. Click on Login Button using Class Locator
		driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();
		
		// 5. Click on CRM/SFA Link
		driver.findElement(By.xpath("//div[@id = 'label']")).click();
	}
	
	@AfterMethod
	public void postCondition() {
		// Close browser
		driver.close();
	}
}
