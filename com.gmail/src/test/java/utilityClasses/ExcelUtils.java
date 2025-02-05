package utilityClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils {

	 	
	    private static final String FILE_PATH="C://Users//Deb//Desktop//OrangeCRM//com.gmail//sheets//Test.xlsx";
	    
	    public static String getCellData(String sheetName,int row, int col) throws IOException {
	   
	        FileInputStream fis = new FileInputStream(FILE_PATH);
	        Workbook workbook = new XSSFWorkbook(fis);

	            Sheet sheet = workbook.getSheet(sheetName);
	            return sheet.getRow(row).getCell(col).getStringCellValue();
	       
	    	/*
	      String FILE_PATH="C://Users//Deb//Desktop//OrangeCRM//com.gmail//sheets//Test.xlsx";
	      StringBuilder data = new StringBuilder();
	      FileInputStream fis = new FileInputStream(new File(FILE_PATH));
	              Workbook workbook = new XSSFWorkbook(fis);

	             // Get the first sheet
	             Sheet sheet = workbook.getSheetAt(0);

	          // Iterate through rows
	             for (Row row1 : sheet) {
	                 for (Cell cell : row1) {
	                     switch (cell.getCellType()) {
	                         case STRING:
	                             data.append(cell.getStringCellValue()).append("\t");
	                             break;
	                         case NUMERIC:
	                             if (DateUtil.isCellDateFormatted(cell)) {
	                                 data.append(cell.getDateCellValue()).append("\t");
	                             } else {
	                                 data.append(cell.getNumericCellValue()).append("\t");
	                             }
	                             break;
	                         case BOOLEAN:
	                             data.append(cell.getBooleanCellValue()).append("\t");
	                             break;
	                         case FORMULA:
	                             data.append(cell.getCellFormula()).append("\t");
	                             break;
	                         default:
	                             data.append("Unknown Value").append("\t");
	                     }
	                 }
	                 data.append("\n"); // Move to the next line after each row
	             
	         }

	         return data.toString();
	        */
	    }
}
