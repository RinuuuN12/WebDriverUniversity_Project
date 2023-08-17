package WebDriverUniversityPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_Class {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rinuu\\OneDrive\\Desktop\\Automation Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		driver.manage().window().maximize();
		
		WebElement ChooseFile = driver.findElement(By.name("filename"));
		ChooseFile.sendKeys("C:\\Test\\TestFile1.txt");
		
	    driver.findElement(By.id("submit-button")).click();
		driver.switchTo().alert().accept();
		

	}

}
