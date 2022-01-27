package org.test1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class droptask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Nameid\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://adactinhotelapp.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("karthickramu");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("karthick@123");
		WebElement log = driver.findElement(By.id("login"));
		log.click();
		WebElement room = driver.findElement(By.id("room_type"));
		room.click();
		Select s=new Select(room);
		s.selectByVisibleText("Deluxe");
		List<WebElement> roomcheck = s.getOptions();
		WebElement keys = roomcheck.get(2);
		String insert = keys.getText();
		System.out.println(insert);
		System.out.println("for loop");
		for(int i=0; i<roomcheck.size(); i++) {
			WebElement keys1 = roomcheck.get(i);
			String insert1 = keys1.getText();
			System.out.println(insert1);
			}
		WebElement select = driver.findElement(By.id("location"));
		Select s1=new Select(select);
		select.click();
		System.out.println("various locations across globe");
		List<WebElement> globallocs = s1.getOptions();
		WebElement locs = globallocs.get(4);
		String text1 = locs.getText();
		System.out.println(text1);
		System.out.println("using forloop");
		for(int i=0; i<globallocs.size(); i++) {
			WebElement locs1 = globallocs.get(i);
			String text2 = locs1.getText();
			System.out.println(text2);
		}
		
		
	}

}
