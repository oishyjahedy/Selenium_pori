package MercuryTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MerToursXpaths {
	static String roundTripRadio="//*[@class='book']//input[@value='RoundTrip']";
	static String departureCity="//*[@id='marketCityPair_1']//input[@value='Departure City']";
	static String departureSelectedCity="//*[@id='marketCityPair_1']//a[@value='MAA']";
	static String arrivalCity="//div[@id='marketCityPair_1']//div[@class='right1']//a[@value='PAT']";
	//static String roundTripRadio=

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\QAT\\selenium-drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath(roundTripRadio)).click();
		driver.findElement(By.xpath(departureCity)).click();
		driver.findElement(By.xpath(departureSelectedCity)).click();
		driver.findElement(By.xpath(arrivalCity)).click();
		
	}

}
