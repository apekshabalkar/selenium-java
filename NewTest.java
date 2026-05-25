package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class NewTest {
  WebDriver wd;
  @Test(dataProvider = "dp")
  public void f(String un, String pw) 
  {
  wd=new ChromeDriver();
  wd.get("https://www.saucedemo.com");  
  wd.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
  wd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
  wd.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "standard_user ", "secret_sauce" },
      new Object[] { "ffff", "bbbb" },
    };
  }
}
