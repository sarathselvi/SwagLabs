package com.swaglabs.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.swaglabs.constants.FrameworkConstants;
import com.swaglabs.exceptions.FrameworkException;
import com.swaglabs.exceptions.InvalidPathForExcelException;

public class ExcelReadProperty {

	public static Object[] getTestData(String Sheetname) {

		String excelfilePath = FrameworkConstants.getTestdatasheetpath();

		FileInputStream file = null;
		Workbook workbook = null;
		Sheet sheet = null;
		Object[] data = null;
		String fileExtensionName = excelfilePath.substring(excelfilePath.indexOf("."));

		// Create Input Stream
		try {
			file = new FileInputStream(excelfilePath);
			if (fileExtensionName.equals(".xlsx")) {

				workbook = new XSSFWorkbook(file);

			} else if (fileExtensionName.equals(".xls")) {
				workbook = new HSSFWorkbook(file);

			}

			sheet = workbook.getSheet(Sheetname);

			int rowCount = sheet.getLastRowNum();

			Row row = sheet.getRow(0);

			Map<String, String> dataMap;

			data = new Object[rowCount];

			for (int i = 1; i <= rowCount; i++) {

				dataMap = new HashMap<String, String>();

				for (int j = 0; j < row.getLastCellNum(); j++) {

					String key = sheet.getRow(0).getCell(j).getStringCellValue();
					String value = sheet.getRow(i).getCell(j).getStringCellValue();
					dataMap.put(key, value);
					data[i - 1] = dataMap;

				}

			}

		} catch (FileNotFoundException e) {
			throw new InvalidPathForExcelException(
					"TestData Excel File is not found. Please Check at " + FrameworkConstants.getTestdatasheetpath());

		} catch (IOException e) {
			throw new FrameworkException(
					"TestData Excel File as Expected. Please Check at " + FrameworkConstants.getTestdatasheetpath());
		}
		return data;

	}

}
