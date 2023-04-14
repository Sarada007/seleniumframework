package Logout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Logout_WithoutHardCode {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./src/test/resources/facebookdata.properties");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String Email = p.getProperty("Email");
		String password = p.getProperty("password");
		//open application
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();	
		driver.findElement(By.xpath("//*[name()='svg'and@ aria-label='Your profile'] ")).click();
		driver.findElement(By.xpath("//span[.='Log Out']")).click();
		driver.close();
	}

}
