package org.test5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TxtFacebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace Selinium\\Selenium Test 5\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtuser = driver.findElement(By.id("email"));
		 txtuser.sendKeys("samplename_123@gamail.com");
		String tx=  txtuser.getAttribute("value");	 
		System.out.println(tx);
		WebElement txtpass = driver.findElement(By.id("pass"));
		 txtpass.sendKeys("Samplepassword");
		String txt=  txtpass.getAttribute("value");	 
		System.out.println(txt);
		driver.findElement(By.xpath("//a[@id='u_0_0_7h']")).click();
		driver.findElement(By.name("firstname")).sendKeys("sample@123");
		driver.findElement(By.name("lastname")).sendKeys("sample_12");

		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sample@123");
		WebElement element = driver.findElement(By.id("day"));
		Select s=new Select(element);
		s.selectByIndex(2);

		
	
	}

}
