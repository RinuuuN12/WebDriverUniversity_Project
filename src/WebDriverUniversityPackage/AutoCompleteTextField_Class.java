package WebDriverUniversityPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteTextField_Class {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rinuu\\OneDrive\\Desktop\\Automation Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		driver.manage().window().maximize();
		
        WebElement food = driver.findElement(By.name("food-item"));
        food.sendKeys("Pineapple");
        
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        WebElement button = driver.findElement(By.id("submit-button"));
		button.click();
		

	}

}
