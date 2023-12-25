package Parameter;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
        String Path="C:\\Users\\hrish\\Downloads\\Testdata.xlsx";
		
		FileInputStream file=new FileInputStream(Path);
		
		Boolean data= WorkbookFactory.create(file).getSheet("Sheet1").
		getRow(2).
		getCell(2).
		getBooleanCellValue();
		
		System.out.println(data);
	}

}
