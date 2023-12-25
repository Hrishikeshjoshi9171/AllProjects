package Parameter;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
        String Path="C:\\Users\\hrish\\Downloads\\Testdata.xlsx";
		
		FileInputStream file=new FileInputStream(Path);
		
		double data=WorkbookFactory.create(file).getSheet("Sheet2").getRow(2).getCell(3).getNumericCellValue();
		
		System.out.println(data);

	}

}
