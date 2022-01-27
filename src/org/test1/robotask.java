package org.test1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
//flipkart
public class robotask {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Nameid\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
Actions b=new Actions(driver);
WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
user.sendKeys("karthi");
b.doubleClick(user).perform();
b.contextClick(user).perform();
Robot r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_C);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_C);
WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
//b.doubleClick(pass).perform();
b.moveToElement(pass).perform();
////b.contextClick(pass).perform();
//b.doubleClick(pass).perform();
//b.doubleClick(pass).perform();
//b.contextClick(pass).perform();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
//r.keyPress(KeyEvent.VK_DOWN);
//r.keyRelease(KeyEvent.VK_DOWN);
//r.keyPress(KeyEvent.VK_DOWN);
//r.keyRelease(KeyEvent.VK_DOWN);
//r.keyPress(KeyEvent.VK_DOWN);
//r.keyRelease(KeyEvent.VK_DOWN);
//r.keyPress(KeyEvent.VK_DOWN);
//r.keyRelease(KeyEvent.VK_DOWN);
//r.keyPress(KeyEvent.VK_DOWN);
//r.keyRelease(KeyEvent.VK_DOWN);
//r.keyPress(KeyEvent.VK_DOWN);
//r.keyRelease(KeyEvent.VK_DOWN);

//for(int i=0; i<4; i++) {
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
}

	}


