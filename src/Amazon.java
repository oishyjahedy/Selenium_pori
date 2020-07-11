import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\QAT\\selenium-drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//div[@class='nav-right']//div//a[2]")).click();
		driver.findElement(By.id("ap_email")).sendKeys("oishy.j@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("amazon123");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.xpath("//input[@type='radio' and @value='email']")).click();
		driver.findElement(By.id("continue")).click();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
