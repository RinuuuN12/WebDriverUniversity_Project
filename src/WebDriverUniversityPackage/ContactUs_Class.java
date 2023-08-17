package WebDriverUniversityPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUs_Class {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rinuu\\OneDrive\\Desktop\\Automation Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //driver.get("https://webdriveruniversity.com/");
        driver.navigate().to("https://webdriveruniversity.com/Contact-Us/contactus.html");
 
        
        driver.manage().window().maximize();
        
        WebElement fname = driver.findElement(By.name("first_name"));
        fname.sendKeys("Rinu");
        
        WebElement lname = driver.findElement(By.name("last_name"));
        lname.sendKeys("Nair");
        
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("rinuunair@gmail.com");
        
        WebElement feedback = driver.findElement(By.name("message"));
        feedback.sendKeys("As per my view point not much to improve. Everything good.");
        
        driver.findElement(By.xpath("//input[@value ='SUBMIT']")).click();
       
        
        //driver.findElement(By.xpath("//input[@value ='RESET']")).click();
      
        
        
        
        

	}

}
