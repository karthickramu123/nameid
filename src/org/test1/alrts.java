package org.test1;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class alrts {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "D:\\Nameid\\drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions b=new Actions(driver);
		Robot c=new Robot();
		WebElement simple = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		simple.click();
		Alert simplealert = driver.switchTo().alert();
		String text = simplealert.getText();
		System.out.println(text);
		simplealert.accept();
		WebElement confirm = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirm.click();
		WebElement confrm = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		String text2 = confrm.getText();
		System.out.println(text2);
		confrm.click();
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.dismiss();
		WebElement confrm2 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		confrm2.click();
		WebElement prompt = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		String text3 = prompt.getText();
		System.out.println(prompt);
		prompt.click();
		Alert text4 = driver.switchTo().alert();
		text4.sendKeys("karthi");
		Alert alert3 = driver.switchTo().alert();
		String content = alert3.getText();
		System.out.println(content);
		alert3.sendKeys("karthi");
		
		alert3.accept();
		
		
		
		
		
	}

}
