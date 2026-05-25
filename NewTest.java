package Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void Login() 
  {
	WebDriver wd=new ChromeDriver ();  
	wd.get("https://www.saucedemo.com");
  }
}
