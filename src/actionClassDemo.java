import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClassDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\QAT\\selenium-drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//span[@class='nav-line-2 nav-long-width']"));
		WebElement input = driver.findElement(By.id("twotabsearchtextbox"));
		
		
		a.moveToElement(input).click().keyDown(Keys.SHIFT).sendKeys("world").doubleClick().build().perform();
		//move mouse to specific elements and context-click help to perform right click.
		a.moveToElement(move).contextClick().build().perform();
		
		

	}

}
