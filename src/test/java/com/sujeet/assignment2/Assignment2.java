package com.sujeet.assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



/*Assignment -2(Locators working with WebElements)
➤ URL (https://demo.guru99.com/test/radio.html
➤ Find Option 1 and select
➤ Find Checkbox2 and Checkbox3 and select
➤ Suggested site(https://demo.guru99.com/test/newtours/register.php)
➤ Find Country Dropdown
➤ Select “KUWAIT”
*/
public class Assignment2 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/radio.html");
	WebElement element=driver.findElement(By.xpath("//input[@value='Option 1']"));
	element.click();
	WebElement checkbox2=driver.findElement(By.id("vfb-6-1"));
	checkbox2.click();
	WebElement checkbox3=driver.findElement(By.id("vfb-6-2"));
	checkbox3.click();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	WebElement ele=driver.findElement(By.name("country"));
	Select select=new Select(ele);
	select.selectByIndex(6);
	select.selectByVisibleText("KUWAIT");
	
	

	}

}
