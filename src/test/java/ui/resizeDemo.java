package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class resizeDemo {

	public static void main(String[] args){
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		
		WebElement loc = driver.findElement(By.xpath("sdfsdfsd"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(loc, 0, 0).perform();
		
		
	}
}
