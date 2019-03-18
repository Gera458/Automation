package org.vms.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Read {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fs=new FileInputStream("./sheet/MG.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sh= wb.getSheetAt(0);
		int rowno=sh.getPhysicalNumberOfRows();
		for(int i=0; i<rowno; i++)
		{
			XSSFRow row=sh.getRow(i);
			XSSFCell cell= row.getCell(0);
			XSSFCell cell1=row.getCell(1);
			XSSFCell cell5=row.getCell(5);
			XSSFCell cell11=row.getCell(11);
			int cellno=row.getPhysicalNumberOfCells();
			System.out.println(cellno);
			
			System.out.println(cell);
			System.out.println(cell1);
			/*System.out.println(cell5);
			System.out.println(cell11);*/
			
		}
		
		
		
	}

}
