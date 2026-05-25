package POM;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ex1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
	WebDriver wd=new ChromeDriver ();
	wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(2000);
	
	wd.manage().window().maximize();
	Thread.sleep(2000);
		
	ExtentReports es=new ExtentReports ();
	Thread.sleep(2000);
	
	ExtentSparkReporter er=new ExtentSparkReporter ("C:\\Users\\Lenovo\\Desktop\\Study\\Java\\Report");
	Thread.sleep(2000);
	es.attachReporter(er);
	ExtentTest ts;
	
	ts=es.createTest("Login fun with swag lab");
	Thread.sleep(2000);
	
	ts.info("open url");
	wd.get("https://www.saucedemo.com");
	Thread.sleep(2000);
	
	ts.info("Username");
	Thread.sleep(2000);
	
	ts.info("enter username");
	wd.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	Thread.sleep(2000);
	
	ts.info("enter password");
	wd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	
	ts.info("click on login");
	wd.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	Thread.sleep(2000);
	
	ts.log(Status.PASS, "login sucessful");
	es.flush();
	
		
	}

}
