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

public class Hdf {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream fi = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Selenium\\Login.xlsx");
		XSSFWorkbook wk = new XSSFWorkbook(fi);
		Thread.sleep(2000);
		XSSFSheet sh = wk.getSheetAt(0); //HDF
		XSSFSheet sh1 = wk.getSheetAt(0); //HDF
		XSSFRow rw;

		for (int j = 1; j <= sh1.getLastRowNum(); j++) { //HDF
			rw = sh.getRow(j);
			XSSFCell un = rw.getCell(0);
			XSSFCell pw = rw.getCell(1);

			for (int i = 1; i <= sh.getLastRowNum(); i++) {
				rw = sh.getRow(i);
				XSSFCell key = rw.getCell(1); // row 1

				switch (key.toString()) {

				case "url":
					Thread.sleep(2000);
					wd.get("https://www.saucedemo.com/");
					break;

				case "username":
					Thread.sleep(2000);
					wd.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
					wd.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(un.toString());
					break;

				case "password":
					Thread.sleep(2000);
					wd.findElement(By.xpath("//*[@id=\"password\"]")).clear();
					wd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pw.toString());
					break;

				case "login":
					Thread.sleep(2000);
					wd.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
					break;

				case "logout":
					Thread.sleep(2000);
					wd.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();

					wd.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
					break;

				default:
					break;
				}
			}

		}

	}
}