package org.widow;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window1 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\eclipse-workspace\\Selenium_Inmakes\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone X");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		Actions a = new Actions(driver);
		Robot r = new Robot();
		WebElement iphone = driver.findElement(By.xpath("//img[@alt='Apple iPhone X, 64GB, Space Gray - Fully Unlocked (Renewed Premium)']"));
		a.contextClick(iphone).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String parent = driver.getWindowHandle();
		System.out.println("parent id : " + parent);
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println("all window : " + allwindow);
//		driver.switchTo().window("https://www.amazon.com/Apple-iPhone-64GB-Space-Gray/dp/B08BDTL7NP/ref=sr_1_1?crid=LDAJ4NW3FO95&keywords=iphone+X&qid=1668247043&sprefix=iphone+x%2Caps%2C860&sr=8-1");
	WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		String text = price.getText();
		System.out.println(text);
	}

}
