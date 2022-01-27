package org.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Nameid\\drivers\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/");
	WebElement index = driver.findElement(By.xpath("//h4[text()='Greens Technology In Adyar']"));
	String centre = index.getText();
	System.out.println(centre);
	WebElement address = driver.findElement(By.xpath("//p[contains(text(), 'No:11')]"));
	String prt = address.getText();
	System.out.println(prt);
	System.out.println();
	
	String greens = address.getAttribute("innerText");
	System.out.println(greens);
//	WebElement button = driver.findElement(By.xpath("//a[text()='Login']"));
//	String text = button.getText();
//	System.out.println(text);
//	WebElement user = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
//	user.sendKeys("karthi");
//	String prtuser = user.getAttribute("value");
//	System.out.println(prtuser);
//	
//	WebElement password = driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
//	password.sendKeys("ramu");
//	String prtpassword = password.getAttribute("value");
//	System.out.println(prtpassword);

//	String prtuser = user.getAttribute("value");
//	System.out.println(prtuser);
//	
//	WebElement password = driver.findElement(By.xpath("//input[contains(@name, 'pa')]"));
//	password.sendKeys("ramu");
//	String prtpass = password.getAttribute("value");
//	System.out.println(prtpass);
//	WebElement address = driver.findElement(By.xpath("//a[text()='All Branches']"));
//	address.click();
	
//	WebElement quote = driver.findElement(By.xpath("//p[contains(text(), 'Greens Technology')]"));
//	String display = quote.getText();
//	System.out.println(display);
//	System.out.println();
	 
//	WebElement omr = driver.findElement(By.xpath("//h4[text()='Greens Technology In OMR']"));
//String add = omr.getText();
//System.out.println(add);
//WebElement index2 = driver.findElement(By.xpath("//p[contains(text(), 'No.19')]"));
//String centre2 = index2.getText();
//System.out.println(centre2);



//	WebElement greenstext = driver.findElement(By.xpath("//h1[contains(text(), 'No 1 Software')]"));
//String get = greenstext.getText();
//System.out.println(get);
	
	//	WebElement login = driver.findElement(By.xpath("//input[@name='username']"));
//	login.sendKeys("karthick");
//	String prtlogin = login.getAttribute("value");
//	System.out.println(prtlogin);
//	WebElement pass = driver.findElement(By.xpath("//input[contains(@name, 'pass')]"));
//	pass.sendKeys("ramu");
//	String prtpass = pass.getAttribute("value");
//	System.out.println(prtpass);

	}

}
