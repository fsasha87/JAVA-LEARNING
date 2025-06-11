package _Tasks.task7;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

public class ReadExcelToMap {
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;

    public ReadExcelToMap(String path, String sheetName) {
        try {
            workbook = new XSSFWorkbook(new FileInputStream(path));
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            Assert.fail("Exception: " + e.getMessage());
        }
    }

    public String getCellData(int rowNum, int colNum) {
        cell = sheet.getRow(rowNum).getCell(colNum);
        DataFormatter formatter = new DataFormatter();
        return formatter.formatCellValue(cell);
    }

    public String[] getRowData(int rowNum) {
        int totalCol = sheet.getRow(rowNum).getPhysicalNumberOfCells();
        String[] array = new String[totalCol];
        for (int i = 0; i < totalCol; i++) {
            array[i] = getCellData(rowNum, i);
        }
        return array;
    }

    public HashMap<String, String> excelDataToMap(int row) {
        HashMap<String, String> map = new HashMap<>();
        String[] arHeader = getRowData(0);
        String[] arValues = getRowData(row);
        for (int i = 0; i < arHeader.length-1; i++) {
            map.put(arHeader[i], arValues[i]);
        }
        return map;
    }

    public synchronized HashMap<String, String> excelDataToMapContains(String header, String value) {
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
//            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            HashMap<String, String> map = excelDataToMap(i);
            if (map.get(header).equals(value))
                return map;
        }
        Assert.fail("Can not find value " + value);
        return null;
    }

}
