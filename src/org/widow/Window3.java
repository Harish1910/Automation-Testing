package org.widow;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\eclipse-workspace\\Selenium_Inmakes\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homedepot.com/");
		driver.findElement(By.xpath("//input[@id='headerSearch']")).sendKeys("celling fan");
		driver.findElement(By.xpath("//button[@title='Submit Search']")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,200)");
		Thread.sleep(2000);
		WebElement fan = driver.findElement(By.xpath("(//img[@title='Merwry 52 in. Integrated LED Indoor Matte Black Ceiling Fan with Light Kit and Remote Control'])[1]"));
		fan.click();
	}

}
