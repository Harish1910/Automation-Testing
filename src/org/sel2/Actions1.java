package org.sel2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\eclipse-workspace\\Selenium_Inmakes\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,5000)");
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//a[contains(text(),' BANK ')]"));
		WebElement dest = driver.findElement(By.xpath("(//h3[@align='center'])[3]"));
		a.dragAndDrop(source, dest).perform();
	}

}
