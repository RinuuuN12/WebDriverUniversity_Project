package WebDriverUniversityPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IFrame_Class {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rinuu\\OneDrive\\Desktop\\Automation Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://webdriveruniversity.com/IFrame/index.html");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("frame");
	
		driver.findElement(By.xpath("//*[@id=\"button-find-out-more\"]")).click();
		//driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Actions as = new Actions(driver);
		driver.findElement(By.xpath("//button[@class ='btn btn-default']"));
		as.click();
		//Alert at = driver.switchTo().alert();
		//at.accept();
		
		

	}

}
