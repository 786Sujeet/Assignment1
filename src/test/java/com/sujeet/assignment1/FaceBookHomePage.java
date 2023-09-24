package com.sujeet.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookHomePage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("abc@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("password");
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		

	}

}
