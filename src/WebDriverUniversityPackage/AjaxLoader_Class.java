package WebDriverUniversityPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjaxLoader_Class {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rinuu\\OneDrive\\Desktop\\Automation Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.navigate().to("https://webdriveruniversity.com/Ajax-Loader/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"button1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button")).click();
//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.dismiss();
//        if(driver.getPageSource().contains("Close"));
//        System.out.println("Close");
//        System.out.println("====================================");
        
        

	}

}
