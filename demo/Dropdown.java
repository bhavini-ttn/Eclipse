package demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Bhavini Chadha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	//implicit wait-selenium
		driver.manage().window().maximize();
		//WebDriverWait w=new WebDriverWait(driver, 40);		//webdriverwait object
		//driver.get("https://demo.guru99.com/test/newtours/register.php");	//launch url
		driver.get("https://demoqa.com/alerts");
		//WebElement address=driver.findElement(By.xpath("//select[@name=\"country\"]"));
		//Select s=new Select(address);
		//s.selectByVisibleText("INDIA");
		
		WebElement al=driver.findElement(By.xpath("//button[@id=\"alertButton\"]"));
		al.click();
		Alert a=driver.switchTo().alert();
		Thread.sleep(5000);
		a.accept();
		
		//driver.close();
	}

}
