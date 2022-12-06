package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\eclipse-workspace\\Selenium_Inmakes\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		JavascriptExecutor js = (JavascriptExecutor )driver;
		js.executeScript("window.scroll(0,5000)");
		Thread.sleep(3000);
		Select s = new Select(driver.findElement(By.name("country")));
		List<WebElement> options = s.getOptions();
		System.out.println("Toatal no of yr :" +options.size());
		for (WebElement e : options) {
			System.out.println(e.getText());
			
		}


			}
		
		}
	


