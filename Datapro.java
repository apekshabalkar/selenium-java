package TestNG;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datapro {
	WebDriver wd;
  @Test(dataProvider = "dp")
  public void Login(String un , String pw) throws InterruptedException 
  {

	  wd.get("https://www.saucedemo.com");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  Thread.sleep(2000);
	  
	  wd.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(un);
	  Thread.sleep(2000);
	  
	  wd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pw);
	  Thread.sleep(2000);
	  
	  wd.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
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
      new Object[] { "standard_user", "secret_sauce" },
      new Object[] { "ddd", "bbb" },
      new Object[] { "problem_user", "secret_sauce" },
    };
  }
}
