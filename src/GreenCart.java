import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenCart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\QAT\\selenium-drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//array of vegetable
		String[] veggies = { "Cucumber", "Brocolli", "Brinjal" };
		int n = 0;
		//all products has same elements
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class ='product-name']"));
		for (int i = 0; i < products.size(); i++) {
			//indentify product name, split method divide name into 2 index part
			String[] name = products.get(i).getText().split("-");
			String productName = name[0].trim();
			//convert array to arraylist
			List veggiesList = Arrays.asList(veggies);
			if (veggiesList.contains(productName)) {
				n++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (n == veggies.length) {
					break;
				}
			}
		}
	}

}
