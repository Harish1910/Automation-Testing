package org.sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\eclipse-workspace\\Selenium_Inmakes\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("harish@gmail.com");
		Thread.sleep(3000);
		WebElement nxt = driver.findElement(By.xpath("//span[text()='Next']"));
		nxt.click();
	}

}
