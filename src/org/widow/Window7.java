package org.widow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\eclipse-workspace\\Selenium_Inmakes\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("hp laptop" + Keys.ENTER);
		
		
	Thread.sleep(3000);
	JavascriptExecutor js =(JavascriptExecutor)driver;
	 WebElement laptop = driver.findElement(By.xpath("//div[text()='HP Pavilion Ryzen 5 Hexa Core AMD R5-5600H - (8 GB/512 GB SSD/Windows 11 Home/4 GB Graphics/NVIDIA GeF...']"));
     js.executeScript("arguments[0].click();", laptop);
     String parent = driver.getWindowHandle();
		System.out.println("parent id : " + parent);
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println("all window : " + allwindow);
		for (String winid : allwindow) {
			if (winid!= parent){
				driver.switchTo().window(winid);
				
			}
			
		}
		WebElement price = driver.findElement(By.xpath("(//div[text()='₹62,990'])[1]"));
		String text = price.getText();
		System.out.println("price is :" + text);

		
	}

}
