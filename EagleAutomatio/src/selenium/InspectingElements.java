package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class InspectingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// set the property of application 
		System.setProperty("webdriver.chrome.driver","chromedriver");
		
		// create new instance of chromeDriver 
		WebDriver driver = new ChromeDriver ();
		
		// URL 
		driver.get("https://www.google.com/");
		
		search.sendKey("java");
	// 
	//	search.submit();
		
		// fined elements 
		driver.findElement(By.name());
		
		
		
		
		// Close the URL 
		driver.close();

	}

}
