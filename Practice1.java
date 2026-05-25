package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class Practice1 {
  WebDriver wd;
  @Test(dataProvider = "dp")
  public void Login(String un, String pw) throws InterruptedException 
  {
  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  Thread.sleep(2000);
  
  wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(un);
  Thread.sleep(2000);
  
  wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(pw);
  Thread.sleep(2000);
  
  wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
  Thread.sleep(2000);
  }
  
  @BeforeTest
  public void beforetest ()
  {
  wd=new ChromeDriver();
  }
  
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "ffff", "bbb" },
    };
  }
}
