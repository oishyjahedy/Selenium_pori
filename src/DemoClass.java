import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\QAT\\selenium-drivers\\chromedriver.exe");
	

//Java practice: addition, print string and int together.
	int a =2;
	int b =6;
	int add = a+b;
	System.out.println("My total will be: "+add+" My name is 000.");
	
	//Constructor method practice starts 
	Methods con = new Methods();
	con.headerValidator();
	System.out.println(con.confrim());
	//constructor method ends
	
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://google.com"); 			//hit the chosen url.
	System.out.println(driver.getTitle()); 		//to validated the title of page
	System.out.println(driver.getCurrentUrl());  //to validated the current url.
	
	driver.get("https://yahoo.com");		//from google to yahoo page.
	driver.navigate().to("https://facebook.com");
	driver.navigate().back();				//from yahoo page go back to google.
	
	
	
	//driver.close();
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
