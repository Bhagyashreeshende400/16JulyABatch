package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example2_getColSizeInARow 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
FileInputStream file=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Documents\\Velocity Class Notes\\Automation Testing Notes\\Excelsheet\\Example3.xlsx");	
int Colsize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
System.out.println(Colsize);





}
}
