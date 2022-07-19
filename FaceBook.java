package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Bala");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("vasu");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Bala7@gmai.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Bala007");
		
		Select date1 = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		date1.selectByVisibleText("10");
		
		/*WebElement bdate=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select date=new Select(bdate);
		date.deselectByIndex(10);*/
		
		WebElement bmonth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month=new Select(bmonth);
		month.selectByVisibleText("Jun");
		WebElement byear=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select year=new Select(byear);
		year.selectByValue("1980");
		WebElement f=driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		f.click();

	}

}
