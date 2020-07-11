package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

 class Exercise01_Junit_Assertion {
	static WebDriver driver;
	//System.setProperty("webdriver.chrome.driver"+driverPath+"D:\\QAT\\selenium-drivers\\chromedriver.exe");
	
 
	@Before
	public void before() {
		System.out.println("Inside before method.");
		System.setProperty("webdriver.chrome.driver","D:\\QAT\\selenium-drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://themes.iamabdus.com/nexa/1.4/basic-forms.html");
		System.out.println(driver.getCurrentUrl());

	}
	@Test
	public void test() {
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("pori");
		driver.findElement(By.xpath("//input[@placeholder='Enter email']")).sendKeys("pori@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("0123654782");
		driver.findElement(By.xpath("//textarea[@placeholder='Your message']")).sendKeys("i have nothing to write in this field. just here to testing and practice.");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='checkbox-10']")).sendKeys(Keys.DELETE);;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='checkbox-10']")).sendKeys(Keys.ENTER);;
		driver.findElement(By.xpath("//form//input[@id='radio-1']")).sendKeys(Keys.DELETE);;
		driver.findElement(By.xpath("//form//input[@id='radio-1']")).sendKeys(Keys.ENTER);
		/*driver.findElement(By.xpath("//input[@name='dateRange']")).click();
		WebElement tables = driver.findElement(By.xpath("(//table[@class='table-condensed'])[1]"));
		List<WebElement> rows = tables.findElements(By.tagName("tr"));
		System.out.println("Number of rows: " + rows.size());
		for (WebElement row : rows) {
			//Find all the cols inside the particular row using the td tag
			List<WebElement> cols = row.findElements(By.tagName("td"));
			
			//Iterate over all the columns inside the particular row
			for (WebElement col : cols) {
				//Print the cell value
				System.out.print("Column value: " + col.getText());
			}
		}*/
		
	}
	@After
	public void after() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		Thread.sleep(2000);//if u want to delay webpages before closing.
		//driver.close();
		
	}
}
