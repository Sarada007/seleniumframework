package com.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.WorkbookUtil;

public class ExcelUtility {
public String getDataFromExcel(String sheetName,int rowNum,int celNum) throws Throwable{
	FileInputStream fis=new FileInputStream("./data/tetscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheetName);
	  Row row = sh.getRow(rowNum);
	  Cell cell = row.getCell(celNum);
	 String data = cell.getStringCellValue();
	//String data = wb.getSheet(sheetName).getRow(rowNum).getCell(celNum).getStringCellValue();
	  wb.close();
	  return data;
	
}
public int getRowCount(String sheetName) throws Throwable {
	FileInputStream fis=new FileInputStream(IPathConstant.ExcelPath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetName);
	wb.close();
	return sh.getLastRowNum();
}
public void setDataExcel(String sheetName,int rowNum,int celNum,String data) throws Throwable {
	FileInputStream fis=new FileInputStream(IPathConstant.ExcelPath);
	Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheetName);
	  Row row = sh.getRow(rowNum);
	   Cell cel = row.createCell(celNum);
	cel.setCellValue(data);  
	FileOutputStream fos=new FileOutputStream(IPathConstant.ExcelPath);
	wb.write(fos);
	wb.close();
	
}
}
