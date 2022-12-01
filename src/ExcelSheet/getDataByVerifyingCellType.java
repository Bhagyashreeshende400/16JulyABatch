package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getDataByVerifyingCellType 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Documents\\Velocity Class Notes\\Automation Testing Notes\\Excelsheet\\Example3.xlsx");
	Cell cellInfo = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0);	
	CellType s1 = cellInfo.getCellType();	
	if(s1==CellType.STRING)
	{
		String value = cellInfo.getStringCellValue();	
	System.out.println(value);
	
	}
	else if(s1==CellType.NUMERIC)
	{
		double value = cellInfo.getNumericCellValue();
	System.out.println(value);
	}
	else if(s1==CellType.BOOLEAN)
	{
		boolean value = cellInfo.getBooleanCellValue();
	System.out.println(value);
	}
}
}