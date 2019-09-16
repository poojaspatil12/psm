package psm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class psm_search {
	
	WebDriver driver=new ChromeDriver();
	@BeforeTest

	public void startbrowser() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//URLhttp
		driver.get("http://real-estate.itechscripts.com/admin/index.php");
		Thread.sleep(1000);
		String actualtitle=driver.getTitle();
		System.out.println("The title of the page is:"+actualtitle);
		////screenshot
		//TakesScreenshot ts=(TakesScreenshot)driver;
		//File file=ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file, new File("C:\\Users\\HP\\Pictures\\Screenshot\\pic.jpeg"));
		//Thread.sleep(2000);
		//System.out.println("Saved the screenshot");

	}
	@Test(priority=0)
	public void login() throws InterruptedException {
		//LOGIN
		driver.findElement(By.xpath("//input[@id='username']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-bordered btn-primary pull-right']")).click();
		Thread.sleep(5000);
	}

	@Test(priority=4)
	public void search() throws InterruptedException {
		//search agent listing
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/aside[1]/div[1]/ul[1]/li[4]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[4]//ul[1]//li[1]//a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys("ambit");
		Thread.sleep(2000);
		
		
		//search property listing
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/aside[1]/div[1]/ul[1]/li[5]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Properties Listing']")).click();
	Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys("finders");
		Thread.sleep(2000);
		
	}	

}
