package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver" , "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/datepicker");
		
		//  date picker element box
		WebElement dateField =  driver.findElement(By.id("datepicker"));
		dateField.sendKeys("01/25/2022");
		dateField.sendKeys(Keys .ENTER);
		

	}

}
