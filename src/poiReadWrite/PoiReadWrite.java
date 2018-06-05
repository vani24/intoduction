package poiReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class PoiReadWrite {
	public static void readDataFromXl() throws IOException{
		String cur_dir=System.getProperty("user.dir");
		FileInputStream fs=new FileInputStream(new File(cur_dir+"/file.xls"));
		System.out.println(cur_dir+"/file.xls");
		HSSFWorkbook wb=new HSSFWorkbook(fs);
		HSSFSheet sheet=wb.getSheet("Sheet1");
		
		int trow=sheet.getLastRowNum()+1;
		int tcol=sheet.getRow(0).getLastCellNum();
		String[][] str=new String[trow][tcol];
		for(int i=0;i<trow;i++){
			for(int j=0;j<tcol;j++){
				
				int cellType=sheet.getRow(i).getCell(j).getCellType();
				if(cellType==Cell.CELL_TYPE_NUMERIC){
					int val=(int) sheet.getRow(i).getCell(j).getNumericCellValue();
					str[i][j]=String.valueOf(val);
					//sheet.getRow(i).getCell(j).getNumericCellValue();
				}
				
				else
				str[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		for(int i=0;i<str.length;i++){
			for(int j=0;j<str[0].length;j++){
				System.out.print(str[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void writeDataToXl() throws IOException{
		String cur_dir=System.getProperty("user.dir");
		File file=new File(cur_dir+"/file.xls");
		FileInputStream fs=new FileInputStream(file);
		HSSFWorkbook wb=new HSSFWorkbook(fs);
		HSSFSheet sheet=wb.getSheet("Sheet1");
		/* Map<String, Object[]> data = new TreeMap<String, Object[]>();
	        data.put("1", new Object[]{ "Abhishek","Abhishek" });
	        data.put("2", new Object[]{ "Abhishek", "Abhishek" });
	        data.put("3", new Object[]{ "Abhishek", "Abhishek" });*/
	        
		sheet.getRow(0).getCell(0).setCellValue("Abhishek");
		sheet.getRow(0).getCell(1).setCellValue("Abhishek");
		sheet.getRow(1).getCell(0).setCellValue("Abhishek");
		sheet.getRow(1).getCell(1).setCellValue("Abhishek");
		sheet.getRow(2).getCell(0).setCellValue("Abhishek");
		sheet.getRow(2).getCell(1).setCellValue("Abhishek");
		
	      /*  Set<String> keyset = data.keySet();
	        int rownum = 0;
	        for (String key : keyset) {
	            // this creates a new row in the sheet
	            Row row = sheet.createRow(rownum++);
	            Object[] objArr = data.get(key);
	            int cellnum = 0;
	            for (Object obj : objArr) {
	                // this line creates a cell in the next column of that row
	                Cell cell = row.createCell(cellnum++);
	                if (obj instanceof String)
	                    cell.setCellValue((String)obj);
	                else if (obj instanceof Integer)
	                    cell.setCellValue((Integer)obj);
	            }
	        }*/
		FileOutputStream fo=new FileOutputStream(file);
		wb.write(fo);
		fo.flush();
		fo.close();
		
	}

	public static void main(String[] args) throws IOException {
		//String path="C:/Users/Bachhi/Google Drive/QA Automation/Feb 12 2018/Read Only QA Automation Feb 12 2018_/Eclipsecode Divya/Java/File1.xls";
		
		readDataFromXl();
		writeDataToXl();
		
	}

}
