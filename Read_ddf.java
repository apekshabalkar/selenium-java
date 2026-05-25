package Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_ddf {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		wd.get("https://www.saucedemo.com");

		FileInputStream fi = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\automation\\Login.xlsx");
		XSSFWorkbook wk = new XSSFWorkbook(fi);

		XSSFSheet sheet = wk.getSheetAt(0);
		XSSFRow rw;
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			rw = sheet.getRow(i);
			XSSFCell un = rw.getCell(0);
			XSSFCell pw = rw.getCell(1);

			// username
			wd.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
			wd.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(un.toString());
			Thread.sleep(2000);

			// password
			wd.findElement(By.xpath("//*[@id=\"password\"]")).clear();
			wd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pw.toString());
			Thread.sleep(2000);

			// login
			wd.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
			Thread.sleep(2000);

			try {
				wd.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
				Thread.sleep(2000);
				wd.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
			} catch (Exception e) {

				System.out.println("Invalid data");
			}
		}

	}
}
