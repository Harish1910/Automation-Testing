package org.sel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\eclipse-workspace\\Selenium_Inmakes\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions a = new Actions(driver);
		WebElement prime = driver.findElement(By.xpath("//img[@alt='Home']"));
		a.moveToElement(prime).perform();
		driver.findElement(By.xpath("(//span[text()='Home & Furniture'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='Bath Linen'])[1]")).click();
		WebElement towel = driver.findElement(By.xpath("(//a[text()='Bath Towels'])[1]"));
		towel.click();

}
}
