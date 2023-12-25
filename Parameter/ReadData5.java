package Parameter;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
        String Path="C:\\Users\\hrish\\Downloads\\Testdata.xlsx";
		
		FileInputStream file=new FileInputStream(Path);
		
		Sheet data=WorkbookFactory.create(file).getSheet("Sheet3");
		
		int LastrowNo =data.getLastRowNum();
		System.out.println(LastrowNo);
		
		for(int i=0;i<=data.getLastRowNum();i++) {
			for(int j=0;j<data.getRow(i).getLastCellNum();j++) {
				String value=data.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(value+"|");
			}
			System.out.println();
		}
	}

}
