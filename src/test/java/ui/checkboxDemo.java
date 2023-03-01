package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class checkboxDemo {

	public static void main(String[] args){
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.name("doi"));
		Actions action = new Actions(driver);
		action.moveToElement(ele);
		action.perform();
		
		driver.findElement(By.name("interest_market_c")).click();
		driver.findElement(By.name("interest_market_c")).isSelected();
		
		List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(list.size());
		
				
	}
}
