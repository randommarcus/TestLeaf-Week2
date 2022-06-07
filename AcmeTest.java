package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://acme-test.uipath.com/login");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[text()='Email:']/following-sibling::input")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//label[text()='Password:']/following-sibling::input")).sendKeys("leaf@12");
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//form[@id='logout-form']/following-sibling::li/a")).click();
		
		driver.close();

	}

}
