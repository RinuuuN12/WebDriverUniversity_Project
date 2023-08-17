package WebDriverUniversityPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPortal_Class {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rinuu\\OneDrive\\Desktop\\Automation Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.navigate().to("https://webdriveruniversity.com/Login-Portal/index.html");
        
        driver.manage().window().maximize();
		
        WebElement username = driver.findElement(By.id("text"));
        username.sendKeys("Rigour");
        
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("12345678");
        
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();
        
        
	}

}
