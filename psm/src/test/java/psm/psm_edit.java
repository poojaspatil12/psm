package psm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class psm_edit {
	
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
	@Test(priority=3)

	public void edit() throws InterruptedException {
	// edit membership plan
		driver.findElement(By.xpath("//li[@class='active']//li[1]//a[1]")).click();
		Thread.sleep(2000);
		//scroll down
	
		JavascriptExecutor js1s10=(JavascriptExecutor)driver;
		js1s10.executeScript("window.scrollBy(0,1500)");
		System.out.println("scrolled Down");
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("//li[@class='active']//li[1]//a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tr[1]//td[6]//a[2]//img[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pkg_name']")).sendKeys("rerth");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='new_price']")).sendKeys("500");
		Thread.sleep(2000);
		//upload
		WebElement upload=driver.findElement(By.name("new_image"));
		upload.sendKeys("C:\\\\Users\\\\HP\\\\Pictures\\\\Screenshot\\\\pic.jpeg");
	
		
		driver.findElement(By.xpath("//input[@id='post_property_limit']")).sendKeys("4567");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='post_property_photo']")).sendKeys("3456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='featured_pro_limit']")).sendKeys("5678");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='update']")).click();
		Thread.sleep(2000);
		//edit social media setting
		driver.findElement(By.xpath("//a[text()='Social Media Settings']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='panel-title']//a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='facebook']")).sendKeys("rghjkfgh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='update']")).click();
		Thread.sleep(2000);
		//edit client testimonial
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/aside[1]/div[1]/ul[1]/li[7]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Add Client Testimonial']")).sendKeys("Add Client Testimonial");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Add Client Testimonial']")).click();
		Thread.sleep(2000);
		//scroll down
		
		JavascriptExecutor js1s11=(JavascriptExecutor)driver;
		js1s11.executeScript("window.scrollBy(0,1500)");
		System.out.println("scrolled Down");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//tr[1]//td[4]//a[2]//img[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("dfghjk");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='company_name']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("dfghj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='update']")).click();
		Thread.sleep(2000);
		// edit add latest news
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/aside[1]/div[1]/ul[1]/li[7]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Add Latest News']")).sendKeys("Add Latest News");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Add Latest News']")).click();
		Thread.sleep(2000);
		//scroll down
		JavascriptExecutor js1s12=(JavascriptExecutor)driver;
		js1s12.executeScript("window.scrollBy(0,1500)");
		System.out.println("scrolled Down");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tr[1]//td[4]//a[2]//img[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='title']")).sendKeys("dfghj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='update']")).click();
		Thread.sleep(2000);
		//edit client sitesettings
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/aside[1]/div[1]/ul[1]/li[10]/a[3]")).sendKeys("SITE SETTINGS");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/aside[1]/div[1]/ul[1]/li[10]/a[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Client Site Settings']")).sendKeys("Client Site Settings");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Client Site Settings']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='a14']//a//img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='field']")).sendKeys("dfghj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='update']")).click();
		Thread.sleep(2000);
      //edit admin sitesettings
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/aside[1]/div[1]/ul[1]/li[10]/a[3]")).sendKeys("SITE SETTINGS");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/aside[1]/div[1]/ul[1]/li[10]/a[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Admin Site Settings']")).sendKeys("Admin Site Settings");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Admin Site Settings']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/section[1]/div[1]/div[1]/div[2]/a[1]/img[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='field']")).sendKeys("sdfghjk");
		Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='update']")).click();
		Thread.sleep(2000);
		
		

		
	}


}
