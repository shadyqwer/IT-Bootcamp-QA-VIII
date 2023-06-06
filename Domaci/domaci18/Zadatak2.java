package domaci18;

import com.github.javafaker.Faker;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
        String relativePath = "src/main/java/domaci18/zad2.xlsx";
        ArrayList<String> names = new ArrayList<>();

        try {
            readData(relativePath, names);
        } catch (IOException e) {
            e.printStackTrace();
        }

        addFakeNames(names);

        try {
            writeData(relativePath, names);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readData(String relativePath, ArrayList<String> names) throws IOException {
        FileInputStream inputStream = new FileInputStream(relativePath);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        XSSFRow row = sheet.getRow(0);
        for (int i = 0; i < 5; i++) {
            XSSFCell cell = row.getCell(i);
            names.add(cell.getStringCellValue());
        }

        inputStream.close();
    }

    public static void addFakeNames(ArrayList<String> names) {
        Faker faker = new Faker();

        for (int i = 0; i < 5; i++) {
            names.add(faker.name().firstName());
        }
    }

    public static void writeData(String relativePath, ArrayList<String> names) throws IOException {
        FileInputStream inputStream = new FileInputStream(relativePath);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        XSSFSheet sheet;
        if (workbook.getNumberOfSheets() > 1) {
            sheet = workbook.getSheetAt(1);
        } else {
            sheet = workbook.createSheet("Sheet2");
        }

        XSSFRow row = sheet.createRow(0);
        for (int i = 0; i < names.size(); i++) {
            XSSFCell cell = row.createCell(i);
            cell.setCellValue(names.get(i));
        }

        inputStream.close();

        FileOutputStream outputStream = new FileOutputStream(relativePath);
        workbook.write(outputStream);

        outputStream.close();
        workbook.close();
    }
}
