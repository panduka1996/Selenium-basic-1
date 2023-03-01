package ui;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class demoIframe {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		//WebElement frame = driver.findElement(By.id("iframeResult"));
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().sendKeys("hello");
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("dsfdsf");
		alert.accept();
		
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
				
	}
}
