package selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AutoScript{
	public static WebDriver driver;
	
	public static void LoginErrorMessage_01() throws InterruptedException{
		String expString="Please enter your password.";
		System.setProperty("webdriver.gecko.driver","C://Vani//geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		String applicationTitle=driver.getTitle();
		if(applicationTitle.contains("Salesforce"))
			System.out.println("salesforce page is verified");
		else
			System.out.println("salesforce page is not verified");
		//
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("User@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).clear();
		driver.findElement(By.xpath(".//*[@id='Login']")).click();
		String actualText=driver.findElement(By.xpath("//*[@id='error']")).getText();
		if(actualText.equalsIgnoreCase(expString))
			System.out.println("error message verified");
		else
			System.out.println("error message is not verified...testcase failed");
		ReusableMethods.closeBrowser(driver);
		
		
		
		
		
	}
	
	public static void LoginToSalesForce_02() throws InterruptedException{
		String expString="Please enter your password.";
		System.setProperty("webdriver.gecko.driver","C://Vani//geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		String applicationTitle=driver.getTitle();
		if(applicationTitle.contains("Salesforce"))
			System.out.println("salesforce page is verified");
		else
			System.out.println("salesforce page is not verified");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("vani.shadaksharaiah@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Sid1234!");
		driver.findElement(By.xpath(".//*[@id='Login']")).click();
		Thread.sleep(6000);
		
		String homeTiltle=driver.getTitle();
		if(homeTiltle.contains("Home Page"))
			System.out.println("home page verified");
		else
			System.out.println("home page is not verified");
		ReusableMethods.closeBrowser(driver);
	}
	public static void  CheckRemeberMe_3() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","C://Vani//geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		String applicationTitle=driver.getTitle();
		if(applicationTitle.contains("Salesforce"))
			System.out.println("salesforce page is verified");
		else
			System.out.println("salesforce page is not verified");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("vani.shadaksharaiah@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Sid1234!");
		driver.findElement(By.xpath("//*[@id='rememberUn']")).click();
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='userNav-arrow']")).click();
		driver.findElement(By.xpath("//*[@id='userNav-menuItems']/a[5]")).click();
		Thread.sleep(6000);
		String actID=driver.findElement(By.xpath("//*[@id='idcard-identity']")).getText();
		if(actID.equalsIgnoreCase("your id"))
			System.out.println("email id verified");
		else
			System.out.println("email id not verified");
		ReusableMethods.closeBrowser(driver);
		
		
	}
	
	public static void ForgotPassword_4A() throws InterruptedException{
		String expString="We’ve sent you an email with a link to finish resetting your password.";
		System.setProperty("webdriver.gecko.driver","C://Vani//geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		String applicationTitle=driver.getTitle();
		if(applicationTitle.contains("Salesforce"))
			System.out.println("salesforce page is verified");
		else
			System.out.println("salesforce page is not verified");
		driver.findElement(By.xpath("//a[text()='Forgot Your Password?']")).click();
		Thread.sleep(6000);
		if(driver.getTitle().contains("Forgot Your Password"))
			System.out.println("forgot password page is verified");
		else
			System.out.println("forgot password page is not verified");
		
		
		driver.findElement(By.xpath(".//*[@id='un']")).sendKeys("vani.shadaksharaiah@gmail.com");
		driver.findElement(By.xpath(".//*[@id='continue']")).click();
		Thread.sleep(2000);
		String actText=driver.findElement(By.xpath("//*[@id='forgotPassForm']/div/p[1]")).getText();
		if(actText.equalsIgnoreCase(expString))
			System.out.println("reset message verified");
		else
			System.out.println("reset message is not verified");
		ReusableMethods.closeBrowser(driver);
	}
	public static void ValidateLoginErrorMessage_5() throws InterruptedException{
		//10sec
		String expText="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		System.setProperty("webdriver.gecko.driver","C://Vani//geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		String applicationTitle=driver.getTitle();
		if(applicationTitle.contains("Salesforce"))
			System.out.println("salesforce page is verified");
		else
			System.out.println("salesforce page is not verified");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("3456");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		Thread.sleep(6000);
		String actText=driver.findElement(By.xpath(".//*[@id='error']")).getText();
		if(actText.equalsIgnoreCase(expText))
			System.out.println("wrong id and password message is verified");
		else
			System.out.println("wrong id and password message is not verified");
		ReusableMethods.closeBrowser(driver);
	}
	public static void userMenu_DropDown() throws InterruptedException{
		String[] options=new String[]{"My Profile","My Settings","Developer Console","Logout"};
		List<String> expList=new ArrayList<String>(Arrays.asList(options));
		driver=ReusableMethods.launchBrowser("firefox");
		driver=ReusableMethods.Login_toSalesforce(driver);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='userNav-arrow']")).click();
		List<WebElement> list=driver.findElements(By.xpath("//*[@id='userNav-menuItems']/a"));
		System.out.println(list);
		ArrayList<String> actData=new ArrayList<String>();
		for(WebElement ele:list){
		
			actData.add(ele.getText().trim());
		}
		System.out.println(actData);
		if(actData.containsAll(expList))
			System.out.println("usermenu verified ");
		else
			System.out.println("user menu not verified");
		ReusableMethods.closeBrowser(driver);
		
	}
	public static void EditPostFileImage() throws InterruptedException{
		WebDriver driver;
		
		driver=ReusableMethods.launchBrowser("firefox");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver=ReusableMethods.Login_toSalesforce(driver);
		Thread.sleep(6000);
					
		WebElement usermenu=driver.findElement(By.xpath("//*[@id='userNavButton']"));
		usermenu.click();
		WebElement myProfile = driver.findElement(By.xpath(".//*[@id='userNav-menuItems']/a[1]"));
		myProfile.click();
		
		WebElement edit=driver.findElement(By.xpath(".//*[@id='chatterTab']/div[2]/div[2]/div[1]/h3/div/div/a/img"));
		edit.click();
				
		driver.switchTo().frame("contactInfoContentId");
	
		WebElement about=driver.findElement(By.xpath(".//*[@id='aboutTab']/a"));
		about.click();
		
		WebElement lastName=driver.findElement(By.xpath(".//*[@id='lastName']"));
		lastName.clear();
		lastName.sendKeys("divyashree feb");
		
		WebElement saveAll=driver.findElement(By.xpath(".//*[@id='TabPanel']/div/div[2]/form/div/input[1]"));
		saveAll.click();
		driver.switchTo().defaultContent();
		System.out.println("Clicked on saveAll  and back to default window");
		Thread.sleep(4000);
		
		//For Post
		Thread.sleep(10000);
		
		WebElement post=driver.findElement(By.xpath(".//*[@id='publisherAttachTextPost']/span[1]"));
		post.click();
		Thread.sleep(4000);
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
		driver.switchTo().frame(frame);
		System.out.println("switched");
		Thread.sleep(10000);
		System.out.println("tag html?  "+driver.findElements(By.xpath("//html/body")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body")));
		WebElement postMessage=driver.findElement(By.xpath("/html/body"));
		postMessage.sendKeys("This is using Automation");
		driver.switchTo().defaultContent();
		WebElement shareButton=driver.findElement(By.xpath(".//*[@id='publishersharebutton']"));
		shareButton.click();
		
		Thread.sleep(2000);
		//For File
		
		WebElement file=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='publisherAttachContentPost']/span[1]")));
		file.click();
		System.out.println("clicked on file");
		
		WebElement upload=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='chatterUploadFileAction']")));
		upload.click();
		System.out.println("clicked on upload");
		
		WebElement browse=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='chatterFile']")));
		browse.sendKeys("E:\\tt.txt");
		
		WebElement share=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='publishersharebutton']")));
		share.click();
		Thread.sleep(5000);
		//Add photo
		
		Actions mousehoover=new Actions(driver);
		mousehoover.moveToElement(driver.findElement(By.xpath("//*[text()='Moderator']"))).perform();;
		WebElement addPhoto=driver.findElement(By.xpath(".//*[@id='uploadLink']"));
		addPhoto.click();
		Thread.sleep(5000);
		WebElement photoframe=driver.findElement(By.id("uploadPhotoContentId"));
		driver.switchTo().frame(photoframe);
		WebElement browsePhoto=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='j_id0:uploadFileForm:uploadInputFile']")));
	
		browsePhoto.sendKeys("E:\\set.png");
	
		WebElement savePhoto=driver.findElement(By.xpath(".//*[@id='j_id0:uploadFileForm:uploadBtn']"));
		savePhoto.click();
		
		Actions action=new Actions(driver); 
		action.dragAndDropBy(driver.findElement(By.xpath(".//*[@id='j_id0:outer']/div[1]/div/div/div/div[6]")), 100, 20);
		driver.findElement(By.xpath(".//*[@id='j_id0:j_id7:save']")).click(); 
		
		driver.switchTo().defaultContent();
		ReusableMethods.closeBrowser(driver);
	}
	public static void developerConsole_TC08() throws InterruptedException{
		driver=ReusableMethods.launchBrowser("firefox");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver=ReusableMethods.Login_toSalesforce(driver);
		Thread.sleep(6000);
		WebElement usermenu=driver.findElement(By.xpath("//*[@id='userNavButton']"));
		usermenu.click();
		String[] a=new String[3];
		int i=0;
		
		WebElement developerConsole=driver.findElement(By.xpath(".//*[@id='userNav-menuItems']/a[3]"));
		developerConsole.click();
		
		for(String window:driver.getWindowHandles()){
			a[i]=window.toString();
			i++;
		}
		Thread.sleep(3000);
		
		driver.switchTo().window(a[1]);
		String title=driver.getTitle();
		if(title.contains("Developer Console"))
			System.out.println("devloper window verified");
		else
			System.out.println("failed to verify");
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(a[0]);
		ReusableMethods.closeBrowser(driver);
	}
	
	public static void SelectLogoutFromUserMenu_TC9() throws InterruptedException {

			driver=ReusableMethods.launchBrowser("firefox");
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 40);
			driver=ReusableMethods.Login_toSalesforce(driver);
			Thread.sleep(6000);
			WebElement usermenu=driver.findElement(By.xpath("//*[@id='userNavButton']"));
			usermenu.click();
			WebElement logoutUserMenu=driver.findElement(By.xpath(".//*[@id='userNav-menuItems']/a[5]"));
			logoutUserMenu.click();
			String url=driver.getCurrentUrl();
			if(url.equals("https://login.salesforce.com/"))
				System.out.println("passed");
			else
				System.out.println("not verified login url");
			ReusableMethods.closeBrowser(driver);

	}
	
	
	public static void CreateAccount_TC10() throws InterruptedException {

			driver=ReusableMethods.launchBrowser("firefox");
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 40);
			driver=ReusableMethods.Login_toSalesforce(driver);
			Thread.sleep(6000);
				
				WebElement accountTab=driver.findElement(By.xpath(".//*[@id='Account_Tab']/a"));		
				accountTab.click();
				driver.findElement(By.xpath("//*[@id='tryLexDialogX']")).click();
				String accountText=driver.findElement(By.xpath(".//*[@id='bodyCell']/div[1]/div[1]/div[1]/h1")).getText();
				if(accountText.equalsIgnoreCase("Accounts"))
				System.out.println("account page is verified");
				else
					System.out.println("account page is not present");
				WebElement newAccount=driver.findElement(By.xpath(".//*[@id='hotlist']/table/tbody/tr/td[2]/input"));		
				newAccount.click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id='acc2']")).sendKeys("wellsFeb");
				driver.findElement(By.xpath(".//*[@id='bottomButtonRow']/input[1]")).click();
				String newAccountText=driver.findElement(By.xpath(".//*[@id='contactHeaderRow']/div[2]/h2")).getText();
				if(newAccountText.equalsIgnoreCase("wellsFeb"))
					System.out.println("new account verified");
				else
					System.out.println("couldnt verify new account");
				
				ReusableMethods.closeBrowser(driver);
				
				
		}
}