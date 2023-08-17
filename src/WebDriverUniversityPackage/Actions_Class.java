package WebDriverUniversityPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rinuu\\OneDrive\\Desktop\\Automation Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html#");
		driver.manage().window().maximize();
		
		//driver.switchTo().frame(0);
		
		Actions builder = new Actions(driver);
		WebElement se = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement te = driver.findElement(By.xpath("//*[@id=\"droppable\"]")); 
		//Perform drag and drop
		builder.dragAndDrop(se, te).perform();
		
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.id("double-click"));
		act.doubleClick(ele).perform();
		
		Actions at = new Actions(driver);
		WebElement clickable = driver.findElement(By.xpath("//*[@id=\"click-box\"]"));
		at.clickAndHold(clickable).build().perform();
		
		//Hover over me
		Actions acts = new Actions(driver);
		WebElement submenu = driver.findElement(By.xpath("//button[@href ='#']"));
		acts.moveToElement(submenu).build().perform();
		
		//WebElement mainmenu = driver.findElement(By.xpath("//[@class ='dropbtn']"));
//		WebElement submenu = driver.findElement(By.xpath("//[@class ='list-alert']"));
//		acts.moveToElement(submenu).perform();
		
		
		
//		WebElement sourceElement = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
//		WebElement targetElement = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
//		Actions action = new Actions(driver);
//		action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		
		

	}

}
