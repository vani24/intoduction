package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReusableMethods {

	
	public static HSSFWorkbook wb;
	public static WebDriver driver;
	public static void enterText(WebElement obj,String textValue,String objName) {
		if(obj.isDisplayed()) {
			obj.sendKeys(textValue);
			System.out.println("Pass : "+textValue+" is entered in "+objName+" filed.");
		}else {
			System.out.println("Fail : "+objName+" filed does not exisit.Please check your application.");
		}
	}
	public static void button(WebElement obj,String objName) {
		if(obj.isDisplayed()) {
			obj.click();
			System.out.println("Pass :"+objName+"  clicked" );
		}else {
			System.out.println("Fail : "+objName+" is not enabled. please check the application");
		}
	}
	
	public static void selectCheckBox(WebElement obj,String objName){
		if(obj.isDisplayed())
		{ 
			if(obj.isSelected()){
				System.out.println("Pass: "+ objName + " is already selected.");
			}else{
				obj.click();
				System.out.println("Pass: "+ objName + " is  selected.");
			}

		}else{
			System.out.println("Fail :" + objName + " is not diplayed, please check your application");
		}
	}

	public static void deSelectCheckBox(WebElement obj,String objName){
		if(obj.isDisplayed())
		{ 
			if(obj.isSelected()){
				obj.click();
				System.out.println("Pass: "+ objName + " is  de selected.");
				
			}else{
				System.out.println("Pass: "+ objName + " is already de selected.");
			}

		}else{
			System.out.println("Fail :" + objName + " is not diplayed, please check your application");
		}
	}
	/*
	 * 
	 * 
	 * */ 
	
	public static void validateTextBoxContent(WebElement obj, String expectedText, String objName){
		if(obj.isDisplayed())
		{
			String actualText = obj.getAttribute("value");
			if(expectedText.equals(actualText)){
				System.out.println("Pass: " + " Expected text '" + expectedText + "' is matching with actual text.");
			}else{
				System.out.println("Fail: "+" Expected text '" + expectedText + "' is not matching with actual text '"+ actualText+ "'.");
			}
			
		}else{
			System.out.println("Fail :" + objName + " is not diplayed, please check your application");
		}
	}
	
	public static String[][] readDataFromXl(String dataTablePath, String sheetName) throws IOException{
//		String cur_dir = System.getProperty("user.dir");
		FileInputStream fs = new FileInputStream (new File(dataTablePath));
		
		HSSFWorkbook wb= new HSSFWorkbook(fs);
		HSSFSheet sheet=wb.getSheet(sheetName);
		
		int trow= sheet.getLastRowNum()+1;
		int tcol=sheet.getRow(0).getLastCellNum();
		String [][]str=new String[trow][tcol];
		for(int i=0;i<trow;i++){
			for(int j=0;j<tcol;j++){
				str[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
				
			}
		}
		for(int i=0;i<str.length;i++){
			for(int j=0;j<str[0].length;j++){
				System.out.print(str[i][j]+" ");
			}
			System.out.println();
			
		}
		System.out.println();
		return str;
	}
	public static WebDriver launchBrowser(String name){
		//System.setProperty("webdriver.firefox.bin","C:/Program Files/Mozilla Firefox53/firefox.exe");
		if(name.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","C://Vani//geckodriver.exe");
			driver =new FirefoxDriver();
			
		}
		else if(name.equalsIgnoreCase("chrome")){
			System.out.println("chrome entered");
			System.setProperty("webdriver.chrome.driver", "c://vani//chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		return driver;
	}

	public static void closeBrowser(WebDriver driver){
		try{
			driver.quit();
		}
		catch(Exception e){
			
		}
	}
	public static WebDriver Login_toSalesforce(WebDriver driver) throws InterruptedException{
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("vani.shadaksharaiah@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Sid1234!");
		Thread.sleep(5000);//due to my antivirus secure tab
		driver.findElement(By.id("Login")).click();
		return driver;
	}
	
	public static String[][] readXlSheet(String link,String sheetName) throws IOException{
		FileInputStream fio=new FileInputStream(new File(link));
		wb=new HSSFWorkbook(fio);
		HSSFSheet sheet=wb.getSheet(sheetName);
		int trow=sheet.getLastRowNum()+1;
		int tcol=sheet.getRow(0).getLastCellNum();
		String[][] s = new String[trow][tcol];
		System.out.println("total rows="+trow+" and total column="+tcol);
		for(int i=0;i<trow;i++){
			for(int j=0;j<tcol;j++){
				int cellType=sheet.getRow(i).getCell(j).getCellType();
				if(cellType==HSSFCell.CELL_TYPE_NUMERIC)
					s[i][j]=String.valueOf((int)sheet.getRow(i).getCell(j).getNumericCellValue());
				else
				s[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();	
		
			}
		}
		
		return s;
	}

}
