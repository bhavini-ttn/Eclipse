package demo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Validform {
	private static WebDriver driver;
	@BeforeMethod
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Bhavini Chadha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		WebDriverWait w=new WebDriverWait(driver, 40);		
		driver.get("https://demoqa.com/browser-windows");
	}
	@Test
	public void valid()
	{
//		String s="Student Registration Form";
//		WebElement e= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/h5"));
//		String c=e.getText();
//		System.out.println(c);
//		Assert.assertEquals(c, s,"Name does not match!");
	}
	@Test
	public void window()
	{
		driver.findElement(By.xpath("//button[@id=\"tabButton\"]")).click();
		String w=driver.getWindowHandle();
		System.out.println(w);
		Set<String> aw=driver.getWindowHandles();
		System.out.println(aw);
		driver.switchTo().window(aw.stream().toList().get(1));
		String h=driver.findElement(By.id("sampleHeading")).getText();
		AssertJUnit.assertEquals(h, "This is a sample page");
	}
	
	@Test
	public void framee() {
		driver.switchTo().frame("-3721271610067970639");
		driver.findElement(By.xpath("//a[@data-hrefid=\"-3721271610067970639\"]")).click();
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
}


//String e="Bhavini";
//WebElement e1=driver.findElement(By.xpath("//input[@id=\"firstName\"]"));
//e1.sendKeys("Bhavini");
//WebElement e2=driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
//e2.sendKeys("Chadha");
//WebElement e3=driver.findElement(By.id("userEmail"));
//e3.sendKeys("bhavini.chadha@ttn.com");	
//WebElement e4=driver.findElement(By.id("userNumber"));
//e4.sendKeys("9999999999");
//Assert.assertEquals(e1, e,"Name does not match!");
