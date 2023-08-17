package WebDriverUniversityPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PageObjectModel_Class {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rinuu\\OneDrive\\Desktop\\Automation Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.navigate().to("https://webdriveruniversity.com/Page-Object-Model/index.html");
        
        driver.manage().window().maximize();
        
//        WebElement choose = driver.findElement(By.id("slide-image-1"));
//        choose.click();
        
//        WebElement choose1 = driver.findElement(By.id("slide-image-1"));
//        choose1.click();
        
//        WebElement choose2 = driver.findElement(By.xpath("//input[@id = 'slide-image-3']"));
//        choose2.click();
		
		driver.findElement(By.id("button-find-out-more")).click();
//		driver.findElement(By.xpath("//button[contains (text(),'Find Out More')]"));
//		Actions act = new Actions(driver);
//	    act.click();
		  
		
//		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[1]")).click();
        
        driver.navigate().to("https://webdriveruniversity.com/Page-Object-Model/products.html");
		
//		driver.findElement(By.id("amp-img")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.xpath("//button1[contains(text(),'Proceed')]"));
//		Actions a = new Actions(driver);
//		a.click();
		
		
		
		

	}

}
