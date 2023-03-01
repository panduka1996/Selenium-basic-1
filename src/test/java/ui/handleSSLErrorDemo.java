package ui;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class handleSSLErrorDemo {

	public static void main(String[] args){
		
		WebDriverManager.chromedriver().setup();
		
		DesiredCapabilities dc = new DesiredCapabilities();
		//dc.setAcceptInsecureCerts(true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true); //all certificates
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ChromeOptions coption = new ChromeOptions();
		coption.merge(dc);
		
		ChromeDriver driver = new ChromeDriver(coption);
		
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		
		
				
	}
}
