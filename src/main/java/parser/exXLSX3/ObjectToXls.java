package parser.exXLSX3;

import _Tasks.task7.Person;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ObjectToXls {
    public static void main(String[] args) {
        List<_Tasks.task7.Person> personList = new ArrayList<>();
        personList.add(new _Tasks.task7.Person("Иван", "Иванов", 30));
        personList.add(new _Tasks.task7.Person("Петр", "Петров", 35));
        personList.add(new _Tasks.task7.Person("Анна", "Сидорова", 25));
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
            try (FileOutputStream fos = new FileOutputStream("src/main/java/parser/exXLSX3/SomeData2.xlsx")) {
                workbook.write(fos);
                System.out.println("Данные успешно записаны в Excel файл.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
