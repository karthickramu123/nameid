package org.test1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class greenstech {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Nameid\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://greenstech.in/selenium-course-content.html");
//driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
Actions b=new Actions(driver);
Robot r=new Robot();
WebElement frame = driver.findElement(By.xpath("(//div[@data-toggle='collapse'])[18]"));
frame.click();

b.contextClick(frame).perform();



//for(int i=0; i<8; i++) {
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
}
//r.keyPress(KeyEvent.VK_ENTER);
//r.keyPress(KeyEvent.VK_DOWN);
//r.keyRelease(KeyEvent.VK_DOWN);
//r.keyPress(KeyEvent.VK_DOWN);
//r.keyRelease(KeyEvent.VK_DOWN);
//r.keyPress(KeyEvent.VK_ENTER);
////r.keyRelease(KeyEvent.VK_ENTER);
	}


