package WebDriverUniversityPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingAround_Class {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rinuu\\OneDrive\\Desktop\\Automation Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Scrolling/index.html");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("zone1")).click();
		
		driver.findElement(By.id("zone2-entries")).click();
		
		
		driver.findElement(By.id("zone3-entries")).click();
		

	}

}
