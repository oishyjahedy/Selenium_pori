package com.test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;
 
  public class Demo01_JUnitAnnotaions {
	static WebDriver driver;
	//System.setProperty("webdriver.chrome.driver"+driverPath+"D:\\QAT\\selenium-drivers\\chromedriver.exe");
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Inside before class method.");
		
	}
 
	@Before
	public void before() {
		System.out.println("Inside before method.");
		System.setProperty("webdriver.chrome.driver","D:\\QAT\\selenium-drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/");

	}
 
	@Test
	public void test() throws InterruptedException {
		System.out.println("Inside test method.");
		//Fetch the page title
		String pageTitle = driver.getTitle();
		System.out.println("Page title: " + pageTitle);
		driver.findElement(By.xpath("//div[@class='header-right-content']//a[@href='https://login.salesforce.com/']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("abcdefgijk");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("mnbvc123!");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		String messages = driver.findElement(By.xpath("//form[@name='login']//div[@class='loginError']")).getText();
		System.out.println(messages);
		String expectedMessages ="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		Assert.assertEquals(messages, expectedMessages);
		
		driver.switchTo().frame(1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().parentFrame();
	}
 
	@After
	public void after() throws InterruptedException {
		System.out.println("Inside after method.");
		//Close the browser
		Thread.sleep(2000);
		//driver.close();

	}
 
	@AfterClass
	public static void afterClass() {
		System.out.println("Inside after class method.");
	}
}
