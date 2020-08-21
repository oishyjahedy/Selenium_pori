import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class fluentWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\QAT\\selenium-drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
		driver.findElement(By.xpath("//a[contains(text(), 'Example 1')]")).click();
		driver.findElement(By.xpath("//button")).click();
		Wait<WebDriver>wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);

				WebElement foo=wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					if(driver.findElement(By.xpath("//div[@id='finish']//h4")).isDisplayed()) {
					return	driver.findElement(By.xpath("//div[@id='finish']//h4"));
				}
					else {
						return null;}
					}
				});
	System.out.println(driver.findElement(By.xpath("//div[@id='finish']//h4")).getText());
	
		

	}

}
