package Login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Login_WithOutHardCode {
	@Test

	public static void laduLalit() throws Throwable {
		
	
		
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("./src/test/resources/facebookdata.properties");
		p.load(fis);
		String url = p.getProperty("url");
		String Email = p.getProperty("Email");
		String password = p.getProperty("password");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		//open application
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		//login as user
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();	
	}

}
