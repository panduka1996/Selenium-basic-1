package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class autoSuggestDropdownList {

	public static void main(String[] args){
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://flightsearchdirect.com/?theme=Mytrip&utm_source=adwords&gclid=Cj0KCQjwnoqLBhD4ARIsAL5JedKryuLabHtjoIpesnPM6S8m4zb00uXzIl2T_Iz2nKrZR405MVmlU6EaAiI_EALw_wcB");
		driver.manage().window().maximize();
		WebElement field = driver.findElement(By.xpath("//input[@placeholder=\"From: City or Airport\"]"));
		//field.click();
		field.sendKeys("sri");
		field.sendKeys(Keys.ARROW_DOWN);
		field.sendKeys(Keys.ENTER);
		
	}
}
