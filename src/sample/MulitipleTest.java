package sample;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MulitipleTest {
	
 WebDriver driver;
  @Test (priority =0)
  public void first() {
	  System.out.println("This is the First test Case");
  }
  @Test (priority =1)
  public void second() {
	  System.out.println("This is the Second test case");
  }
  @Test (priority =2,enabled=false)
  public void three() {
	  System.out.println("This is the Third test case");
  }
  @Test (priority =3)
  public void four() {
	  System.out.println("This is the Fourth test case");
  }
}
