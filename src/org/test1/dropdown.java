package org.test1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "D:\\Nameid\\drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		WebElement day = driver.findElement(By.id("day"));
		day.click();
		Select s=new Select(day);
		s.selectByValue("17");
		List<WebElement> day1 = s.getOptions();
		WebElement out = day1.get(5);
		String text = out.getText();
		System.out.println(text);
		System.out.println("using for loop");
		for(int i=0; i<day1.size(); i++) {
			WebElement out1 = day1.get(i);
			String text1 = out1.getText();
			System.out.println(text1);
		}
//		Actions a=new Actions(driver);
//		
//		WebElement mon = driver.findElement(By.id("month"));
//		a.moveToElement(mon).perform();
//		mon.click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Robot r=new Robot();
//		for(int i=0; i<8; i++ ) {
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//			}
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		WebElement years = driver.findElement(By.id("year"));
//		Select s3=new Select(years);
//		s3.selectByVisibleText("1995");
//		
//		List<WebElement> list = s3.getOptions();
////		WebElement yrs = list.get(9);
////		String get = yrs.getText();
////		System.out.println(get);
//		for (int i=0; i<list.size(); i++) {
//			WebElement yrs = list.get(i);
//			String get = yrs.getText();
//			System.out.println(get);
		}
		
		
		
		
		
		
		
		
		
		
//		
//		Select c=new Select(selmonth);
//		c.selectByIndex(0);
//		c.selectByIndex(2);
//		c.selectByValue("10");
//		c.selectByVisibleText("Dec");
//		boolean check = c.isMultiple();
//		System.out.println(check);
//		List<WebElement> months = c.getOptions();
//		WebElement get = months.get(7);
//		String prt = get.getText();
//		System.out.println(prt);
//		int getsize = months.size();
//		System.out.println(getsize);
//		for(int i=0; i<months.size(); i++) {
//			WebElement sel = months.get(i);
//			String month = sel.getText();
//			System.out.println(month);
			
		}
		
	

