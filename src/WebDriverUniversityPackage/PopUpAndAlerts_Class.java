package WebDriverUniversityPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopUpAndAlerts_Class {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rinuu\\OneDrive\\Desktop\\Automation Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		driver.manage().window().maximize();
		
		//JavaScript alert checking- working
//		driver.findElement(By.id("button1")).click();
//		driver.switchTo().alert().accept();
		
		
		
		//Modal Pop up case-  working with this code
		driver.findElement(By.id("button2")).click();
		Actions act1 = new Actions(driver);
	 	driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button")).click();
		
		
		
//		try {
//			driver.switchTo().alert();
//		} catch(NoAlertPresentException ae) {
//			System.out.println("NoAlertPresentException is handled");
//		}
		
		
		
		
		//Ajax loader case - working
//		driver.findElement(By.id("button3")).click();
//		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//*[@id=\"button1\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button")).click();
		
		
		
		
		//Java Script Confirm Box-working
		//driver.findElement(By.id("button4")).click();
		//driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().accept();
		
		
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
		
		//Pop up details after button 2 clicked
//		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button"));
//		Actions act1 = new Actions(driver);
//		act1.click();
		
		//driver.switchTo().alert().dismiss();
		

	}

}
