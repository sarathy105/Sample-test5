package org.test5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDebug {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace Selinium\\Selenium Test 5\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com ");
		driver.manage().window().maximize();	

		WebElement btncreate = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		btncreate.click();
		Thread.sleep(4000);
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("sample name");
		WebElement lasttname = driver.findElement(By.name("lastname"));
		lasttname.sendKeys("name sample");
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("sample@yahoo.co.in");
		WebElement remail = driver.findElement(By.name("reg_email_confirmation__"));
		remail.sendKeys("sample@yahoo.co.in");
		WebElement btn = driver.findElement(By.xpath("//button[@name='websubmit']"));
		btn.click();
			
		
		
		
		
	}

}
