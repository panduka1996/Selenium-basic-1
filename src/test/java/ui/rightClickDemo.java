package ui;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class rightClickDemo {

	public static void main(String[] args){
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.c-sharpcorner.com/UploadFile/65fc13/types-of-database-management-systems/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		action.contextClick().perform();
		
		
		
	}
}
