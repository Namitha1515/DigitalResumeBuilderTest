package signUp;
import java.time.Duration;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		
	driver=new ChromeDriver();
	driver.get("http://167.71.226.96/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	
	}
	@AfterTest
	public void quit() {
		driver.quit();
	}
	
	}


