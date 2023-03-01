package ui;

import org.openqa.selenium.By;

import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {

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
		//driver.findElement(By.className("form_input")).sendKeys("standard_user");
		//driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		driver.findElement(withTagName("input").below(password)).click();

	}

}
