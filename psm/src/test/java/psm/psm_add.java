package psm;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class psm_add {

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
		public void add() throws InterruptedException {
			
		
		//membership plan
	driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='name1']")).sendKeys("opokjj");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='price']")).sendKeys("11225");
		Thread.sleep(1000);
		WebElement upload=driver.findElement(By.xpath(".//*[@id='image']"));
		upload.sendKeys("C:\\Users\\HP\\Pictures\\Screenshot\\pic.jpeg");
		Thread.sleep(1000);
		
		//add country city
		driver.findElement(By.xpath("//span[contains(text(),'Add Features')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Add Country City']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='add_country']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='add_country']")).sendKeys("sghdjj");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//form[1]//div[1]//div[2]//div[1]//input[1]")).click();
		Thread.sleep(2000);
		 driver.switchTo().alert().accept();
		 Thread.sleep(5000);
			
	
		
		//scroll down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		System.out.println("scrolled Down");
		Thread.sleep(1000);
		//add city
		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/ul/li[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='cntry_id']")).sendKeys("India");
		Thread.sleep(5000);
		
		
		
		driver.findElement(By.xpath(".//*[@id='add_city']")).sendKeys("bangalore");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='register']/div/form[4]/div[1]/div[3]/div/input")).click();
		Thread.sleep(7000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
          
           
		//add partner
		
		
		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/ul/li[2]/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='ap_name']")).sendKeys("yjjjh");
		Thread.sleep(1000);
		//upload
		WebElement upload1=driver.findElement(By.id("ap_logo"));
		upload1.sendKeys("C:\\Users\\HP\\Documents\\ATM  Requirements.docx");
	
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(2000);

			
		
	//add furniture form setting
		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
		Thread.sleep(1000);
			
		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/ul/li[3]/a")).click();
		Thread.sleep(1000);
			
		driver.findElement(By.name("afs_status")).sendKeys("tyeh");
		Thread.sleep(1000);
		
		driver.findElement(By.name("update")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	Thread.sleep(5000);
		
		
		//scroll down
		
		JavascriptExecutor js4=(JavascriptExecutor)driver;
		js4.executeScript("window.scrollBy(0,1500)");
		System.out.println("scrolled Down");
	Thread.sleep(1000);
		
		
		
		
		//add possession status
				driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
				Thread.sleep(1000);
					
				driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/ul/li[3]/a")).click();
				Thread.sleep(1000);
					
				driver.findElement(By.xpath(".//*[@id='aps_type']")).sendKeys("tyeh");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath(".//*[@id='register']/div/form[4]/div[1]/div[2]/div/input")).click();
				Thread.sleep(1000);
				
				driver.switchTo().alert().accept();
			     Thread.sleep(5000);
			//scroll down
			     
			    JavascriptExecutor js5=(JavascriptExecutor)driver;
				js5.executeScript("window.scrollBy(0,2000)");
				System.out.println("scrolled Down");
				Thread.sleep(1000);
					
			     
	 //add property type
			     
			     
		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
		Thread.sleep(1000);
						
		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/ul/li[3]/a")).click();
		Thread.sleep(1000);
						
		driver.findElement(By.xpath("//input[@id='apf_name']")).sendKeys("tyeh");
		Thread.sleep(1000);
					
		driver.findElement(By.xpath(".//*[@id='register']/div/form[7]/div[1]/div[2]/div/input")).click();
		Thread.sleep(1000);
					
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
			     
			//scroll down     
		 JavascriptExecutor js6=(JavascriptExecutor)driver;
			js6.executeScript("window.scrollBy(0,2000)");
			System.out.println("scrolled Down");
			Thread.sleep(1000); 
		
	//add property category
         driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/ul/li[3]/a")).click();
	     Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//*[@id='apt_name']")).sendKeys("ghfdsfgjk");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='register']/div/form[10]/div[1]/div[2]/div/input")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		
		//scroll down
		JavascriptExecutor js7=(JavascriptExecutor)driver;
		js7.executeScript("window.scrollBy(0,2200)");
		System.out.println("scrolled Down");
		Thread.sleep(1000);
		
		//add property sub category
		
		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/ul/li[3]/a")).click();
	    Thread.sleep(1000);
		
		driver.findElement(By.xpath("//select[@id='pc_apt_id']")).sendKeys("Commercial");
		Thread.sleep(1000);
		driver.findElement(By.id("asp_name")).sendKeys("ghfdsfgjkgh");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form[13]//div[1]//div[3]//div[1]//input[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
		//add client testimonial
		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		//scroll down

		
		
		driver.findElement(By.xpath("//a[text()='Add Client Testimonial']")).sendKeys("Add Client Testimonial");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Add Client Testimonial']")).click();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("fgtred");
		Thread.sleep(1000);
		//upload
		WebElement upload2=driver.findElement(By.id("ap_logo"));
		upload2.sendKeys("C:\\Users\\HP\\Pictures\\Screenshot\\pic.jpeg");
	
		driver.findElement(By.id("company_name")).sendKeys("fgdse");
		Thread.sleep(1000);
		driver.findElement(By.id("company_url")).sendKeys("ghytty");
		Thread.sleep(1000);
		driver.findElement(By.id("description")).sendKeys("gdhdj");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		
		//add latest news

		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Add Latest News']")).sendKeys("Add Letest News");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Add Latest News']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("title")).sendKeys("fgdse");
		Thread.sleep(1000);
		driver.findElement(By.id("news")).sendKeys("ghytty");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		
		//news letter
		driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[7]/a")).click();
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='News Letter']")).sendKeys("News Letter");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='News Letter']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("title")).sendKeys("dhdjj");
		Thread.sleep(1000);
		driver.findElement(By.id("news")).sendKeys("ddkkd");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	    Thread.sleep(1000);
	
		
		
		
		}
	
	
	
	
}
