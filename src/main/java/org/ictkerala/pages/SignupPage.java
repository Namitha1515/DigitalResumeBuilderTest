package org.ictkerala.pages;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SignupPage {
	WebDriver driver;

	public SignupPage (WebDriver driver) {              
		this.driver=driver;
	}
public void setsignupButton() {
	WebElement signupButon= driver.findElement(By.xpath("//a[text()='Signup now']"));
	  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'});", signupButon);
	 signupButon.click();
	
}
	

public void setorSignup() {
   clickElement(By.xpath("//a[normalize-space()='or sign up']"));
	
}
private void scrollToElement(WebElement element) {
   
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'});", element);
}
private void clickElement(By locator) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    boolean clicked = false;
    int attempts = 0;

    while (!clicked && attempts < 3) {
        try {
            WebElement element = driver.findElement(locator);
            scrollToElement(element);
            wait.until(ExpectedConditions.elementToBeClickable(element)); // Wait for element to be clickable
            element.click();
            clicked = true;
        } catch (StaleElementReferenceException e) {
            attempts++;
            System.out.println("StaleElementReferenceException caught. Retrying... " + attempts);
        } catch (ElementClickInterceptedException e) {
            attempts++;
            System.out.println("ElementClickInterceptedException caught. Retrying... " + attempts);
            // You can add additional actions here, such as scrolling or waiting
        } catch (Exception e) {
            attempts++;
            System.out.println("Exception caught. Retrying... " + attempts);
        }
    }

    if (!clicked) {
        throw new RuntimeException("Failed to click the element after several attempts.");
    }
}
public void setUsername(String uname)

{
	WebElement username=driver.findElement(By.cssSelector("input[placeholder='Username']"));
	username.sendKeys(uname);
}
public void setPhonenumber(String phnumber) {
	WebElement phonenum= driver.findElement(By.cssSelector("input[placeholder='Phone Number']"));
	 phonenum.sendKeys(phnumber);
}
public void setMail(String email) {
	WebElement mailid= driver.findElement(By.cssSelector("input[placeholder='Mail']"));
	mailid.sendKeys(email);
}
public void setPassword(String pword) {
	WebElement passwd= driver.findElement(By.cssSelector("input[placeholder='Password']"));
	 passwd.sendKeys(pword);
}
public void setConfirmpword(String cfpword) {
	WebElement confpasswd= driver.findElement(By.cssSelector("input[placeholder='Confirm Password']"));
	confpasswd.sendKeys(cfpword);
}
public void setregisterButton() {
	WebElement registerbttn= driver.findElement(By.xpath("//button[span[text()='Register']]"));
	registerbttn.click();
	alertWait();
	
}
private void alertWait() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    try {
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Alert Text: " + alertText);
        alert.accept();
    } catch (Exception e) {
     
        System.out.println("No alert present or unable to handle alert: " + e.getMessage());
    }
}
public String getBlankusername() {
	WebElement errorusername=driver.findElement(By.xpath("//div[contains(text(),'Username is required')]"));
String error=	errorusername.getText();
	return error;
}
public String getBlankphonenumber() {
	WebElement errorphnumber=driver.findElement(By.xpath("//div[contains(text(),'phone number is required')]"));
String error1=	errorphnumber.getText();
	return error1;
}
public String getBlankmail() {
	WebElement errormail=driver.findElement(By.xpath("//div[contains(text(),'Email is required')]"));
String error2=	errormail.getText();
	return error2;
}
public String getBlankpassword() {
	WebElement errorpword=driver.findElement(By.xpath("(//div[contains(text(),'Password is required')])[1]"));
String error3=	errorpword.getText();
	return error3;
}
public String getBlankconfirmpassword() {
	WebElement errorconfpword=driver.findElement(By.xpath("//div[contains(text(),'Confirm Password is required')]"));
String error4=	errorconfpword.getText();
	return error4;
}
public String getInvalidusername() {
	WebElement invalidusername=driver.findElement(By.xpath("//div[contains(text(),'Username must be at least 4 characters')]"));
String error5=	invalidusername.getText();
	return error5;
}
public String getInvalidphonenumber() {
	WebElement invalidphnumber=driver.findElement(By.xpath("(//div[contains(text(),'phone number be at least 10 Numbers')])[1]"));
String error6=	invalidphnumber.getText();
	return error6;
}

public String getInvalidpassword() {
	WebElement invalidpword=driver.findElement(By.xpath("(//div[normalize-space()='Password must be at least 6 characters'] | //div[contains(text(),'Password must contain lowercase ,Uppercase ,Number')] | //div[contains(text(),'Password must contain lowercase ,Uppercase ,Numbers and atleast one special characters')])[last()]"));
String error7=	 invalidpword.getText();
	return error7;
}

}
