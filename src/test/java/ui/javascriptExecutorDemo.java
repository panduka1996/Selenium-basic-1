package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class javascriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		
		JavascriptExecutor jexec = (JavascriptExecutor) driver;
		
		//get page title
		String script = "return document.title;";
		String title = (String) jexec.executeScript(script);
		
		System.out.println(title);
		
		//click button
		driver.switchTo().frame("iframeResult");
		jexec.executeScript("myFunction()");
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//change bg color
		WebElement btn = driver.findElement(By.xpath("/html/body/button"));
		jexec.executeScript("arguments[0].style.border='3px solid red'", btn);
		
		driver.navigate().to("https://www.w3schools.com/");
		
		//scroll page
		WebElement scbtn = driver.findElement(By.xpath("//*[@id=\"howto_padding\"]/a"));
		jexec.executeScript("arguments[0].scrollIntoView(true);", scbtn);
		
	}
}
