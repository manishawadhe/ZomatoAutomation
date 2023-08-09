package Assignment;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class validateLogin {
WebDriver driver;
	
	@BeforeTest
	public void visitOnWebsite()throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String url="https://www.zomato.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		
	}
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().frame("auth-login-ui");
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("8980855163");
		driver.findElement(By.className("gXvQtR")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("(//*[name()='svg'][@role='img'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Profile')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h2[normalize-space()='Order History']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[contains(text(),'View Details')])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='sc-fVHxE iqHrKq']")).click();
		
		
		
		
	}
	
    
    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
