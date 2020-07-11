package SpiceJets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn extends LogInXpath {
			

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\QAT\\selenium-drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://book.spicejet.com/Register.aspx");
		driver.findElement(By.xpath(clickTitle)).click();
		driver.findElement(By.xpath(title)).click();
		driver.findElement(By.xpath(firstName)).sendKeys("abcdefg");
		driver.findElement(By.xpath(lastName)).sendKeys("mnop");
		driver.findElement(By.xpath(phoneCodeArrow)).click();
		driver.findElement(By.xpath(phoneCode)).click();
		driver.findElement(By.xpath(phoneNum)).sendKeys("9178374700");
		driver.findElement(By.xpath(passWord)).sendKeys("abcd1234@");
		driver.findElement(By.xpath(confrimPass)).sendKeys("abcd1234@");
		driver.findElement(By.xpath(clickBirthBox)).click();
		driver.findElement(By.xpath(prevYr)).click();
		driver.findElement(By.xpath(birthYr)).click();
		driver.findElement(By.xpath(birthMonth)).click();
		driver.findElement(By.xpath(birthDay)).click();
		driver.findElement(By.xpath(email)).sendKeys("abcd1@gmail.com");
		driver.findElement(By.xpath(checkBox)).click();

	}

}
