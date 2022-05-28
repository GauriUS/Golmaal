package Browser_launch;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser
{
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();        //upcasting
		
		driver.get("https://www.facebook.com/login/");  
		
		Thread.sleep(2000);    // hold for sometime
		
	//	driver.navigate().to("https://www.instagram.com/accounts/login/?hl=en");
		
	//	Thread.sleep(2000);
		
	//	driver.navigate().back(); //backward 
		
	//	Thread.sleep(2000);
		
	//	driver.navigate().forward();   //forward
		
	//	Thread.sleep(2000);
		
//		driver.navigate().refresh();   //reload
		
//		Thread.sleep(2000);
		
		
	//	String url=driver.getCurrentUrl();       //current web page will open
	//	System.out.println(url);
		
		
	//	String Title=driver.getTitle();          //it we give us title of current web page
	//	System.out.println(Title);
		
	//	driver.manage().window().maximize();
		
		
	//	driver.manage().window().minimize();
	//	Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
	//	driver.close();   // to close the current Tab of browser open by selenium
		
	//	driver.quit();     // to close the browser open by selenium(all tab)
		Thread.sleep(2000);
		
	/*	Dimension d= new Dimension(500,700); //W,H   pixel   // resize of browser
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		Point p=new Point(200,300);        //change the size of browser
		driver.manage().window().setPosition(p);
	*/	Thread.sleep(2000);
			WebElement userName =driver.findElement(By.id("email")) ;
	userName.sendKeys(" Velocity 5TH batch");
	
	WebElement user =driver.findElement(By.id("pass")) ;
	
	user.sendKeys(" Velocity");
	
	user.sendKeys("gfhfghfhttd");
	WebElement user1 =driver.findElement(By.name("login")) ;
	Thread.sleep(2000);
	
	user1.click();
	
		
	}
	
	

}
