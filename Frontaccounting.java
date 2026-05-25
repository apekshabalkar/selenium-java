package MiniProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Frontaccounting {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);

		wd.manage().window().maximize();
		Thread.sleep(2000);

//url
	   wd.get("https://quastechproject.com/projects/frontaccounting/access/logout.php");
	   Thread.sleep(2000);

//click on login button
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

//Sales

		Actions act = new Actions(wd);

		act.moveToElement(wd.findElement(By.xpath(
				"/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[1]/tbody/tr/td/div/a[1]")))
				.perform();
		Thread.sleep(2000);

		act.moveToElement(wd.findElement(By.xpath(
				"/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[1]/tbody/tr/td/div/a[2]")))
				.perform();
		Thread.sleep(2000);

		act.moveToElement(wd.findElement(By.xpath(
				"/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[1]/tbody/tr/td/div/a[3]")))
				.perform();
		Thread.sleep(2000);

		act.moveToElement(wd.findElement(By.xpath(
				"/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[1]/tbody/tr/td/div/a[4]")))
				.perform();
		Thread.sleep(2000);

		act.moveToElement(wd.findElement(By.xpath(
				"/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[1]/tbody/tr/td/div/a[5]")))
				.perform();
		Thread.sleep(2000);

		act.moveToElement(wd.findElement(By.xpath(
				"/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[1]/tbody/tr/td/div/a[6]")))
				.perform();
		Thread.sleep(2000);

		act.moveToElement(wd.findElement(By.xpath(
				"/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[1]/tbody/tr/td/div/a[7]")))
				.perform();
		Thread.sleep(2000);

		act.moveToElement(wd.findElement(By.xpath(
				"/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[1]/tbody/tr/td/div/a[8]/u")))
				.perform();
		Thread.sleep(2000);

//Logout
		wd.findElement(By.xpath(
				"/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr[1]/td[3]/a[5]"))
				.click();

//Screenshot
	
		TakesScreenshot ts = (TakesScreenshot) wd;
		File sor = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Lenovo\\Desktop\\Study\\Screenshot\\ss5.jpg");
		Files.copy(sor, des);

	}

}
