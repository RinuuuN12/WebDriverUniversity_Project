package WebDriverUniversityPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AccordionAndTextEffects_Class {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rinuu\\OneDrive\\Desktop\\Automation Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.navigate().to("https://webdriveruniversity.com/Accordion/index.html");
        
        driver.manage().window().maximize();
        
//        WebElement Test = driver.findElement(By.id("manual-testing-accordion"));
//        Test.click();
//        
//        WebElement Test1 = driver.findElement(By.id("manual-testing-description"));
//        Test1.click();
        
//        WebElement cucum = driver.findElement(By.id("cucumber-accordion"));
//        cucum.click();
//        
//        WebElement cucum1 = driver.findElement(By.id("cucumber-testing-description"));
//        cucum1.click();
        
//        WebElement automate = driver.findElement(By.id("automation-accordion"));
//        automate.click();
//        
//        WebElement automate1 = driver.findElement(By.id("automation-testing-description"));
//        automate1.click();
        
        driver.findElement(By.id("click-accordion"));		
        driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);
        Actions ans = new Actions(driver);
        ans.click();
        
//        WebElement choose = driver.findElement(By.id("text-appear-box"));
//        choose.click();
        
        
        
        
        
        
        
		

	}

}
