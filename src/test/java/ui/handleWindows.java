package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class handleWindows {

	public static void main(String[] args){
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.salesforce.com/ap/?ir=1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[5]/div/div[2]/div/div[1]/div/div[1]/div/a")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> list = windows.iterator();
		
		String parent = list.next();
		String child = list.next();
		
		driver.switchTo().window(child);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("hello");
		driver.findElement(By.name("UserLastName")).sendKeys("swrtwt");
		
		driver.switchTo().window(parent);	
		
				
	}
}
