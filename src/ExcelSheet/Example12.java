package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example12 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream m1=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Documents\\Velocity Class Notes\\Automation Testing Notes\\Excelsheet\\Example2.xlsx"); 

Workbook m2 = WorkbookFactory.create(m1);

Sheet m3 = m2.getSheet("Sheet1");
Row m4 = m3.getRow(0);           ////Index form 
Cell m5 = m4.getCell(0);
String result = m5.getStringCellValue();
System.out.println(result);

}
}
