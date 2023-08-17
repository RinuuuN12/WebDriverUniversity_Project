package WebDriverUniversityPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonclicks_class {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rinuu\\OneDrive\\Desktop\\Automation Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.navigate().to("https://webdriveruniversity.com/Click-Buttons/index.html");
		
        driver.manage().window().maximize();
        
//        WebElement button = driver.findElement(By.id("button1"));
//        button.click();
        
//        WebElement buttonnew = driver.findElement(By.id("button2"));
//        buttonnew.click();
        
        WebElement buttonlast = driver.findElement(By.id("button3"));
        buttonlast.click();
		
        //driver.findElement(By.xpath("//input[@id ='button1']")).click();
        
        

	}

}
