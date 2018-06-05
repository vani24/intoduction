package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "c://vani//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://login.salesforce.com");
	driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("vani");
	driver.findElement(By.cssSelector("input#password.input.r4.wide.mb16.mt8.password")).sendKeys("12345667");
	driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
	System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());

	}

}
