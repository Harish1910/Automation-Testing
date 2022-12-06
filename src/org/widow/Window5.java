package org.widow;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Window5 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\eclipse-workspace\\Selenium_Inmakes\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("Redmi phone" + Keys.ENTER);
		
		
	Thread.sleep(3000);
	JavascriptExecutor js =(JavascriptExecutor)driver;
		
       WebElement mob = driver.findElement(By.xpath("(//div[text()='Redmi 9A Sport (Metallic Blue, 32 GB)'])[1]"));
       js.executeScript("arguments[0].click();", mob);
//	WebDriverWait wait = new 	WebDriverWait(driver, 30);
//	wait.until(ExpectedConditions.elementToBeSelected(mob));
//	mob.click();
		String parent = driver.getWindowHandle();
		System.out.println("parent id : " + parent);
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println("all window : " + allwindow);
		for (String winid : allwindow) {
			if (winid!= parent){
				driver.switchTo().window(winid);
				
			}
			
		}
		WebElement price = driver.findElement(By.xpath("(//div[text()='₹7,888'])[1]"));
		String text = price.getText();
		System.out.println(text);
	
	

	
		
		
	}
}


