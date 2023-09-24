package com.sujeet.assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/*Assignment -1(Webdriver  architecture, All Types of Drivers)
➤ First Selenium Test: Verify amazon HomaPage
 ➤ verify the FaceBook HomePage 
➤ Verify the Page Tittle. 
➤ Invoke : Firefox, Safari, Opera, IE
➤ Using Navigator commands to move home page to other page and comeback to homepage
*/

public class AmazonHomePageVerification {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		
		 // WebDriver edgedriver=new EdgeDriver(); 
		 // WebDriver iedriver=new InternetExplorerDriver();
		 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement element=driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("tv");
		
		Thread.sleep(2000);
		
		
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("abc@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("password");
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		
		
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		String expectedTitle = "Log in to Facebook";
        if (title.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title Matched");
        } else {
            System.out.println("Not a match");
        }
        
        String  URL1 = "http://www.yahoo.com";
        String  URL2 = "http://www.amazon.com";
        driver.navigate().to(URL1);
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
        driver.navigate().to(URL2);
        //driver.navigate().forward();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
        driver.navigate().back();
        driver.close();

		

	}

}
