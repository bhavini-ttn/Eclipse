package demo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testnn {
	private static WebDriver driver;
	@BeforeMethod
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Bhavini Chadha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		WebDriverWait w=new WebDriverWait(driver, 40);		
		driver.get("https://demoqa.com/automation-practice-form");
	}

	@Test(priority=2)
	public void demo() throws InterruptedException
	{
		String e="DEMOQA";
		String t=driver.getTitle();
		System.out.println(t);
		AssertJUnit.assertEquals(t, e,"Title does not match!");
		WebElement e1=driver.findElement(By.xpath("//label[text()=\"Female\"]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e1).click().perform();
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void demo1() {
		
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
}
