package parser.exXLSX2;

public class Main {
    public static void main(String[] args) {
        ReadExcel readExcel = new ReadExcel("src/main/java/parser/exXLSX2/SomeData.xlsx", "Лист1");
        System.out.println(readExcel.excelDataToMap(2));//{DH=D3, CH=C3, BH=B3, AH=A3}
        System.out.println(readExcel.excelDataToMapContains("CH", "C5"));//{DH=D5, CH=C5, BH=B5, AH=A5}


        ReadExcelAr readExcelAr = new ReadExcelAr("src/main/java/parser/exXLSX2/SomeData.xlsx", "Лист1");
        System.out.printf(readExcelAr.getCellValue(0,1));//BH
    }
}
