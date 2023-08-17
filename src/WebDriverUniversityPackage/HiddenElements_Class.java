package WebDriverUniversityPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElements_Class {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rinuu\\OneDrive\\Desktop\\Automation Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://webdriveruniversity.com/Hidden-Elements/index.html");
		driver.manage().window().maximize();
		
		//Zero Capacity checking - working
		//driver.findElement(By.xpath("//*[@id=\"button3\"]")).click();
		//driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"myModalMoveClick\"]/div/div/div[3]/button")).click();
		
		
		//Visibility Hidden checking
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("button2"));
		ele.click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click;", ele);
		
		
		//driver.findElement(By.xpath("//*[@id=\"myModalMoveClick\"]/div/div/div[3]/button")).click();
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("document.getElementById('button2').value ='CLICK ME';");
				
		

	}

}
