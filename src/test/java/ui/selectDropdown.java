package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class selectDropdown {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		/*
		 * WebElement selectEle = driver.findElement(By.name("employees_c")); Select
		 * select = new Select(selectEle);
		 * 
		 * select.selectByValue("level1"); Thread.sleep(1000); select.selectByIndex(1);
		 * Thread.sleep(1000); select.selectByVisibleText("51 - 100 employees");
		 */
		
		
		WebElement selectEle = driver.findElement(By.id("multi-select")); 
		Select select = new Select(selectEle);
		select.selectByValue("value1");
		select.selectByIndex(5);
		List<WebElement> selectList = select.getAllSelectedOptions();
		System.out.println(selectList.size());
		select.deselectAll();
		
		select.selectByValue("value1");
		select.selectByIndex(5);
		select.deselectByIndex(5);
		//WebElement first = select.getFirstSelectedOption();
		
	}
}
