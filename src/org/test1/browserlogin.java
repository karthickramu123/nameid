package org.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class browserlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Nameid\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	WebElement login = driver.findElement(By.xpath("//input[@autocomplete='off'][2]"));
	login.sendKeys("karthick");
	
//	WebElement create = driver.findElement(By.xpath("//a[text()='Create a Page']"));
////	create.click();
//	
//	String txt = create.getText();
//	System.out.println(txt);
//	
//	WebElement create1 = driver.findElement(By.xpath("//div[text()=' for a celebrity, brand or business.']"));
//	String get = create1.getText();
//	System.out.println(get);
//	
//	WebElement create2 = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
//	String get2 = create2.getText();
//	System.out.println(get2);
//	
	WebElement create3 = driver.findElement(By.xpath("//h2[contains(text(), 'Facebook')]"));
//	String three = create3.getText();
//	System.out.println(three);
//	WebElement user = driver.findElement(By.xpath("//input[contains(@name, 'em')]"));
//	user.sendKeys("karthi");
//	String keys = user.getAttribute("value");
//	System.out.println(keys);
//	
//	WebElement pass = driver.findElement(By.xpath("//input[contains(@name, 'pa')]"));
//	pass.sendKeys("love");
//	String word = pass.getAttribute("value");
//	System.out.println(word);
	
//	String facebook = create3.getAttribute("innerText");
//	System.out.println(facebook);

	
	
	
	
	
	
	
	
	
//	WebElement button = driver.findElement(By.name("checkUser"));
//	button.click();
	
//	WebElement pass = driver.findElement(By.name("password"));
//	pass.sendKeys("Suren@1234");
	
//	WebElement press = driver.findElement(By.name("login"));
//	press.click();
	}

}
