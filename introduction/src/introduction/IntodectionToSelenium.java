package introduction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntodectionToSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webderiver.chrome.driver", "C:\\Users\\annas\\Downloads\\chromedriver_win32/chromedrive.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		

	}

}
