package seleniumassignments1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_Easyway {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1=new FileInputStream ("C:\\Users\\rashe\\eclipse-workspace\\Ab_42\\DDT\\aman.xlsx");
		
		Workbook w1=	WorkbookFactory.create(f1);
	String username=	w1.getSheet("login").getRow(0).getCell(0).getStringCellValue()	;	
	String password=	w1.getSheet("login").getRow(0).getCell(1).getStringCellValue()	;		
		System.out.println(username);
		System.out.println(password);
		
		
	}

}
