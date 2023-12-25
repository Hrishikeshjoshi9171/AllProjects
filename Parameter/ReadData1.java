package Parameter;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String Path="C:\\Users\\hrish\\Downloads\\Testdata.xlsx";
		
		FileInputStream file=new FileInputStream(Path);
		
//		String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//		
//		System.out.println(data);
		
		String data1=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(data1);

	}

}
