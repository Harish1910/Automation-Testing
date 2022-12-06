package org.widow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\eclipse-workspace\\Selenium_Inmakes\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("mask" + Keys.ENTER);
		
		
	Thread.sleep(3000);
	JavascriptExecutor js =(JavascriptExecutor)driver;
		
       WebElement mask = driver.findElement(By.xpath("(//a[@rel='noopener noreferrer'])[1]"));
       js.executeScript("arguments[0].click();", mask);
       String parent = driver.getWindowHandle();
		System.out.println("parent id : " + parent);
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println("all window : " + allwindow);
		for (String winid : allwindow) {
			if (winid!= parent){
				driver.switchTo().window(winid);
				
			}
			
		}
		JavascriptExecutor jc = (JavascriptExecutor)driver;
		WebElement pincode = driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']"));
		jc.executeScript("arguments[0].setAttribute('value','641004')", pincode);
		Object txt = jc.executeScript("return arguments[0].getAttribute('value')", pincode);
		System.out.println(txt);
		
		
		
	}

}
