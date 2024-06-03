package signUp;

import org.ictkerala.pages.SignupPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClassinvalid  extends TestBase{
	SignupPage testObj=null;
	@Test
	public void invalidDetails() {
		
		testObj=new SignupPage(driver);
		testObj.setsignupButton();
		testObj.setorSignup();
		testObj.setUsername("Ana");
		testObj.setPhonenumber("987654");
		testObj.setMail("anamika123@gmai");
		testObj.setPassword("Anamik");
		testObj.setConfirmpword("Anamika@123");
		testObj.setregisterButton();
		 Assert.assertEquals(testObj.getInvalidusername(), "Username must be at least 4 characters");
		    Assert.assertEquals(testObj.getInvalidphonenumber(), "phone number be at least 10 Numbers");
		    Assert.assertEquals(testObj.getInvalidpassword(), "Password must contain lowercase ,Uppercase ,Numbers and atleast one special characters");
		   
		}

}
