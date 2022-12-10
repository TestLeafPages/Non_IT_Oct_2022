package week7.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		/*
		 * Steps to read from excel:
1.Open the workbook using filename and path
2.Go to the specific sheet(by sheet name or index)
3.Go to specific row(by index)	
4.Go to the specific column(by index)---cell
5.Read the content from excel 
		 */
		
		//set the path
		XSSFWorkbook wbook=new XSSFWorkbook("Data/CreateLead.xlsx");
		//Open the sheet
		XSSFSheet sheet = wbook.getSheetAt(0);//Read the first sheet index start from 0
		
		//Row count
		
		int rowCount = sheet.getLastRowNum();//ctrl+2
		
		//column count
		
		short columnCount = sheet.getRow(0).getLastCellNum();//ctrl+2
		
		System.out.println("Row Count"+rowCount);
		System.out.println("Column Count"+columnCount);
		//read particular data
		XSSFRow row = sheet.getRow(2);//ctrl+2+l
		XSSFCell cell = row.getCell(3);//ctrl+2+l
		System.out.println(cell.getStringCellValue());
		XSSFRow row1 = sheet.getRow(2);//ctrl+2+l
		XSSFCell cell1 = row1.getCell(2);//ctrl+2+l
		System.out.println(cell1.getStringCellValue());
		//print all data
		for (int i = 0; i <columnCount ; i++) {
			XSSFCell cellcount = row1.getCell(i);
			System.out.println(cellcount);
			
		}
		
		
		
		
		
		
		
		
		

	}

}
