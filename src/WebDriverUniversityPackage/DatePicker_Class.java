package WebDriverUniversityPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker_Class {

	public static void main(String[] args)  throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rinuu\\OneDrive\\Desktop\\Automation Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Datepicker/index.html");
		driver.manage().window().maximize();
		
		String month = "June 1998";
		String day = "20";
		
		WebElement PickingDate = driver.findElement(By.xpath("//div[@id ='datepicker']"));
		PickingDate.click();
		
		Thread.sleep(2000);
		
		while(true)
		{
			String MonthYearText = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]\r\n")).getText();
					
		if(MonthYearText.equals(month))
		{
			break;
		}
		else
		{
		
			WebElement leftarrow = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[1]"));
			leftarrow.click();
		}
	} 		
		
	WebElement day1 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[3]/td[7]"));
	day1.click();
		
	
		
//	    driver.findElement(By.id("datepicker")).click();
//	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("datepicker-days")));
//	    
//	    String YearMonth = driver.findElement(By.className("datepicker-switch")).getText();
//	    
//	    while(!YearMonth.equals("July 2024")) {
//	    
//	    driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[3]")).click();
//	     YearMonth = driver.findElement(By.className("datepicker-switch")).getText();
//	    
//	    driver.findElement(By.xpath("//td[@class = 'day']")).click();
	    
	    }   
	    
	    
	}
	
    
	    
	    //datepick.sendKeys("04152023");
		
		
		
	


