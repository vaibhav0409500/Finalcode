package com.demo.qa.testcases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteintoExcel {

       public static void main(String[] args) throws IOException {

             String path = "D://DemoFile.xlsx";

             FileInputStream fs = new FileInputStream(path);
             Workbook wb = new XSSFWorkbook(fs);

             Sheet sheet = wb.createSheet("Vaibhav_Demo");
             Row row = sheet.createRow(2);

             Cell cell = row.createCell(2, CellType.STRING);
             cell.setCellValue("Hi I am Vaibhav, This is for Demo");

             FileOutputStream fos = new FileOutputStream(path);
             wb.write(fos);
             wb.close();
             fos.close();
       }

}
