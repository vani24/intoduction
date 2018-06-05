package selenium;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DriverFile {

	public static void main(String[] args) throws IOException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		String cur_dir = "C:\\Users\\vani\\eclipse-workspace\\java";
		String suitePath = cur_dir + "/src/TestSuite.xls";
		String[][] recData = ReusableMethods.readXlSheet(suitePath, "Sheet1");
		String testCase,flag,firefoxStatus;
		
		for (int i = 1; i < recData.length; i++) {
			testCase = recData[i][0];
			flag = recData[i][1];
			if(flag.equalsIgnoreCase("y")){
				
				firefoxStatus=recData[i][2];
				if(firefoxStatus.equalsIgnoreCase("y")){
					Method tc = AutoScript.class.getMethod(testCase);
					tc.invoke(tc);
				}
			}
		}

	}


}
