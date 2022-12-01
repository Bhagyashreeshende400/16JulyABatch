package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readAllDataInASheet 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Documents\\Velocity Class Notes\\Automation Testing Notes\\Excelsheet\\Example3.xlsx");
Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
int lastRowIndex = sh.getLastRowNum();
for(int i=0;i<=lastRowIndex;i++)        //Outer Loop---->Rows
{
	int lastCellIndex = sh.getRow(i).getLastCellNum()-1;
for(int j=0;j<=lastCellIndex;j++) 
{
	String value = sh.getRow(i).getCell(j).getStringCellValue();
System.out.println(value+" ");

}
}


}
	
}
