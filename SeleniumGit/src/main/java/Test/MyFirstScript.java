package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstScript {
	
public static void main(String[] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	String baseURL = "http://www.letskodeit.com/";
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	driver.get(baseURL);
	
}
		
	}
	


