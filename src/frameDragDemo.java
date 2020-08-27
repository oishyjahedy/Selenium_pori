import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameDragDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\QAT\\selenium-drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
	
		//find how many frame in this page
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//switch to frame
		//switching by frame index
	//driver.switchTo().frame(0); 
		//switching by web-element
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		

	}

}
