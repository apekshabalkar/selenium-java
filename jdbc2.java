package POM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbc2 {

	public static void main(String[] args) throws SQLException {
		
	WebDriver wd=new ChromeDriver();
	wd.manage().window().maximize();
	wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Connection con=DriverManager.getConnection("jdbc:mysql://@localhost:3306/quas", "root","Apeksha@1991");
	Statement st=con.createStatement();
	ResultSet res=st.executeQuery("select * from demo");
	while(res.next())
	{
	String un=res.getString(1);
	String pw=res.getString(2);
	
	}

		
		
		
		
		
		
		
		
		
	}

}
