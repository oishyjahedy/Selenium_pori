import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\QAT\\selenium-drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("this is my code. ");
		driver.findElement(By.name("pass")).sendKeys("12365548s");
		driver.findElement(By.id("u_0_b")).click();
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		
		
		
		
		
		
	}

}
