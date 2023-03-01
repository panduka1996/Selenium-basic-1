package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class webTableDemo {

	public static void main(String[] args){
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
        //WebElement frame = driver.findElement(By.id("iframe"));
		//driver.switchTo().frame(frame);
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		int rowCount = rows.size();
		
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td"));
		int columnCount = columns.size();

		for(int i=2;i<=rowCount;i++) {
			for(int j=1;j<=columnCount;j++) {
				String value = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+ i +"]/td["+ j +"]")).getText();
				System.out.print(value + " ");
			}
			System.out.println();
		}

		
	}
}
