package MiniProject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Front_Task {

public static void main(String[] args) throws InterruptedException {
	WebDriver wd = new ChromeDriver();
	wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(2000);

	wd.manage().window().maximize();
	Thread.sleep(2000);

//Url
   wd.get("https://quastechproject.com/projects/frontaccounting/access/logout.php");
   Thread.sleep(2000);

//Click on login button
	wd.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table[2]/tbody/tr[5]/td/div/a/b")).click();
	Thread.sleep(2000);

//Username
	wd.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr[3]/td[2]/input")).sendKeys("fauser01");
	Thread.sleep(2000);

//Password
	wd.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr[4]/td[2]/input")).sendKeys("fauser01");
	Thread.sleep(2000);

//Company
	Select sc = new Select(
			wd.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr[5]/td[2]/select")));
	sc.selectByIndex(1);
	Thread.sleep(2000);

//Login button
	wd.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[2]/input")).click();
	Thread.sleep(2000);

//Sales Quotation
	wd.findElement(By.xpath("_el69ce411c8bc8f9.15471418")).click();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	}

}
