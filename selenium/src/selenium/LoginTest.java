package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class LoginTest {

	@Test
 public void Login() throws InterruptedException{
	 
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
	    driver.findElement(By.id("title")).isDisplayed();
	    System.out.println("login works and home page open");
	 
	   
	   /* driver.get("https://www.objectspy.com/os/page/login/");
	    
	    driver.findElement(By.name("username")).sendKeys("Anusuya");
	    
	    driver.findElement(By.name("password")).sendKeys("Anusuya47");
	    
	    driver.findElement(By.name("submit")).click(); 
	    */
	   
	
	 driver.close();//close the browser
	 driver.quit();//finishes the test case
	 
	 
	}
}
