package week5.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import common.BaseClass;

public class CreateLead extends BaseClass{

	@Test (priority = 0)
	public void createLead() {
			
		///Click on Leads tab
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on Create Lead tab
		driver.findElement(By.linkText("Create Lead")).click();
		 
		//Enter all fields under Create Lead section
       // 1. Donot work on Parent Account Field
       // 2.Enter the Birthdate using SendKeys
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("RinkyTest");
		
		// First name
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Rinky");
		
		// Last name
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Test");
				
		// Select source from drop-down
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select option1 = new Select(source);
		option1.selectByVisibleText("Existing Customer");
		
		// Marketing Campaign
		WebElement campaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select option2 = new Select(campaign);
		option2.selectByIndex(4);
		
		// First Name Local
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Rinky");
		
		// Last Name Local
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Test");
		
		// Salutation
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms.");
		
		// Birth date
		WebElement birthDate = driver.findElement(By.id("createLeadForm_birthDate"));
		birthDate.sendKeys("01/01/20");
		
		// Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Dr.");
		
		// Department
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		
		// Annual Revenue
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_annualRevenue']")).sendKeys("123.00");
		
		//Preferred Currency
		WebElement currency = driver.findElement(By.xpath("//select[@id = 'createLeadForm_currencyUomId']"));
		Select option3 = new Select(currency);
		int size = option3.getOptions().size();
		option3.selectByIndex(size-10);
		
		// Industry
		WebElement industry = driver.findElement(By.xpath("//select[@name = 'industryEnumId']"));
		Select option4 = new Select(industry);
		int size2 = option4.getOptions().size();
		option4.selectByIndex(size2-12);
		
		// No. of employees
		driver.findElement(By.xpath("//input[@id='createLeadForm_numberEmployees']")).sendKeys("5");
		
		// Ownership
		WebElement ownership = driver.findElement(By.xpath("//select[@id = 'createLeadForm_ownershipEnumId']"));
		Select option5 = new Select(ownership);
		option5.selectByVisibleText("LLC/LLP");
		
		//SIC Code
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_sicCode']")).sendKeys("SIC Code");
		
		//Ticker Symbol
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_tickerSymbol']")).sendKeys("ABC");
		
		//Description
		driver.findElement(By.xpath("//textarea[@id = 'createLeadForm_description']")).sendKeys("Test Description");
		
		//Important Note
		driver.findElement(By.xpath("//textarea[@id = 'createLeadForm_importantNote']")).sendKeys("Test Important Note");
		
		// Enter all fields under Contact Information	
		// Country Code
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_primaryPhoneCountryCode']")).sendKeys("21");
		
		// Area Code
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_primaryPhoneAreaCode']")).sendKeys("022");
		
		// Phone Number
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_primaryPhoneNumber')]")).sendKeys("1234567890");
		
		// Extension
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_primaryPhoneExtension']")).sendKeys("123");
		
		// Person to ask for
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_primaryPhoneAskForName']")).sendKeys("Rinky");
		
		// E-mail Address
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_primaryEmail']")).sendKeys("rinky.test@yopmail.com");
		
		// Web URL
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_primaryWebUrl']")).sendKeys("www.google.com");
		
		// Enter all fields under Primary Address
		// To Name
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_generalToName']")).sendKeys("PK");
		
		// Attention Name
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_generalAttnName']")).sendKeys("RL");
		
		// Address Line 1
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_generalAddress1']")).sendKeys("Electronic city");
		
		// Address Line 2
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_generalAddress1']")).sendKeys("Koramangala");
		
		// City
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_generalCity']")).sendKeys("Bengaluru");
		
		// State/Province
		WebElement state = driver.findElement(By.xpath("//select[@id = 'createLeadForm_generalStateProvinceGeoId']"));
		Select option6 = new Select(state);
		option6.selectByValue("GU");
		
		// Zip/Postal Code
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_generalPostalCode']")).sendKeys("785");
		
		// Country
		
		// Zip/Postal Code extension
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_generalPostalCodeExt']")).sendKeys("587");
		
		// Get the Firstname and print it	  
		String fName = firstName.getAttribute("value");
		System.out.println("First Name is: " + fName);

		// Click on Create Lead button
		driver.findElement(By.name("submitButton")).click();
		
		 
		// Get and Verify the Title of the resulting Page(View Lead)
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);

	}

}
