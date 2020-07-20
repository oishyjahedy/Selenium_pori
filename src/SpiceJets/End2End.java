package SpiceJets;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class End2End {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\QAT\\selenium-drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/Default.aspx");
		// select city
		driver.findElement(By.xpath("(//div[@id='marketCityPair_1']//input[@class='select_CTXT'])[1]")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		// select date
		driver.findElement(By.xpath("//a[contains(@class, 'ui-state-highlight')]")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
			System.out.println("its disabled");
			Assert.assertTrue(true);
		}else{
			Assert.assertTrue(false);
		}
		// select passenger
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);

		Select passengers = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		passengers.selectByVisibleText("4");
		String selectedValue =passengers.getFirstSelectedOption().getText();
		System.out.println(selectedValue);
	// currency
		Select currency = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		currency.selectByVisibleText("USD");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
	}
	

}
