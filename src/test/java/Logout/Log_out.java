package Logout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Log_out {
	public static void main(String[]arg) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("saradaprasadsarangi99@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Ghost@123456");
		driver.findElement(By.name("login")).click();	
		driver.findElement(By.xpath("//*[name()='svg'and@ aria-label='Your profile'] ")).click();
		driver.findElement(By.xpath("//span[.='Log Out']")).click();
		driver.close();
	}
}

