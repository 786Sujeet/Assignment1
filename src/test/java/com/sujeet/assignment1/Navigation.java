package com.sujeet.assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String  URL1 = "http://www.yahoo.com";
        String  URL2 = "http://www.amazon.com";
        driver.navigate().to(URL1);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(URL2);
        //driver.navigate().forward();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.navigate().back();
     System.out.println("sujeet");
	}

}
