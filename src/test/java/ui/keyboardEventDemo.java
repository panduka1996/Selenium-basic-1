package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class keyboardEventDemo {

	public static void main(String[] args){
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]"));
		
		Actions action = new Actions(driver);
		action.keyDown(ele, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
		WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[6]/pre"));
		
		action.keyDown(ele2,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
				
	}
}
