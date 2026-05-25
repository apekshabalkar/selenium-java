package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example {
  WebDriver wd;
  @Test  (priority=0 , groups= {"sanity"})
  public void Login() throws InterruptedException 
  {
  wd.get("https://www.saucedemo.com");  
  Thread.sleep(2000);
  
  wd.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
  Thread.sleep(2000);
  
  wd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
  Thread.sleep(2000);
  
  wd.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
  Thread.sleep(2000);
  
  }
  @Test  (priority =1 , groups = {"smoke"})
  public void beforeTest() throws InterruptedException 
  {
  wd= new ChromeDriver ();
  Thread.sleep(2000);
  
  }

}
