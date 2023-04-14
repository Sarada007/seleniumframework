package Login;
import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.html5.AddApplicationCache;

import com.genericutility.FileUtility;
import com.pageobjectry.Friends_page;
import com.pageobjectry.Login_page;
import com.pageobjectry.Logout_page;

public class LoginPom_Class {

	public static void main(String[] args) throws Throwable {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver .manage().window().maximize();
		
		FileUtility f=new FileUtility();
		String Url = f.getPropertyKeyValue("url");
		String EmailTx = f.getPropertyKeyValue("Email");
		String Pwdtx=f.getPropertyKeyValue("password");
		driver.get(Url);
		Login_page lp=new Login_page(driver);
		lp.openLogin(driver);
		Friends_page fp=new Friends_page(driver);
		fp.friendsOperation();
		Logout_page logp=new Logout_page(driver);	
	    logp.logoutOperation();
	}

}
