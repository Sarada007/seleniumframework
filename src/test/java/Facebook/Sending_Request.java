package Facebook;

import org.testng.annotations.Test;

import com.genericutility.Base_Class;
import com.pageobjectry.Friends_page;

public class Sending_Request extends Base_Class{
	@Test
	public void request() {
		Friends_page fp=new Friends_page(driver);
		fp.friendsOperation();
	}

}
