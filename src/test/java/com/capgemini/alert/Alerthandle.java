package com.capgemini.alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerthandle {
	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2014/01/new-testing.html?");
		driver.manage().window().maximize();
	    //driver.findElement(By.xpath("//input[@onclick=\"myFunction1()\"]")).click();
	    //driver.findElement(By.xpath("//input[@id=\"text1\"]")).click();
		TimeUnit.SECONDS.sleep(15);
		driver.switchTo().alert();
		String w =driver.switchTo().alert().getText();
	    driver.switchTo().alert().accept();
	    System.out.println(w);
	    driver.close();
	}
}
