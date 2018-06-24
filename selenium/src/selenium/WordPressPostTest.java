package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WordPressPostTest {

	@Test
	 public void Post() throws InterruptedException{
		 
		//chrome browser will open with the help of chrome driver.location provided for the chrome 
		System.setProperty("webdriver.chrome.driver", "C:\\auto2\\chromedriver.exe"); // Object command for locating chrome driver
		 
		    WebDriver driver = new ChromeDriver();
		   //driver object reference access all the built in function in selenium.
		  
		    
		    
		    driver.manage().window().maximize(); // maximizes window
		    
		 //driver.get takes you to the designated website
		   driver.get("http://demosite.center/wordpress/wp-login.php?loggedout=true"); 
		    
		    driver.findElement(By.id("user_login")).sendKeys("admin");
		    
		    driver.findElement(By.id("user_pass")).sendKeys("demo123");
		    	       
		    driver.findElement(By.id("wp-submit")).click();
		    
		    //if you want to pause the website before enter into homepage
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//*[@class='wp-has-submenu wp-not-current-submenu open-if-no-js menu-top menu-icon-post menu-top-first']//*[text()='Posts']")).click();
		    
		    Thread.sleep(3000);
		    
		    driver.close();
		    driver.quit();
}
}
