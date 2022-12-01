package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.batik.apps.rasterizer.Main;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example18_readAllDataInARow  
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Documents\\Velocity Class Notes\\Automation Testing Notes\\Excelsheet\\Example3.xlsx");
Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
int lastcellIndex = sh.getRow(0).getLastCellNum()-1;
for(int i=0;i<=lastcellIndex;i++)
{
	String value = sh.getRow(0).getCell(i).getStringCellValue();
System.out.println(value+" ");


}
}
}
