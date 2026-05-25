package POM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbc1 { 

	public static void main(String[] args) throws InterruptedException, SQLException {
		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wd.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		Connection con = DriverManager.getConnection("jdbc:mysql://@localhost:3306/quas", "root", "Apeksha@1991");
		Statement st = con.createStatement();
		ResultSet res = st.executeQuery("select * from demo");
		while (res.next()) 

		{
			String un = res.getString(1); //used varchar
			String pw = res.getString(2);
			wd.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(un);
			Thread.sleep(2000);
			wd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pw);
			Thread.sleep(2000);
			wd.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
			Thread.sleep(2000);
			wd.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
			Thread.sleep(2000);
			wd.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
			Thread.sleep(2000);

		}

	}

}
