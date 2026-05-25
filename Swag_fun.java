package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag_fun 
{

	public static void main(String[] args)
	{
		WebDriver wd=new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		wd.get("https://www.saucedemo.com");
	    Login_repo li=new Login_repo(wd);
	    Logout_repo lo=new Logout_repo(wd);
	    
		li.username();
		li.password();
		li.login();
		lo.logout();
			
	}

}
