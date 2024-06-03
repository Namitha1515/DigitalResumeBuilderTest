package signUp;

import org.ictkerala.pages.Editprofile;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassprofileedit extends TestBase {
	Editprofile testObj=null;

    @BeforeMethod
    public void editProfile() {
	testObj=new Editprofile(driver);}
	@Test (priority=1)
	public void poslogin() 
	{
		
		testObj.setsignupButton();
		testObj.Setusername("Anamika");
		testObj.Setpassword("Anamika@123");
		testObj.checkbox();
		testObj.login();
		testObj.myProfile();
		testObj.editProfile();}
	
		  @Test(priority = 2)
		    public void details() {
	
		testObj.setaddButton();
		testObj.setachievement("high test coverage");
		testObj.setremoveButton();
		testObj.setdescribe("Hard Working");

}
}