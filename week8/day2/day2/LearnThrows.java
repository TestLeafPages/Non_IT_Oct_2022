package week8.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnThrows {
	
	public static void run() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public static void main(String[] args) throws InterruptedException, IOException  {
 
		run();
		XSSFWorkbook wb=new XSSFWorkbook("data/file");
		
		try {
			XSSFWorkbook wb1=new XSSFWorkbook("./data");
		} catch (IOException e) {
			System.out.println(e);
		}


	}

}
