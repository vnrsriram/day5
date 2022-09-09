package org.day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DaySeventeen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://nxtgenaiacademy.com/alertandpopup/");
WebElement button = driver.findElement(By.xpath("//button[@name='alertbox']"));
button.click();
Thread.sleep(1000);
Alert alert = driver.switchTo().alert();
alert.accept();
driver.manage().window().maximize();
Thread.sleep(2000);
WebElement confrim = driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
confrim.click();
alert.accept();
Thread.sleep(2000);
WebElement prompt = driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
prompt.click();
alert.sendKeys("yes");
alert.accept();
Thread.sleep(5000);
driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
WebElement nxtone = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
Thread.sleep(1000);
nxtone.click();
alert.accept();
WebElement deff = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
deff.click();
Thread.sleep(1000);
WebElement deef = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box '] "));
deef.click();
alert.accept();
WebElement ddef = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
ddef.click();
WebElement dddef = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
dddef.click();
Thread.sleep(1000);
alert.sendKeys("yes");
alert.accept();


	}
	

}
