package signUp;

import org.ictkerala.pages.Navigations;

import org.testng.annotations.Test;


public class TestClassnavigations extends TestBase {
	Navigations testObj=null;
@Test(priority=0)
public void oreonProfile() {
	
	testObj=new Navigations(driver);
	testObj.setaboutuspButton();
	testObj.settemplatedesignButton();
	
	testObj.setoreonButton();
	testObj.setcreateprofileButton();
	
}
@Test(priority=1)
public void mulberryProfile() {
testObj=new Navigations(driver);
testObj.settemplatedesignButton();
testObj.setmulberrydesignButton();

}
@Test(priority=2)// error   element click intercepted: Element is not clickable at point (389, 945)
public void novapeachProfile() {
	testObj=new Navigations(driver);
	testObj.settemplatedesignButton();
	testObj.setnovapeachButton();
}
@Test(priority=3)// error   element click intercepted: Element is not clickable at point (389, 945)
public void pearlblissProfile() {
	testObj=new Navigations(driver);
	testObj.settemplatedesignButton();
	testObj.setpearlblissButton();
}

@Test(priority=4)// error   element click intercepted: Element is not clickable at point (389, 945),hidden or overlay element
public void classicblackProfile() {
	testObj=new Navigations(driver);
	testObj.settemplatedesignButton();
	testObj.setclassicblackButton();
}




}
