package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Joane");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Joseph");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("joane@joseph.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("joane@123");
		
		WebElement eleday = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select day = new Select(eleday);
		day.selectByValue("24");
		
		WebElement elemon = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select mon = new Select(elemon);
		mon.selectByValue("8");
		
		WebElement eleyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select year = new Select(eleyear);
		year.selectByValue("1998");
		
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
	}

}
