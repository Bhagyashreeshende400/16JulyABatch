package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example22 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Documents\\Velocity Class Notes\\Automation Testing Notes\\Excelsheet\\Example3.xlsx");
Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	int lastrow = sh.getLastRowNum();
	
	for(int i=0;i<=lastrow;i++)
	{
		int lastcell = sh.getRow(i).getLastCellNum()-1;
	for(int j=0;j<=lastcell;j++)
	{
		String value = sh.getRow(i).getCell(j).getStringCellValue();
	
	
	System.out.println(value+" ");
	}
		
		
		
		
	}
	
	



}
}
