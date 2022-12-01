package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example5_getBooleanData 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
FileInputStream file=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Documents\\Velocity Class Notes\\Automation Testing Notes\\Excelsheet\\Example1.xlsx");	
boolean result = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(0).getBooleanCellValue();
System.out.println(result);







}
}
