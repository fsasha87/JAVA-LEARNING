package parser.exXLSX;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;


public class XlsxMain {
    public static void main(String[] args) throws IOException {
        Workbook workbook = new XSSFWorkbook(new FileInputStream("src/main/java/parser/exXLSX/data2.xlsx"));
        Sheet sheet = workbook.getSheetAt(0);
        int numberOfRows = sheet.getPhysicalNumberOfRows();
        int numberOfColumns = sheet.getRow(0).getLastCellNum();
        String[][] data = new String[numberOfRows][numberOfColumns];
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                Row row = sheet.getRow(i);
                Cell cell = row.getCell(j);
                if (cell.getCellType() == CellType.STRING) {
                    data[i][j] = cell.getStringCellValue();
                }
                if (cell.getCellType() == CellType.NUMERIC) {
                    data[i][j] = (int) cell.getNumericCellValue() + "";
                }
            }
        }
        System.out.println(Arrays.deepToString(data));//[[Brand, Model, Price], [Xiaomi, RedMe5, 1000], [Samsung, Galaxy 2, 2000]]
    }
}
