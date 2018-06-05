package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SalesForceBrowserInvocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://Vani//geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("vani.shadaksharaiah@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Vani1234");
		driver.findElement(By.id("Login")).click();
		
		
		//driver.findElement(By)
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());

	}

}
