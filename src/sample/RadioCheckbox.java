package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckbox {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c://vani//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		
		List<WebElement> radioSex=driver.findElements(By.name("sex"));
		boolean bValue=false;
		
		bValue=radioSex.get(0).isSelected();
		System.out.println(bValue);
		
		if(bValue==true) {
			
			radioSex.get(1).click();
			
		}else {
			radioSex.get(0).click();
		}
		
	
		driver.findElement(By.id("exp-2")).click();
		List<WebElement> chkbox=driver.findElements(By.name("profession"));
		int size=chkbox.size();
		
		for(int i=0;i<size;i++) {
			String value=chkbox.get(i).getAttribute("value");
			
			if(value.equalsIgnoreCase("Automation Tester")) {
				chkbox.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.cssSelector("input[value='Selenium IDE'")).click();
		
		driver.quit();
		
	}

}
