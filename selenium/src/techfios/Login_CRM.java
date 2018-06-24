package techfios;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_CRM  {
	
	@Test
public void Login_page() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\auto2\\chromedriver.exe");
	
    WebDriver driver = new ChromeDriver();
  
    
    driver.manage().window().maximize(); 
    

   driver.get("http://techfios.com/test/billing/?ng=admin/"); 
    
    driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
    driver.findElement(By.id("password")).sendKeys("abc123");
    
    driver.findElement(By.name("login")).click();
    
    driver.findElement(By.xpath("//text()[contains(.,'CRM')]/ancestor::a[1]")).click();
    driver.findElement(By.xpath("//a[text()='Add Contact']")).click();
    
    driver.findElement(By.id("account")).sendKeys("John Abraham");
    driver.findElement(By.id("company")).sendKeys("Starbucks");
    driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
    driver.findElement(By.id("phone")).sendKeys("1234567890");
    driver.findElement(By.id("address")).sendKeys("apt 12,allenwood street");
    driver.findElement(By.id("city")).sendKeys("Dallas");
    driver.findElement(By.id("state")).sendKeys("Texas");
    driver.findElement(By.id("zip")).sendKeys("75234");
    driver.findElement(By.id("submit")).click();
    
    //check weather the contact already in the list or not
  /* if(driver.findElements(By.id("emsg")).isEmpty()){
       System.out.println("Contact successfully add in the list");
    }else{
    	 
    	  System.out.println("This contact already in the list");
    }*/
    
    Thread.sleep(3000);
    
    driver.close();
    driver.quit();
    
   
    
}
}
