package signUp;
import org.ictkerala.pages.SignupPage;
//import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends TestBase {
	SignupPage testObj=null;
	@Test(priority=1)
public void positivesignup() {
	
	testObj=new SignupPage(driver);
	testObj.setsignupButton();
	testObj.setorSignup();
	testObj.setUsername("Anamika");
	testObj.setPhonenumber("9876543210");
	testObj.setMail("anamika123@gmail.com");
	testObj.setPassword("Anamika@123");
	testObj.setConfirmpword("Anamika@123");
	testObj.setregisterButton();
	
	}
/*	@Test(priority=2)
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
	    
	}*/
	/*@Test(priority=2)
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
		   
		}*/

}

