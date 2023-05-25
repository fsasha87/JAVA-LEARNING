package parser.exXLSX2;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

public class ReadExcel {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private XSSFCell cell;
    public ReadExcel (String path, String sheetName){
        try {
            workbook = new XSSFWorkbook(new FileInputStream(path));
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            Assert.fail("Exception " + e.getMessage());
        }
    }

    public String getCellData(int rowNum, int cellNum){
        cell = sheet.getRow(rowNum).getCell(cellNum);
//        cell = sheet.getRow(rowNum).getCell(cellNum, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
        DataFormatter formatter = new DataFormatter();
        String valueCell = formatter.formatCellValue(cell);
        return valueCell;
    }

    public String[] getRowData (int rowNum){
        int totalCol = sheet.getRow(rowNum).getLastCellNum();
        String[] values = new String[totalCol];
        for (int i = 0; i < totalCol; i++) {
            values[i] = getCellData(rowNum, i);
        }
        return values;
    }

    public HashMap<String, String> excelDataToMap(int rowNum){
        HashMap<String, String> map = new HashMap<>();
        String [] headers = getRowData(0);
        for (int i = 0; i < headers.length; i++) {
            map.put(headers[i], getCellData(rowNum, i));
        }
        return map;
    }

    public synchronized HashMap<String, String> excelDataToMapContains(String colName,  String value) {
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            HashMap<String, String> map = excelDataToMap(i);
            if (map.get(colName).equals(value))
                return map;
        }
        Assert.fail("Can't find data for value: " + value);
        return null;
    }
}

