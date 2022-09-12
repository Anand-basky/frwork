package org.framlog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Samlog {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
		searchbar.sendKeys("iphone 13 pro max", Keys.ENTER);
		WebElement phone = driver
				.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		phone.click();

		List<WebElement> tabs = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		WebElement q;
		for (int i = 0; i < tabs.size(); i++) {
			q = tabs.get(i);
			System.out.println(q.getText());
		}

	}

}