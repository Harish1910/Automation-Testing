package org.sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\eclipse-workspace\\Selenium_Inmakes\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://inmakesedu.com/");
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement h1 = driver.findElement(By.xpath("//h1[contains(text(),'Learning ')]"));
		String text = h1.getText();
		System.out.println(text);
		//Object txt = js.executeScript("return arguments[0].getAttribute('value')", h1);
		//System.out.println(txt);
		

}
}
