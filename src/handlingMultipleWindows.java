import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingMultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\QAT\\selenium-drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/gmail/about/");
		WebElement child = driver.findElement(By.xpath("(//a[contains(text(), 'Create an account')])[1]"));
		child.click();
		System.out.println(driver.getTitle());
		Set<String>ids = driver.getWindowHandles();
		Iterator<String>it = ids.iterator();
		String parentId= it.next();
		String childId =it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());


	}

}
