import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\QAT\\selenium-drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("(//div[@class='row1']//input[contains(@id, 'originStation1')])[1]")).click();
		
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
		Select money = new Select(driver.findElement(By.xpath("//select[contains(@id, 'Currency')]")));
		money.selectByValue("USD");
		
	}

}
