import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class WriteExcel {
    public static void main(String[] args) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sheet1");
        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue("Name");
        row.createCell(1).setCellValue("Age");
        row.createCell(2).setCellValue("City");

        Row row1 = sheet.createRow(1);
        row1.createCell(0).setCellValue("Alice");
        row1.createCell(1).setCellValue(25);
        row1.createCell(2).setCellValue("New York");

        FileOutputStream fos = new FileOutputStream(new File("data.xlsx"));
        workbook.write(fos);
        workbook.close();
        fos.close();
    }
}
