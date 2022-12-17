package util;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExcel {
	public static  String[][] readdata(String filename) throws IOException {
	       //set the path
			XSSFWorkbook wbook=new XSSFWorkbook("Data/"+filename+".xlsx");
			//Open the sheet
			XSSFSheet sheet = wbook.getSheetAt(0);//Read the first sheet index start from 0
			
			//Row count
			
			int rowCount = sheet.getLastRowNum();//ctrl+2
			//column count
			short columnCount = sheet.getRow(0).getLastCellNum();//ctrl+2
			//data
			String [][] data=new String[rowCount][columnCount];
			//get row value outer loop
			for(int i=1;i<=rowCount;i++) {
			XSSFRow row = sheet.getRow(i);//ctrl+2+l
			//column count using inner loop
			for (int j = 0; j<columnCount; j++) {
			XSSFCell cell = row.getCell(j);//ctrl+2+l
	        System.out.println(cell.getStringCellValue());
	        data[i-1][j]= cell.getStringCellValue();//0 0
	        
			}
			
			}
			//to close the workbook
			wbook.close();
			return data;
}
}