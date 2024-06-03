package signUp;

import org.ictkerala.pages.SignupPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClassblank  extends TestBase {
	SignupPage testObj=null;
	@Test
	public void signUpWithoutDetails() {
	    testObj = new SignupPage(driver);
	    testObj.setsignupButton();
	    testObj.setorSignup();
	    testObj.setregisterButton();
	   Assert.assertEquals(testObj.getBlankusername(), "Username is required");
	    Assert.assertEquals(testObj.getBlankphonenumber(), "phone number is required");
	    Assert.assertEquals(testObj.getBlankmail(), "Email is required");
	    Assert.assertEquals(testObj.getBlankpassword(), "Password is required");
	    Assert.assertEquals(testObj.getBlankconfirmpassword(), "Confirm Password is required");
	    
	}
	/*@Test(priority=1)
	public void signUpWithminusernamelength() {
	    testObj = new SignupPage(driver);
	    testObj.setsignupButton();
		testObj.setorSignup();
		testObj.setUsername("Ana");
}*/
}
