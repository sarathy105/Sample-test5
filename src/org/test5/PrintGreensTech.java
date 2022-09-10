package org.test5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintGreensTech {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\eclipse-workspace Selinium\\\\Selenium Test 6\\\\driver\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement txt = driver.findElement(By.xpath("//p[@class='course-desc']"));
		String tx= txt.getText();
	System.out.println(tx);
	}

}
