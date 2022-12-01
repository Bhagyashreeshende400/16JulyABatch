package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example23 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
FileInputStream file=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Documents\\Velocity Class Notes\\Automation Testing Notes\\Excelsheet\\Example3.xlsx");
	
Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");

int lastrow = sh.getLastRowNum();

for(int i=0; i<=lastrow;i++)      //Outer for loop---> Rows
{
	int lastcellindex = sh.getRow(i).getLastCellNum()-1;

for(int j=0;j<=lastcellindex;j++)    //InnerLoop----> Column
{
String value = sh.getRow(i).getCell(j).getStringCellValue();
System.out.println(value+" ");


}



}




	
}
	
	
}
