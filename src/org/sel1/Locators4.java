package org.sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\elcot\\eclipse-workspace\\Selenium_Inmakes\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("Harish");
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys("Harish");
		WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		address.sendKeys("310 peelamedu coimbatore");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("hari@gmail.com");
		WebElement phno = driver.findElement(By.xpath("//input[@type='tel']"));
		phno.sendKeys("9159155430");
		WebElement radio = driver.findElement(By.name("radiooptions"));
		radio.click();
		WebElement checkbox = driver.findElement(By.id("checkbox1"));
		checkbox.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(3000);
		//WebElement language = driver.findElement(By.xpath("//div[@style='min-height:30px;max-width:200px']"));
		//Select s = new Select(language);
		//s.selectByIndex(3);
		WebElement skills = driver.findElement(By.id("Skills"));
		Select s = new Select(skills);
		s.selectByIndex(4);
		
//		WebElement country = driver.findElement(By.id("select2-country-container"));
//		Select s1 = new Select(country);
//		s1.selectByIndex(4);
		WebElement yrbox = driver.findElement(By.id("yearbox"));
		Select s1 = new Select(yrbox);
		s1.selectByValue("2000");
		
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s2 = new Select(month);
		s2.selectByValue("October");
		
		WebElement day = driver.findElement(By.xpath("//select[@placeholder='Day']"));
		Select s3 = new Select(day);
		s3.selectByVisibleText("19");
		
		driver.findElement(By.id("firstpassword")).sendKeys("Hari123");
		driver.findElement(By.id("secondpassword")).sendKeys("Hari123");
		driver.findElement(By.id("submitbtn")).click();
		
		
		
		
		
}
}
