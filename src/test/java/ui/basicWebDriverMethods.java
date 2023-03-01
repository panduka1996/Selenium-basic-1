package ui;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basicWebDriverMethods {

	public static String browser = "Chrome";
	public static WebDriver driver;
	
	public static void main(String[] args) {

		if(browser.equals("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		else if(browser.equals("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		} 	
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@class='inventory_list']/div"));
		System.out.println(list);
		
		driver.navigate().to("https://www.sugarcrm.com/");
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		driver.findElement(By.xpath("//*[@id=\"list-item-1\"]/div[2]/p[2]/a")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);

	}

}
