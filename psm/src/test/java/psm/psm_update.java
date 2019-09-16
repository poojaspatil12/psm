package psm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class psm_update {
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
	 @Test(priority=1)
	 public void update() throws InterruptedException {
		//update country
		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//a[text()='Add Country City']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//select[@id='update_cntry']")).sendKeys("Pakistan");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='new_country']")).sendKeys("sdfgh");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//form[2]//div[1]//div[3]//div[1]//input[1]")).click();
    	Thread.sleep(1000);
    	driver.switchTo().alert().accept();
    	Thread.sleep(1000);
    	
    	//scroll down
    	JavascriptExecutor js10=(JavascriptExecutor)driver;
         js10.executeScript("window.scrollBy(0,1000)");
        System.out.println("scrolled Down");
        Thread.sleep(1000); 
        
        //update city
        driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/ul/li[1]/a")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//select[@id='update_field']")).sendKeys("Bangla");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//select[@id='city_update']")).sendKeys("Delhi");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='update_city']")).sendKeys("dfgh");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//div[4]//div[1]//input[1]")).click();
    	Thread.sleep(1000);
    	driver.switchTo().alert().accept();
    	Thread.sleep(1000);
 	//update furniture status
	
				driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/ul/li[3]/a")).click();
		   	    Thread.sleep(1000);
		     	driver.findElement(By.xpath("//select[@id='update_afs_status']")).sendKeys("furnished");
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("//input[@id='new_afs_status']")).sendKeys("dfghj");
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("//form[2]//div[1]//div[3]//div[1]//input[1]")).click();
		    	Thread.sleep(1000);
		    	driver.switchTo().alert().accept();
		    	Thread.sleep(1000);
		    	
		    	//scroll down
		   	     JavascriptExecutor js11=(JavascriptExecutor)driver;
				js11.executeScript("window.scrollBy(0,1000)");
		        System.out.println("scrolled Down");
		        Thread.sleep(1000); 
		        
        //update possession status
		        driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/ul/li[3]/a")).click();
		   	    Thread.sleep(1000);
		     	driver.findElement(By.id("aps_id")).sendKeys("Under Construction");
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("//input[@id='new_aps_type']")).sendKeys("cdfgh");
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("//form[5]//div[1]//div[3]//div[1]//input[1]")).click();
		    	Thread.sleep(2000);
		    	driver.switchTo().alert().accept();
		    	Thread.sleep(2000);
		    	
		    	
		    	//scroll down
		   	     JavascriptExecutor js12=(JavascriptExecutor)driver;
				js12.executeScript("window.scrollBy(0,1500)");
		        System.out.println("scrolled Down");
		        Thread.sleep(1000);
		        
		        
		        
		    	//update property type
		    	  driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/ul/li[3]/a")).click();
			   	    Thread.sleep(1000);
			     	driver.findElement(By.xpath("//select[@id='apf_id']")).sendKeys("Sale");
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("//input[@id='new_apf_name']")).sendKeys("sdfgh");
			    	Thread.sleep(1000);
			    	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/section[1]/div[1]/div[1]/form[8]/div[1]/div[3]/div[1]/input[1]")).click();
			    	Thread.sleep(5000);
			    	driver.switchTo().alert().accept();
			    	Thread.sleep(5000);  
			    	
			    	//scroll down
			    	 JavascriptExecutor js111=(JavascriptExecutor)driver;
						js111.executeScript("window.scrollBy(0,2000)");
				        System.out.println("scrolled Down");
				        Thread.sleep(1000); 
				        
			    	
			    	//update property category
			    	 driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
				    	Thread.sleep(1000);
				    	driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/ul/li[3]/a")).click();
				   	    Thread.sleep(1000);
				     	driver.findElement(By.xpath("//select[@id='apt_id']")).sendKeys("Agriculture");
				    	Thread.sleep(1000);
				    	driver.findElement(By.xpath("//input[@id='new_apt_name']")).sendKeys("ghjdfgh");
				    	Thread.sleep(1000);
				    	driver.findElement(By.xpath("//form[11]//div[1]//div[3]//div[1]//input[1]")).click();
				    	Thread.sleep(2000);
				    	driver.switchTo().alert().accept();
				    	Thread.sleep(2000);
				    	
				    	//scroll down
				    	 JavascriptExecutor js1111=(JavascriptExecutor)driver;
							js1111.executeScript("window.scrollBy(0,2200)");
					        System.out.println("scrolled Down");
					        Thread.sleep(1000);
					      //update property sub category
					    	 driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
						    	Thread.sleep(1000);
						    	driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/ul/li[3]/a")).click();
						   	    Thread.sleep(1000);
						     	driver.findElement(By.xpath("//select[@id='asp_apt_id']")).sendKeys("Agriculture");
						    	Thread.sleep(1000);
						    	driver.findElement(By.xpath("//select[@id='asp_apt_id']")).click();
						    	Thread.sleep(1000);
						    	driver.findElement(By.xpath("//select[@id='asp_apt_id']/option[1]")).click();
						    	Thread.sleep(1000);
						    	driver.findElement(By.xpath("//input[@id='update_asp_name']")).sendKeys("rfghjfg");
						    	Thread.sleep(2000);
						    	driver.findElement(By.xpath("//div[4]//div[1]//input[1]")).click();
						    	Thread.sleep(2000);

						    	
						    	driver.switchTo().alert().accept();
						    	Thread.sleep(2000);
	  }
		

}
