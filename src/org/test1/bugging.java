package org.test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class bugging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


System.setProperty("webdriver.edge.driver", "D:\\Nameid\\drivers\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("http://demo.guru99.com/test/drag_drop.html");

driver.manage().window().maximize();

Actions a=new Actions(driver);

WebElement amount = driver.findElement(By.xpath("(//li[@data-id='2'])[2]"));
WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
a.dragAndDrop(amount, destination).perform();
WebElement name = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
WebElement bankdesstn = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
a.dragAndDrop(name, bankdesstn).perform();
WebElement sales = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
WebElement credit = driver.findElement(By.xpath("//li[@class='placeholder'])[3]"));
a.dragAndDrop(sales, credit).perform();
////driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//Actions a=new Actions(driver);
//WebElement sports = driver.findElement(By.xpath("//a[text()='Sports & More']"));
//a.click(sports).perform();
//WebElement weight = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
//a.click(weight).perform();

//WebElement appliance = driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
//a.moveToElement(appliance).perform();
//WebElement aircondtioner = driver.findElement(By.xpath("//a[text()='Air Conditioners']"));
//a.moveToElement(aircondtioner).perform();



// WebElement movecourse = driver.findElement(By.xpath("//div[@title='Courses']"));
//	a.moveToElement(movecourse).perform();
//	WebElement movesoftware = driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
//	a.moveToElement(movesoftware).perform();
//	WebElement selenium = driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
//	a.click(selenium).perform();
//WebElement movebank = driver.findElement(By.id("credit2"));
//WebElement place = driver.findElement(By.id("bank"));
////a.dragAndDrop(movebank, place).perform();
////a.clickAndHold(movebank).moveToElement(place).release().perform();
//a.clickAndHold(movebank).release(place).perform();
	}

}
