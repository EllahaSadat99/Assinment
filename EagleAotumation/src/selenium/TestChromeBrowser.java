package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// testing chrome
		
		// set the property for the chrome driver (webdriver.chrome.driver)
		System.setProperty("webdriver.chrome.driver","chromedriver");
		
		// creating object of web driver 
		WebDriver driver = new  ChromeDriver (); 
		
		// methods
		driver.get("https://www.google.com/");
		

	}

}
