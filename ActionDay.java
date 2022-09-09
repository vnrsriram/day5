package org.day5;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDay {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver  =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement userName = driver.findElement(By.id("email"));
		Actions act = new Actions(driver);
		Robot rob=new Robot();
	rob.keyPress(KeyEvent.VK_V);
	rob.keyPress(KeyEvent.VK_N);
	rob.keyPress(KeyEvent.VK_R);
	rob.keyPress(KeyEvent.VK_S);
	rob.keyPress(KeyEvent.VK_R);
	rob.keyPress(KeyEvent.VK_I);
	rob.keyPress(KeyEvent.VK_R);
	rob.keyPress(KeyEvent.VK_A);
	rob.keyPress(KeyEvent.VK_M);
	rob.keyPress(KeyEvent.VK_0);
	rob.keyPress(KeyEvent.VK_7);
	rob.keyPress(KeyEvent.VK_SHIFT);
	rob.keyPress(KeyEvent.VK_2);
	rob.keyRelease(KeyEvent.VK_SHIFT);
	rob.keyRelease(KeyEvent.VK_2);
	rob.keyPress(KeyEvent.VK_G);
	rob.keyPress(KeyEvent.VK_M);
	rob.keyPress(KeyEvent.VK_A);
	rob.keyPress(KeyEvent.VK_I);
	rob.keyPress(KeyEvent.VK_L);
	rob.keyPress(KeyEvent.VK_L);
	rob.keyPress(KeyEvent.VK_DECIMAL);
	rob.keyPress(KeyEvent.VK_C);
	rob.keyPress(KeyEvent.VK_O);
	rob.keyPress(KeyEvent.VK_M);
	Thread.sleep(3000);
	act.click(userName).perform();
	act.doubleClick(userName).perform();
	Thread.sleep(2000);
	act.clickAndHold().perform();
	rob.keyPress(KeyEvent.VK_CONTROL);
	rob.keyPress(KeyEvent.VK_X);
	rob.keyRelease(KeyEvent.VK_CONTROL);
	rob.keyRelease(KeyEvent.VK_X);
	Thread.sleep(1000);
	rob.keyPress(KeyEvent.VK_CONTROL);
	rob.keyPress(KeyEvent.VK_V);
	rob.keyRelease(KeyEvent.VK_CONTROL);
	rob.keyRelease(KeyEvent.VK_V);


	
	
		
		
		
		
		}
}