package org.ictkerala.pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Navigations {
	WebDriver driver;

	public Navigations(WebDriver driver) {
		this.driver=driver;
	}
public void setaboutuspButton() {
	WebElement abtusButon= driver.findElement(By.xpath("//a[normalize-space()='Aboutus']"));
	abtusButon.click();
}
public void settemplatedesignButton() {
	/*WebElement templateButon= driver.findElement(By.xpath("//a[normalize-space()='Templates/Designs']"));
	templateButon.click();*/
	// Find the template/design button
    WebElement templateButon = driver.findElement(By.xpath("//a[normalize-space()='Templates/Designs']"));

    
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.elementToBeClickable(templateButon));
    wait.until(ExpectedConditions.visibilityOf(templateButon));

   
    Actions actions = new Actions(driver);
    actions.moveToElement(templateButon).click().perform();
}

public void setmulberrydesignButton() {
	WebElement mulberryButon= driver.findElement(By.xpath("//figcaption[div[normalize-space(text())='MULBERRY WHITE'] and p[normalize-space(text())='Coloured Resumes']]"));
	mulberryButon.click();
}
public void setoreonButton() {
	WebElement oreonButon= driver.findElement(By.xpath("//figcaption//div[@class='h4' and normalize-space()='OREON BLUE']"));
	oreonButon.click();
}
public void setcreateprofileButton() {
	WebElement cpButon= driver.findElement(By.xpath("//button[normalize-space()='Create a Profile Now']"));
	cpButon.click();
	waitForAlertAndAccept();
}
private void waitForAlertAndAccept() {
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
public void setnovapeachButton() {
	WebElement novaButon= driver.findElement(By.xpath("//figcaption/div[contains(@class, 'h4') and text()='NOVA PEACH']"));
	
	 scrollToElement(novaButon);
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(novaButon)).click();
	    } catch (org.openqa.selenium.TimeoutException e) {
	        System.out.println("Element is not clickable within the specified timeout: " + e.getMessage());
	    }
	

 }

     
	



public void setpearlblissButton() {
	WebElement pearlblissButon= driver.findElement(By.xpath("//figcaption[div[@class='h4' and normalize-space(text())='PEARL BLISS'] and p[normalize-space(text())='Simple Resumes']]"));
	/*scrollToElement(pearlblissButon);
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", pearlblissButon);*/

	/*scrollToElement(pearlblissButon);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.elementToBeClickable(pearlblissButon)).click();*/
	  scrollToElement(pearlblissButon);
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	    wait.until(ExpectedConditions.elementToBeClickable(pearlblissButon));
	    
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", pearlblissButon);
     
}
public void setclassicblackButton() {
	WebElement classicblackButon= driver.findElement(By.xpath("//div[3]//div[1]//a[1]//figure[1]//figcaption[1]"));
	   scrollToElement(classicblackButon);
       clickElement(classicblackButon);
     
}
private void clickElement(WebElement element) {
    scrollToElement(element);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.elementToBeClickable(element)).click();
}

private void scrollToElement(WebElement element) {
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
}
}


