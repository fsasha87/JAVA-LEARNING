package _Tasks.task7;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
////7-1: ExcelToArray: dependency(poi-ooxml)=>ReadExcel(S_path,S_sheet){new XSSFWorkbook(fis); getSheet}=>
////=>S[][]getData{S[sheet.getPhysicalNumberOfRows][getRow(0).getLastCellNum]+fori{cell=getRow(i).getCell(j)+new DataFormatter().formatCellValue(cell)}
////=>S_getCellValue(i_row,i_col) => main sout(array)
//        ReadExcelAr readExcelAr = new ReadExcelAr("src/main/java/_Tasks/task7/SomeData.xlsx", "Лист1");
//        System.out.println(Arrays.deepToString(readExcelAr.getRowColData()));
//        System.out.println(readExcelAr.getCellValue(2,3));
//
////7-2: ExcelToMap: dependency(poi-ooxml)=>ReadExcel(S_path,S_sheet){new XSSFWorkbook(fis); getSheet}=>
////=>S_getCellData(i_row,i_col){dataFormatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum))}
////=>{S[]_getRowData(i_row){S[totalCol]+fori{getCellData(row,i)}}
////=> HM_dataToMap(i_row){getRowData(0/row)+fori{map.put(ar0[i],arRow[i])}}
////=>sy_HM_dataToMapContains(S_header,S_value){fori{excelDataToMap(i)+if(map.get(header).equals(value))}
//        ReadExcelToMap readExcelToMap = new ReadExcelToMap("src/main/java/_Tasks/task7/SomeData.xlsx", "Лист1");
//        System.out.println(readExcelToMap.excelDataToMap(0));
//        System.out.println(readExcelToMap.excelDataToMapContains("DH", "D5"));

//7-3: ObjectToXLS: Person(name,surname,age)=> main: list<Person> => new_WB => createSheet => S[]_headers => sheet.createRow(0)
//=>fori{row.CreateCell(i)+cell.setCellValue(ar[i])} =>for(list){createRow(rowNum++)+row.createCell(0).setCellValue(person.getFirstName());...}
//=> new fos(path) => WB.write(fos);
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Иван", "Иванов", 30));
        personList.add(new Person("Петр", "Петров", 35));
        personList.add(new Person("Анна", "Сидорова", 25));
        try (Workbook workbook = new XSSFWorkbook()) {
            String sheetName = LocalDate.now().toString();
            Sheet sheet = workbook.createSheet(sheetName);
            String[] headers = {"Имя", "Фамилия", "Возраст"};
            Row headerRow = sheet.createRow(0);
            for (int i = 0; i < headers.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(headers[i]);
            }
            int rowNum = 1;
            for (Person person : personList) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(person.getFirstName());
                row.createCell(1).setCellValue(person.getLastName());
                row.createCell(2).setCellValue(person.getAge());
            }
            try (FileOutputStream fos = new FileOutputStream("src/main/java/_Tasks/task7/SomeData2.xlsx")) {
                workbook.write(fos);
                System.out.println("Данные успешно записаны в Excel файл.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }

}
