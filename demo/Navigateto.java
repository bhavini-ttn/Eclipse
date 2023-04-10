package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateto {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Bhavini Chadha\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.tothenew.com/");

//        WebElement contactUsLink = driver.findElement(By.id("menu-item-10564"));
//        contactUsLink.click();
//
//        WebElement contactUsLink = driver.findElement(By.xpath("//a[text()='Contact Us']"));
//        contactUsLink.click();

        driver.close();
    }

}
