package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example6 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream data=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Documents\\Velocity Class Notes\\Automation Testing Notes\\Excelsheet\\Example3.xlsx");
String output = WorkbookFactory.create(data).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();

System.out.println(output);








}
}
