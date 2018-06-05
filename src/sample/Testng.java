package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Testng {

  
  public WebDriver driver;
  @Test
  public void main() {
	  driver.findElement(By.id("email")).sendKeys("vani.shadaksharaiah@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("07241984");
	  driver.findElement(By.xpath("//input[@value='Log In']")).click();
	  System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	  //driver.findElement(By.cssSelector("a._54nc")).click();
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "c://vani//chromedriver.exe");
	  driver=new ChromeDriver();
	  //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	  
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.facebook.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
