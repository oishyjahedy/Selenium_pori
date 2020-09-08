package New_Module_Ecercise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\QAT\\selenium-drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		// 1. find all the links in this page.
		System.out.println(driver.findElements(By.tagName("a")).size());

		// 2. find all links in footer section
		WebElement footerLink = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerLink.findElements(By.tagName("a")).size());

		// 3. find all links in a particular columb
		WebElement columbLink = footerLink.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columbLink.findElements(By.tagName("a")).size());

		// 4. click every links and check those are working/open
		for (int i = 1; i < columbLink.findElements(By.tagName("a")).size(); i++) {
			String clickToOpenLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columbLink.findElements(By.tagName("a")).get(i).sendKeys(clickToOpenLink);
		} // open all links in separate windows

		// 5. get the title for all child windows, using while loop

		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
