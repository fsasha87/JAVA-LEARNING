package parser.exXLSX2;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ReadExcelAr {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private XSSFCell cell;

    public ReadExcelAr (String path, String sheetName){
        try {
            workbook = new XSSFWorkbook(new FileInputStream(path));
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            Assert.fail("Exception " + e.getMessage());
        }
    }

    public String[][] getRowColData(){
        int totalRows = sheet.getPhysicalNumberOfRows();
        int totalCols = sheet.getRow(0).getLastCellNum();
        String [][] array = new String[totalRows][totalCols];
        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                cell = sheet.getRow(i).getCell(j, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
//                cell = sheet.getRow(i).getCell(j);
                DataFormatter formatter = new DataFormatter();
                array[i][j] = formatter.formatCellValue(cell);
            }
        }
        System.out.println(Arrays.deepToString(array));//[[AH, BH, CH, DH], [A2, B2, C2, D2], [A3, B3, C3, D3], [A4, B4, C4, D4], [A5, B5, C5, D5]]
        return array;
    }

    public String getCellValue (int row, int col){
        String[][] array = getRowColData();
        return array[row][col];
    }

}
