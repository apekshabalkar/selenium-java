package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Grouping {
  WebDriver wd;
  
  @Test (priority=0 , groups = {"smoke"})
  public void Login() throws InterruptedException 
  {
  wd=new ChromeDriver();  
  Thread.sleep(2000);
  
  wd.get("https://www.saucedemo.com");
  Thread.sleep(2000);
  
  wd.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
  Thread.sleep(2000);
  
  wd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
  Thread.sleep(2000);
  }
  @Test (priority=1 , groups ={"sanity"})
  public void Logout() 
  {
  wd.findElement(By.xpath("//*[@id=\"login-button\"]")).click(); 
  }
}
