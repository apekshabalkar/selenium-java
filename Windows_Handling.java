package Automation;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wd.manage().window().maximize();
		Thread.sleep(2000);

		wd.get("https://demo.guru99.com/popup.php");
		Thread.sleep(2000);

		String para_id = wd.getWindowHandle();
		Thread.sleep(2000);

		wd.findElement(By.xpath("/html/body/p[1]/a")).click();
		Thread.sleep(2000);

		Set<String> child_id = wd.getWindowHandles();
		System.out.println(child_id);
		Thread.sleep(2000);

		for (String temp : child_id) {
			if (!(para_id.equals(temp)))
			{
				wd.switchTo().window(temp);
				wd.navigate().refresh();
				Thread.sleep(2000);
				wd.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abcd@gmail.com");
				Thread.sleep(2000);
				wd.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				Thread.sleep(2000);
				String tit=wd.getTitle();
				System.out.println(tit);	
				
			}

		}

	}

}
