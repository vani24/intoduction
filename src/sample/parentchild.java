package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentchild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://vani//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
		driver.findElement(By.xpath("//*[@id='tablist1-tab1']")).click();
		driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[1]")).click();
		driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[2]")).click();
		driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[3]")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='tablist1-tab1']/parent::ul")).getAttribute("role"));

	}

}
