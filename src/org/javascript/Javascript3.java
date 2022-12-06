package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\eclipse-workspace\\Selenium_Inmakes\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement email = driver.findElement(By.id("username"));
		js.executeScript("arguments[0].setAttribute('value','harish1319')", email);
		WebElement pass = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','harish')", pass);
		WebElement login = driver.findElement(By.id("login"));
		js.executeScript("arguments[0].click()", login);
	
	}

}
