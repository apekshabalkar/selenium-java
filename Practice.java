package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice {
  WebDriver wd;
  @Test (priority=0, groups= {"smoke"})
  public void Login() throws InterruptedException 
  {
  wd=new ChromeDriver ();
  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
  Thread.sleep(2000);
  
  wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
  Thread.sleep(2000);
  
  wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
  Thread.sleep(2000);
  
  wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
  Thread.sleep(2000);
  
  }
  @Test (priority=1 , groups= {"sanity"})
  public void Logout() throws InterruptedException 
  {
   wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span")).click();
   Thread.sleep(2000);
   
   wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
   Thread.sleep(2000);
   
  }
  }

