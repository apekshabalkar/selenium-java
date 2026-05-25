package Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void Login2() {
	  WebDriver wd=new ChromeDriver ();  
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
}
