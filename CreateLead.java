package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		String ts= driver.getTitle();
		System.out.println(ts);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("A2Brothers");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bala");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("vasu");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Yaksh");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("RAW");
		driver.findElement(By.name("description")).sendKeys("This my Assignment");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bala2vasu@gmail.com");
		WebElement state=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select state1=new Select(state);
		state1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();

		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		
		
		
	}

}
