package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetCellType2
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
FileInputStream file=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Documents\\Velocity Class Notes\\Automation Testing Notes\\Excelsheet\\Example3.xlsx");	
//CellType m1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getCellType();
//System.out.println(m1);

//CellType m2 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(3).getCellType();
//System.out.println(m2);

CellType m3 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getCellType();
System.out.println(m3);
}
}
