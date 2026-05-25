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

public class task {

	public static void main(String[] args) throws InterruptedException, SQLException {

		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);

		Connection con = DriverManager.getConnection("jdbc:mysql://@localhost:3306/quas", "root", "Apeksha@1991");
		Statement st = con.createStatement();

		ResultSet res = st.executeQuery("select * from demoqa");
		while (res.next()) {
			String fn = res.getString(1);
			String ln = res.getString(2);

			wd.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("apeksha");
			Thread.sleep(2000);

			wd.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("balkar");
			Thread.sleep(2000);

			wd.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("abc@gmail.com");
			Thread.sleep(2000);

			wd.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("989256738");
			Thread.sleep(2000);

			wd.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]/div[2]")).sendKeys("English");
			Thread.sleep(2000);

			wd.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("Mumbai");
			Thread.sleep(2000);

		}

	}
}