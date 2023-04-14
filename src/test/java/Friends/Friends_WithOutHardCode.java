package Friends;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Friends_WithOutHardCode {

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
driver.findElement(By.linkText("Friends")).click();
driver.findElement(By.xpath("//span[text()='Friend requests' and contains(@class,'x193iq5w xeuugli ')]")).click();
driver.findElement(By.xpath("//input[@aria-label='Search Facebook']")).sendKeys("shyam");
driver.findElement(By.xpath("//span[.='shyam' and contains(@class,'x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft')]")).click();
	}

}
