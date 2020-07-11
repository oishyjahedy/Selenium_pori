import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\QAT\\selenium-drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flyfrontier.com/");
		WebElement source = driver.findElement(By.xpath("//input[@id='kendoDepartFrom_input']"));
		source.sendKeys("NY");
		for(int i=1; i<4;i++) {
		source.sendKeys(Keys.ARROW_DOWN);
		}
		source.sendKeys(Keys.ENTER);
		WebElement distination = driver.findElement(By.xpath("//input[@id='kendoArrivalTo_input']"));
		distination.sendKeys("Cali"); 
		distination.sendKeys(Keys.ARROW_DOWN);
		
		distination.sendKeys(Keys.ENTER);
		
		
		
		
		
	}

}
