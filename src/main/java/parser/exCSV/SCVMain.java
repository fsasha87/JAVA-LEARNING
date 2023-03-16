package parser.exCSV;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SCVMain {
    public static void main(String[] args) throws IOException {
        try (CSVReader reader = new CSVReader(new FileReader("src/main/java/parser/exCSV/data.csv"))) {
//1сп: считали в лист
            List<String[]> listData = reader.readAll();
            listData.forEach(x-> System.out.println(Arrays.toString(x)));
//2сп: считали в массив строк
            String[] lineInArray;
            while ((lineInArray = reader.readNext()) != null) {
                System.out.println(lineInArray[0] + lineInArray[1] + lineInArray[2]);
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

        //3сп считали без CSV-reader
        List<String[]> collect =
                Files.lines(Paths.get("src/main/java/parser/exCSV/data.csv"))
                        .map(line -> line.split(","))
                        .collect(Collectors.toList());
        for (String[] item : collect)
            System.out.println(Arrays.toString(item));
    }
}
