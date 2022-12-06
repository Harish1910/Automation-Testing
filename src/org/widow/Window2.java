package org.widow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\eclipse-workspace\\Selenium_Inmakes\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("iphone 7");
		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,100)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@title='Apple iPhone 7 Soft Silicon Cases Wow Imagine - Black'])[1]")).click();
		String parent = driver.getWindowHandle();
		System.out.println("parent id : " + parent);
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println("all window : " + allwindow);
		for (String winid : allwindow) {
			if (winid!= parent) {
				driver.switchTo().window(winid);
				
			}
			
		}
		WebElement price = driver.findElement(By.xpath("//span[@class='pdp-final-price']"));
		String text = price.getText();
		System.out.println(text);
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
	}

}
