package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserInvocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://Vani//geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("vani.shadaksharaiah@gmail.com");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("12345678");
		
		
		//driver.findElement(By)
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());

	}

}
