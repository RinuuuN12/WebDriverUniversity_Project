package WebDriverUniversityPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDoList_Class {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rinuu\\OneDrive\\Desktop\\Automation Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.navigate().to("https://webdriveruniversity.com/To-Do-List/index.html");
        
        driver.manage().window().maximize();
        
//        WebElement TodoList = driver.findElement(By.id("plus-icon"));
//        TodoList.submit();	
        
        
//        WebElement TodoList = driver.findElement(By.id("plus-icon"));
//        TodoList.click();
        
        WebElement Add = driver.findElement(By.xpath("//*[@id=\"container\"]/input"));
		Add.sendKeys("Be Punctual to finish the task");
		Add.sendKeys(Keys.ENTER);
		
		WebElement Delete = driver.findElement(By.xpath("//*[@id=\"container\"]/ul/li[2]/span/i"));
		Delete.click();
	}

}
