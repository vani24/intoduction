package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SalesForceLoginTestCase3  extends ReusableMethods{
	
	public static void testcase01() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C://Vani//geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		WebElement un=driver.findElement(By.xpath(".//*[@id='username']"));
		enterText(un,"vani.shadaksharaiah@gmail.com","UserName");
		WebElement pwd=driver.findElement(By.xpath(".//*[@id='password']"));
		enterText(pwd,"Sid1234!","Password");
		WebElement login=driver.findElement(By.id("Login"));
		button(login,"Login");
		Thread.sleep(3000);
		driver.close();
		
		
	}
	public static void testcase03() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C://Vani//geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://login.salesforce.com");

		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("vani.shadaksharaiah@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Sid1234!");
		WebElement rembermeCheck=driver.findElement(By.xpath(".//*[@id='rememberUn']"));
		selectCheckBox(rembermeCheck,"RememberMe");
		Thread.sleep(3000);
		WebElement login=driver.findElement(By.id("Login"));
		button(login,"Login");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='userNavButton']")).click();
		driver.findElement(By.xpath(".//*[@id='userNav-menuItems']/a[5]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath(".//*[@id='clear_link']/img")).click();

		driver.close();
		
		
	}
	
	
	
	public static void testcase04a() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C://Vani//geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://login.salesforce.com");
        driver.findElement(By.xpath(".//*[@id='forgot_password_link']")).click();
        Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='un']")).sendKeys("vani.shadaksharaiah@gmail.com");
		driver.findElement(By.xpath(".//*[@id='continue']")).click();
		driver.close();
	}
	
	public static void testcase04b()  throws InterruptedException {
		int i;
		String username="", password="", iteration="";
		System.setProperty("webdriver.gecko.driver","C://Vani//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		for (i = 1; i <= 5; i++){
		if (i == 1)    {
		username = "admin";
		password = "admin@123";
		iteration = "Iteration 1:";
		}
		else if(i == 2){
		username = "admin";
		password = "admin@1232r";
		iteration = "Iteration 2:";    
		}else if(i == 3){
			username = "admina";
			password = "admin@12ww";
			iteration = "Iteration 2:";

		}else if(i == 4){
			username = "admin";
			password = "admin@123";
			iteration = "Iteration 2:";

		}else if(i == 5){
			username = "admin";
			password = "admin@12";
			iteration = "Iteration 2:";

		}
		
		driver.get("https://login.salesforce.com");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='login_form']/div[3]/label")).click();

		

		}
		driver.close();
	}

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		testcase01();
		testcase03();
		testcase04a();
		testcase04b();
		
		
	}

}
