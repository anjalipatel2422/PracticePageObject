package org.example;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class BasePage {
    protected static WebDriver driver;
//}
//public class LoadProp {
//    static Properties prop;
//    static FileInputStream input;
//    static String fileName = "TestDataConfig.properties";
//    static String fileLocation ="";
//    public String getProperty(String key){
//        prop=new Properties();
//        try {
//            input = new FileInputStream(fileLocation + fileName);
//            prop.load(input);
//            input.close();
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//        return  prop.getProperty(key);
//    }
    @Test
    public static void ReadExcel  () throws Exception
        {
    File file =new File("C:\\Users\\KMPatel\\Desktop\\software\\anjali\\ReadExcel1.xlsx");
    FileInputStream fileInputStream= new FileInputStream(file);
            XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
            XSSFSheet sheet1 =workbook.getSheetAt(0);
            String Data = sheet1.getRow(0).getCell(0).getStringCellValue();//store string value in data
            System.out.println("Data from excel is " +Data);

}}
