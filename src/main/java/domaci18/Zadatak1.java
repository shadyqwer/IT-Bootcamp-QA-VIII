package domaci18;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Zadatak1 {
    public static void main(String[] args) {
        String relativePath = "src/main/java/domaci18/zad1.xlsx";
        try {
            zadatak1(relativePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void zadatak1(String relativePath) throws IOException {
        FileInputStream inputStream = new FileInputStream(relativePath);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        XSSFSheet sheetAvg;
        if (workbook.getNumberOfSheets() > 1) {
            sheetAvg = workbook.getSheetAt(1);
        } else {
            sheetAvg = workbook.createSheet("Sheet2");
        }

        XSSFRow rowAvg = sheetAvg.createRow(0);

        for (int i = 0; i < 3; i++) {
            XSSFRow row = sheet.getRow(i);
            double sum = 0;

            for (int j = 0; j < 5; j++) {
                XSSFCell cell = row.getCell(j);
                sum += cell.getNumericCellValue();
            }

            XSSFCell cellAvg = rowAvg.createCell(i);
            cellAvg.setCellValue(sum / 5);
        }

        inputStream.close();

        FileOutputStream outputStream = new FileOutputStream(relativePath);
        workbook.write(outputStream);

        outputStream.close();
        workbook.close();
    }
}
