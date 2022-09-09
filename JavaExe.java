package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/login/");
JavascriptExecutor jse = (JavascriptExecutor)driver;
WebElement textUser = driver.findElement(By.id("email"));
jse.executeScript("arguments[0].setAttribute('value','vnrsriram')", textUser);
WebElement textPass = driver.findElement(By.id("pass"));
jse.executeScript("arguments[0].setAttribute('value','123456')", textPass);
jse.executeScript("document.getElementById(\"email\").setAttribute('style','border:2px solid red ; background:blue');");



	}

}
