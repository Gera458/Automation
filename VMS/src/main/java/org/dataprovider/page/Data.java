package org.dataprovider.page;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Data {
	
	public static void main(String[] args) throws IOException {
		//File f= new File("C:\\Users\\Mukul\\Desktop\\test.xlsx");
		FileInputStream fs= new FileInputStream("C:\\Users\\Mukul\\Desktop\\test.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fs);
		XSSFSheet sh=wb.getSheet("sheet1");
		int r=sh.getPhysicalNumberOfRows();
		for(int i=0; i<r; i++) {
		XSSFRow row = sh.getRow(i);
		//XSSFCell roleCode=row.getCell(0);
		System.out.println(i);
		}
		
	}

	
}
