package psm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class delete {
	
	WebDriver driver=new ChromeDriver();
	@BeforeTest

	public void startbrowser() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//URLhttp
		driver.get("http://real-estate.itechscripts.com/admin/index.php");
		Thread.sleep(2000);
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
	@Test(priority=1)
	public void delete() throws InterruptedException {
//		//delete agent listing
//		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[4]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[4]/ul/li[1]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//tr[1]//td[5]//a[2]//img[1]")).click();
//		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
//	    Thread.sleep(5000);
//        //delete property listing
//	    driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[5]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[5]/ul/li[1]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//tr[3]//td[5]//a[2]//img[1]")).click();
//		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
//	    Thread.sleep(2000);
//	    //delete approval
//	    driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[6]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[6]/ul/li[2]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//tr[1]//td[6]//a[2]//img[1]")).click();
//		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
//	    Thread.sleep(2000);
//	    //scroll down
//	    JavascriptExecutor js1s1=(JavascriptExecutor)driver;
//	    js1s1.executeScript("window.scrollBy(0,1000)");
//        System.out.println("scrolled Down");
//        Thread.sleep(1000); 
//        //delete country name
//        driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/ul/li[1]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//select[@id='delete_cntry_field']")).sendKeys("Pakistan");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//form[3]//div[1]//div[2]//div[1]//input[1]")).click();
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
//	    Thread.sleep(5000);
//	    //scroll down
//	    JavascriptExecutor js1s2=(JavascriptExecutor)driver;
//	    js1s2.executeScript("window.scrollBy(0,2000)");
//        System.out.println("scrolled Down");
//        Thread.sleep(5000); 
//        //delete city name
//        driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/ul/li[1]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//select[@id='delete_field']")).sendKeys("Pakistan");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//select[@id='city_delete']")).sendKeys("Mumbai");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//form[6]//div[1]//div[3]//div[1]//input[1]")).click();
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
//	    Thread.sleep(5000);
//	    //scroll down
//	    JavascriptExecutor js1s3=(JavascriptExecutor)driver;
//	    js1s3.executeScript("window.scrollBy(0,500)");
//        System.out.println("scrolled Down");
//        Thread.sleep(5000);
//	    //delete form setting
//	    //delete furniture status
        
//        driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/ul/li[3]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//select[@id='delete_afs_status']")).sendKeys("furnished");
//		Thread.sleep(1000);
//	
//		driver.findElement(By.xpath("//form[3]//div[1]//div[2]//div[1]//input[1]")).click();
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
//	    Thread.sleep(5000);
//	    //scroll down
//	    JavascriptExecutor js1s4=(JavascriptExecutor)driver;
//	    js1s4.executeScript("window.scrollBy(0,500)");
//        System.out.println("scrolled Down");
//        Thread.sleep(5000);
//        //delete possession status
//        driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/ul/li[3]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//select[@id='delete_aps_id']")).sendKeys("Ready to Move");
//		Thread.sleep(1000);
//	
//		driver.findElement(By.xpath("//form[6]//div[1]//div[2]//div[1]//input[1]")).click();
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
//	    Thread.sleep(6000);
//	    //scroll down
//	    JavascriptExecutor js1s5=(JavascriptExecutor)driver;
//	    js1s5.executeScript("window.scrollBy(0,1000)");
//        System.out.println("scrolled Down");
//        Thread.sleep(5000);
//        //delete property type
//        driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/ul/li[3]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//select[@id='delete_apf_id']")).sendKeys("Sale");
//		Thread.sleep(1000);
//	
//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/section[1]/div[1]/div[1]/form[9]/div[1]/div[2]/div[1]/input[1]")).click();
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
//	    Thread.sleep(5000);
//	    //scroll down
//	    JavascriptExecutor js1s6=(JavascriptExecutor)driver;
//	    js1s6.executeScript("window.scrollBy(0,1500)");
//        System.out.println("scrolled Down");
//        Thread.sleep(1000);
//	    
//	    //delete property category
//        driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/ul/li[3]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//select[@id='delete_apt_id']")).sendKeys("Residential");
//		Thread.sleep(1000);
//	
//		driver.findElement(By.xpath("//form[12]//div[1]//div[2]//div[1]//input[1]")).click();
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
//	    Thread.sleep(5000);
//	    //scroll down
//	    
//	    JavascriptExecutor js1s7=(JavascriptExecutor)driver;
//	    js1s7.executeScript("window.scrollBy(0,2000)");
//        System.out.println("scrolled Down");
//        Thread.sleep(5000);
//	    
//	    //delete property sub category
//        
//        driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/ul/li[3]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//select[@id='delete_asp_apt_id']")).sendKeys("Residential");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//select[@id='delete_asp_id']")).sendKeys("Residential House");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//form[15]//div[1]//div[3]//div[1]//input[1]")).click();
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
//	    Thread.sleep(5000);
//	    //scroll down
//	    JavascriptExecutor js1s8=(JavascriptExecutor)driver;
//	    js1s8.executeScript("window.scrollBy(0,1000)");
//        System.out.println("scrolled Down");
//        Thread.sleep(5000);
//	    
//	    
//	    //delete client testimonial
        
        driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Add Client Testimonial']")).sendKeys("Add Client Testimonial");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Add Client Testimonial']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[1]//td[4]//a[1]//img[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	    Thread.sleep(2000);
	  //scroll down
	    JavascriptExecutor js1s9=(JavascriptExecutor)driver;
	    js1s9.executeScript("window.scrollBy(0,1500)");
        System.out.println("scrolled Down");
        Thread.sleep(5000);
//delete News Letter
        
        driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='News Letter']")).sendKeys("News Letter");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='News Letter']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[1]//td[3]//a[1]//img[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	    Thread.sleep(5000);
	    
	    


}
}
