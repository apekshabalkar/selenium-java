package MiniProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Project {

	public static void main(String[] args) throws InterruptedException {

//Url
		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);

		wd.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);

		wd.manage().window().maximize();
		Thread.sleep(2000);

		Actions act = new Actions(wd);
		act.scrollByAmount(0, 600).perform();
		Thread.sleep(2000);

//User-name enter
		wd.manage().window().maximize();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Apeksha");
		Thread.sleep(2000);

//Email-id enter
		wd.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("apeksha.ashinde@gmail.com");
		Thread.sleep(2000);

//Phone-no enter
		wd.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9982088910");
		Thread.sleep(2000);

//Address enter
		wd.findElement(By.xpath("//*[@id=\"textarea\"]")).sendKeys("Plot 109 Bandra West Mumbai-400067");
		Thread.sleep(2000);

//Gender enter
		wd.findElement(By.xpath("//*[@id=\"female\"]")).click();
		Thread.sleep(2000);

//Days enter
		wd.findElement(By.xpath("//*[@id=\"monday\"]")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"tuesday\"]")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"wednesday\"]")).click();
		Thread.sleep(2000);

//Select Country 
		Select sc = new Select(wd.findElement(By.xpath("//*[@id=\"country\"]")));

		sc.selectByIndex(9);

//Select Colors
		wd.findElement(By.xpath("//*[@id=\"colors\"]/option[1]")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"colors\"]/option[2]")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"colors\"]/option[3]")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"colors\"]/option[4]")).click();
		Thread.sleep(2000);

//Select Sorted List		

		wd.findElement(By.xpath("//*[@id=\"animals\"]/option[1]")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"animals\"]/option[2] ")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"animals\"]/option[4]")).click();
		Thread.sleep(2000);

//Date picker 

		wd.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[2]/a")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"txtDate\"]")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[5]/a")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"start-date\"]")).sendKeys("04-03-2026");
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"end-date\"]")).sendKeys("19-03-2026");
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[8]/button")).click();
		Thread.sleep(2000);

//Pagination Web Table

		wd.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[1]/td[4]/input")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[3]/td[4]/input")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[5]/td[4]/input")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"pagination\"]/li[4]/a")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[1]/td[4]/input")).click();
		Thread.sleep(2000);

//Form
		wd.findElement(By.xpath("//*[@id=\"input1\"]")).sendKeys("Read");
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"btn1\"]")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"input2\"]")).sendKeys("Write");
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"btn2\"]")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"input3\"]")).sendKeys("Update");
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"btn3\"]")).click();
		Thread.sleep(2000);

//Footer links		

		wd.findElement(By.xpath("//*[@id=\"PageList1\"]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"input1\"]")).sendKeys("Testing");
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		Thread.sleep(2000);

//download files

		wd.findElement(By.xpath("//*[@id=\"PageList1\"]/div/ul/li[3]/a")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"inputText\"]")).sendKeys("Automation Testing");
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"generateTxt\"]")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"txtDownloadLink\"]")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"generatePdf\"]")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"generatePdf\"]")).click();
		Thread.sleep(2000);

//Tabs
		wd.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("Testing");
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input")).click();
		Thread.sleep(2000);

//Dynamic Button

		wd.findElement(By.xpath("//*[@id=\"HTML5\"]/div[1]/button")).click();
		Thread.sleep(2000);

//Alerts & Pop-ups

		wd.findElement(By.xpath("//*[@id=\"alertBtn\"]")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"confirmBtn\"]")).click();
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"promptBtn\"]")).click();
		Thread.sleep(2000);

//Mouse Hover

		Actions act1 = new Actions(wd);

		act1.moveToElement(wd.findElement(By.xpath("//*[@id=\"HTML3\"]/div[1]/div/button"))).perform();

		act1.moveToElement(wd.findElement(By.xpath("//*[@id=\"HTML3\"]/div[1]/div/div/a[1]"))).perform();
		Thread.sleep(2000);

		act1.moveToElement(wd.findElement(By.xpath("//*[@id=\"HTML3\"]/div[1]/div/div/a[2]"))).perform();
		Thread.sleep(2000);

//Double Click

		Actions act2 = new Actions(wd);

		WebElement c = wd.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
		act2.doubleClick(c).perform();
		Thread.sleep(2000);

//Drag and Drop

		WebElement sou = wd.findElement(By.xpath("//*[@id=\"draggable\"]"));
		Thread.sleep(2000);

		WebElement des = wd.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Thread.sleep(2000);

		Actions act3 = new Actions(wd);
		Thread.sleep(2000);

		act3.dragAndDrop(sou, des).build().perform();

//Slider

		WebElement Slider1 = wd.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		Thread.sleep(2000);

		WebElement Slider2 = wd.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		Thread.sleep(2000);

		Actions act4 = new Actions(wd);
		Thread.sleep(2000);
		act4.dragAndDropBy(Slider1, 20, 0).perform();
		Thread.sleep(2000);
		act4.dragAndDropBy(Slider1, 0, 10).perform();

//Scrolling DropDown

		wd.findElement(By.xpath("//*[@id=\"comboBox\"]"));
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"dropdown\"]/div[2]"));
		Thread.sleep(2000);

//Laptop Links 

		wd.findElement(By.xpath("//*[@id=\"comboBox\"]")).click();
		Thread.sleep(2000);

	}

}
