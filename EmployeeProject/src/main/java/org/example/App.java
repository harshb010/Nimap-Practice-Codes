package org.example;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.InputStream;

public class App {

    public static void main(String[] args) {

        try (InputStream fis = App.class.getClassLoader().getResourceAsStream("Employee.xlsx");
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {

                if (row.getRowNum() == 0) {
                    continue;
                }
                Cell Empid = row.getCell(0);
                Cell EmpName = row.getCell(1);
                Cell EmpSalary = row.getCell(2);
                Cell Designation = row.getCell(3);


                int id = (int) Empid.getNumericCellValue();
                String name = EmpName.getStringCellValue();
                int salary = (int) EmpSalary.getNumericCellValue();
                String designation = Designation.getStringCellValue();

                if (salary > 20000) {
                    System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary + ", " + designation);

                }

            }

        } catch (Exception e) {
            System.err.println("An unexpected error occurred during Excel processing: " + e.getMessage());
            e.printStackTrace();
        }
    }
}