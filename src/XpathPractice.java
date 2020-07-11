import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\QAT\\selenium-drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
//using Xpath, copying from html
	/*	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("copying Xpath");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("1236vhg");
		driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'globalContainer\']/div[3]/div/div/div")).getText());
		driver.findElement(By.xpath("//*[@id=\'blueBarDOMInspector\']/div/div[1]/div/div/h1/a")).click();
		*/
// customize Xpath practice..
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("xpathPractice");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123654");
		driver.findElement(By.xpath("//input[contains(@value,'Log In')]")).click();
		//when there is no attribute, use text to identify the element.
		driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]")).click();
		driver.findElement(By.xpath("//a[@title='Go to Facebook Home']")).click();
		
	}

}
