package sample;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://vani//chromedriver.exe");
		WebDriver driver=new ChromeDriver();driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");
		
		Select oSelect=new Select(driver.findElement(By.name("continents")));
		
		oSelect.selectByVisibleText("Europe");
		Thread.sleep(2000);
		
		oSelect.selectByIndex(2);
		Thread.sleep(2000);
		
		List<WebElement> contents=oSelect.getOptions();
		int size=contents.size();
		
		for(int i=0;i<size;i++) {
			String sValue=contents.get(i).getText();
			System.out.println(sValue);
			
			if(sValue.equals("Antartica")) {
				oSelect.selectByIndex(i);
				break;
				
			}
		}
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
