package org.ictkerala.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Editprofile {
	WebDriver driver;
	public Editprofile (WebDriver driver) {              
		this.driver=driver;
	}
	public void setsignupButton() {
		WebElement signupButon= driver.findElement(By.xpath("//a[text()='Signup now']"));
		 signupButon.click();
	}
	public void Setusername(String Uname) 
	{
		WebElement usrname=driver.findElement(By.xpath("//input[@name='Username']"));
		usrname.sendKeys(Uname);
	}
	public void Setpassword(String Pssd)
	{
		WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys(Pssd);
	}
	public void checkbox()
	{
		WebElement check=driver.findElement(By.xpath("//label[@for='checkbox']"));
		check.click();
	}
	public void login()
	{
		WebElement login=driver.findElement(By.xpath("//button[@class='login100-form-btn']"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", login);

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(login));
	        login.click();
		login.click();
	}
	/*public void setmyprofileButton() {
		WebElement  mpbtn=driver.findElement(By.xpath("//a[normalize-space()='My Profile']"));
	
		mpbtn.click();}*/
	public void myProfile()
	{
		
	WebElement element = driver.findElement(By.xpath("//a[normalize-space()='My Profile']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}
/*	public void seteditprofileButton() {
		WebElement  epbtn=driver.findElement(By.xpath("//a[normalize-space()='Edit Profile']']"));
	
		epbtn.click();}*/

	public void editProfile(){
		
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}
	
	public void setaddButton() {
		WebElement  addBtn=driver.findElement(By.xpath("//tr[.//th[text()='Your achievements:']]//button[@class='btn btn-primary' and text()='Add']"));
		
		Actions actions = new Actions(driver);
	      actions.moveToElement(addBtn).click().perform();
	      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addBtn);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(addBtn));
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class, 'overlay')]")));
		addBtn.click();
	
	}
	public void setachievement(String ach) {
		WebElement achievmnt=driver.findElement((By.xpath("//th[normalize-space()='Your achievements:']")));
		/*((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", achievmnt);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(achievmnt));*/
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(achievmnt));
	        try {
	        	achievmnt.clear();
	        	achievmnt.sendKeys(ach);
	        } catch (org.openqa.selenium.InvalidElementStateException e) {
	          
	          
	            
	            ((JavascriptExecutor) driver).executeScript("arguments[0].value = '';",achievmnt);
	      
	        }
	   
	}
	public void setremoveButton() {
		WebElement remove=driver.findElement((By.cssSelector("button[class='btn btn-remove']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", remove);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(remove));
		remove.click();
	}
	
	public void setdescribe(String urslf) {
		WebElement describe=driver.findElement(By.id("yourself"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", describe);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(describe));
		describe.sendKeys(urslf);
	}
}
