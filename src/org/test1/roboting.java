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

public class roboting {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver", "D:\\Nameid\\drivers\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
WebElement user = driver.findElement(By.id("email"));
user.sendKeys("karthick");
Actions b=new Actions(driver);
//b.doubleClick(user).perform();
//b.contextClick(user).perform();

Robot c=new Robot();
WebElement password = driver.findElement(By.name("pass"));
password.click();
c.keyPress(KeyEvent.VK_SHIFT);
c.keyPress(KeyEvent.VK_K);
c.keyRelease(KeyEvent.VK_K);
c.keyPress(KeyEvent.VK_A);
c.keyRelease(KeyEvent.VK_A);
c.keyRelease(KeyEvent.VK_SHIFT);
c.keyPress(KeyEvent.VK_SHIFT);
c.keyPress(KeyEvent.VK_R);
c.keyRelease(KeyEvent.VK_R);
c.keyPress(KeyEvent.VK_T);
c.keyRelease(KeyEvent.VK_T);
c.keyPress(KeyEvent.VK_H);
c.keyRelease(KeyEvent.VK_H);
c.keyPress(KeyEvent.VK_I);
c.keyRelease(KeyEvent.VK_I);
c.keyRelease(KeyEvent.VK_SHIFT);




//c.keyPress(KeyEvent.VK_DOWN);





//c.keyRelease(KeyEvent.VK_DOWN);
//c.keyPress(KeyEvent.VK_DOWN);
//c.keyRelease(KeyEvent.VK_DOWN);
//c.keyPress(KeyEvent.VK_DOWN);
//c.keyRelease(KeyEvent.VK_DOWN);
//c.keyPress(KeyEvent.VK_DOWN);
//c.keyRelease(KeyEvent.VK_DOWN);
//c.keyPress(KeyEvent.VK_DOWN);
//c.keyRelease(KeyEvent.VK_DOWN);
//
//c.keyPress(KeyEvent.VK_ENTER);
//c.keyRelease(KeyEvent.VK_ENTER);
//WebElement password = driver.findElement(By.name("pass"));
//b.click(password).perform();
//b.contextClick(password).perform();
////c.keyPress(KeyEvent.VK_CONTROL);
////c.keyPress(KeyEvent.VK_V);
////c.keyRelease(KeyEvent.VK_CONTROL);
////c.keyRelease(KeyEvent.VK_V);
//for(int i=0; i<7; i++) {
//	c.keyPress(KeyEvent.VK_DOWN);
//	c.keyRelease(KeyEvent.VK_DOWN);
//}
//c.keyPress(KeyEvent.VK_ENTER);
//c.keyRelease(KeyEvent.VK_ENTER);
//b.doubleClick(password).perform();
//password.clear();



	}

}
