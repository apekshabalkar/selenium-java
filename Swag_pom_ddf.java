package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag_pom_ddf {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream fi = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Selenium\\Login.xlsx");
		XSSFWorkbook wk = new XSSFWorkbook(fi);
		Thread.sleep(2000);
		XSSFSheet sh = wk.getSheetAt(1);
		XSSFRow rw;
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			Thread.sleep(2000);
			rw=sh.getRow(i);
			Thread.sleep(2000);
			XSSFCell un=rw.getCell(0);
			Thread.sleep(2000);
			XSSFCell pw=rw.getCell(1);
			Thread.sleep(2000);
			pom_ddf_login li=new pom_ddf_login(wd);
			Thread.sleep(2000);
			pom_ddf_logout lo=new pom_ddf_logout(wd);
			Thread.sleep(2000);
			li.username(un.toString());
			Thread.sleep(2000);
			li.password(pw.toString());
			Thread.sleep(2000);
			li.login();
			Thread.sleep(2000);
			lo.logout();
		}
		
	}
}
