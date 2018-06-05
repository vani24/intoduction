package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c://vani//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("vani.shadaksharaiah@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345678");
		driver.findElement(By.linkText("Forgot account?")).click();
		

	}

}
