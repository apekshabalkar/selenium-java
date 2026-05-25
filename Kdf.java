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

public class Kdf {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream fi = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Selenium\\Login.xlsx");
		XSSFWorkbook wk = new XSSFWorkbook(fi);
		Thread.sleep(2000);
		XSSFSheet sh = wk.getSheetAt(2);
		XSSFRow rw;

		for (int i = 1; i <= sh.getLastRowNum(); i++) {
			rw = sh.getRow(i);
			XSSFCell key = rw.getCell(1); //row 1

			switch (key.toString()) {
			
			case "url":
				Thread.sleep(2000);
				wd.get("https://www.saucedemo.com/");
				break;

			case "username":
				Thread.sleep(2000);
				wd.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
				wd.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
				break;

			case "password":
				Thread.sleep(2000);
				wd.findElement(By.xpath("//*[@id=\"password\"]")).clear();
				wd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
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
