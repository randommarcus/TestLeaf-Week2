package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("GizmoChina");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Joel");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Joseph");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anvin");
		driver.findElement(By.name("departmentName")).sendKeys("Management");
		driver.findElement(By.name("description")).sendKeys("This is a sample text.");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("joel@gizmochina.com");
		
		WebElement dropDown = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd = new Select(dropDown);
		dd.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println(title);

	}

}
