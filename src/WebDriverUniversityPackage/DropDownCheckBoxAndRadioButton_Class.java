package WebDriverUniversityPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCheckBoxAndRadioButton_Class {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rinuu\\OneDrive\\Desktop\\Automation Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        driver.manage().window().maximize();
        
        Select lang = new Select(driver.findElement(By.id("dropdowm-menu-1")));
		lang.selectByIndex(1);
		
		Select lang1 = new Select(driver.findElement(By.id("dropdowm-menu-2")));
		lang1.selectByIndex(2);
		
		Select lang2 = new Select(driver.findElement(By.id("dropdowm-menu-3")));
		lang2.selectByIndex(3);
		
//		driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[1]/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[4]/input")).click();
		
		
//		WebElement colour = driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[1]"));
//		colour.click();			
		
		WebElement colour1 = driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[3]"));
		colour1.click();
	
		
//		WebElement colour2 = driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[5]"));
//		colour2.click();
		
		driver.findElement(By.xpath("//input[@value ='pumpkin']")).click();
		
		Select fruit = new Select(driver.findElement(By.id("fruit-selects")));
		fruit.selectByIndex(2);

	}

}
