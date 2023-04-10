package demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Bhavini Chadha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	//implicit wait-selenium
		driver.manage().window().maximize();
		WebDriverWait w=new WebDriverWait(driver, 40);		//webdriverwait object
		driver.get("https://demoqa.com/automation-practice-form");		//launch url
		//System.out.println(driver.getPageSource());
		
		//driver.findElement(By.id("firstName")).sendKeys("Bhavini");	  //find id and enter input using sendkeys
		driver.findElement(By.className("practice-form-wrapper"));
		//driver.findElement(By.cssSelector("input#firstName[type=\"text\"]")).sendKeys("Bhavini");
		//driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Bhavini");
		WebElement fname= driver.findElement(By.xpath("//input[@id=\"firstName\"]"));
		w.until(ExpectedConditions.visibilityOf(fname));		//explicit name
		fname.sendKeys("Bhavini");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Chadha");
		driver.findElement(By.id("userEmail")).sendKeys("bhavini.chadha@ttn.com");	
		driver.findElement(By.xpath("//label[text()=\"Female\"]")).click();
		 //WebElement radio1 = driver.findElement(By.id("gender-radio-2"));
		 //radio1.click();	
		driver.findElement(By.id("userNumber")).sendKeys("9999999999");
		driver.findElement(By.id("subjectsInput")).sendKeys("ABC");
		driver.findElement(By.xpath("//label[text()=\"Reading\"]")).click();
		driver.findElement(By.xpath("//label[text()=\"Music\"]")).click();
		//driver.findElement(By.xpath("//label[@id=\"hobbies-checkbox-2\"]")).click();
		driver.findElement(By.id("currentAddress")).sendKeys("C-85 Gagan Vihar, Delhi-110092");
		Wait wait=new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(10)).ignoring(ElementClickInterceptedException.class);    //fluentwait
		Thread.sleep(5000);
		//driver.close();
	}

}
