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

public class tecnology {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Nameid\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions b=new Actions(driver);
		Robot r=new Robot();
		WebElement item = driver.findElement(By.xpath("(//img[@class='wooble'])[4]"));
		b.contextClick(item).perform();
		
		
		for(int i=0; i<5; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			}
		r.keyPress(KeyEvent.VK_ENTER);
//		WebElement frame = driver.findElement(By.xpath("(//div[@data-toggle='collapse'])[18]"));
	}

}
