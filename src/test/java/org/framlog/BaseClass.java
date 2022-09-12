package org.framlog;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.WebDriverEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void launch(String url) {
		driver.get(url);
	}
	
	public WebElement idLocator(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}
	
	public WebElement nameLocator(String name) {
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;
	}
	
	public WebElement classLocator(String className) {
		WebElement findElement = driver.findElement(By.className(className));
		return findElement;
	}
	
	public WebElement xpathLocator(String xpathExpression) {
		WebElement findElement = driver.findElement(By.xpath(xpathExpression));
		return findElement;
	}
	
	public void sendTxt(WebElement findElement,String keysToSend) {
		findElement.sendKeys(keysToSend);
	}
	
	public void buttonClick(WebElement findElement) {
		findElement.click();
	}
	
	public void textGet(WebElement findElement) {
		String text = findElement.getText();
		System.out.println(text);
	}
	
	public void attributeGet(WebElement findElement, String name) {
		String attribute = findElement.getAttribute(name);
		System.out.println(attribute);
	}
	
	public void sleep(long millis) throws InterruptedException {
		Thread.sleep(millis);
	}
	
	public void moveToElement(WebElement target) {
		Actions actions =new Actions(driver);
		actions.moveToElement(target);
	}
	
	public void dragAndDrop(WebElement source,WebElement target) {
		Actions actions =new Actions(driver);
		actions.dragAndDrop(source, target);
	}
	
	public void rightClick(WebElement element) {
		Actions actions =new Actions(driver);
		actions.contextClick(element);
	}
	
	public void doubleclick(WebElement element) {
		Actions actions =new Actions(driver);
		actions.doubleClick(element);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
