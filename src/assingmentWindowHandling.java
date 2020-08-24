import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assingmentWindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\QAT\\selenium-drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		WebElement childWin = driver.findElement(By.xpath("//a[contains(text(), 'Click Here')]"));
		childWin.click();
		Set<String>ids = driver.getWindowHandles();
		Iterator<String>it = ids.iterator();
		String parentId= it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println("child window message");
		System.out.println(driver.findElement(By.xpath("//h3")).getText());
		
		driver.switchTo().window(parentId);
		System.out.println("parent window message");
		System.out.println(driver.findElement(By.xpath("//h3")).getText());
		
		
		
	}

}
