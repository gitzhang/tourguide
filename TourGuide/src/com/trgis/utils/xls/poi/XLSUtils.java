package com.trgis.utils.xls.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * 
 * ����xls�ļ��Ĺ�����
 * 
 * ʹ��apache POI��Ŀ��
 * 
 * @author ��ǫ
 * 
 */
public class XLSUtils {

	private static final Logger logger = Logger.getLogger(XLSUtils.class);

	/**
	 * ��ȡexcel�ļ�
	 * 
	 * @param excelFilePath
	 * @return
	 */
	public static File getExcelFile(String excelFilePath) {
		try {
			File file = new File(excelFilePath);
			if (file != null && file.exists()) {
				return file;
			}
		} catch (Exception e) {
			return null;
		}
		return null;
	}

	public static List<List<String>> getExcelRecords(
			final String excelFilePath, final String sheetName,
			final Integer sheetIndex) {
		
		List<List<String>> results = null;
		
		File file = getExcelFile(excelFilePath);
		HSSFWorkbook hswb = null;
		try {
			hswb = new HSSFWorkbook(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		HSSFSheet sheet = null;
		if (sheetName != null) {
			sheet = hswb.getSheet(sheetName);
		} else if (sheetIndex != null) {
			sheet = hswb.getSheetAt(sheetIndex);
		} else {
			sheet = hswb.getSheetAt(0);
		}
		if (sheet == null) {
			throw new RuntimeException("��ǩҳ������");
		}

		int rows = sheet.getPhysicalNumberOfRows(); // ��¼����
		
		results = new ArrayList<List<String>>();
		
		for (int i = 0; i < rows; i++) {
			List<String> result = new ArrayList<String>();			
			HSSFRow row = sheet.getRow(i);
			int cells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < cells; j++) {
				HSSFCell cell = row.getCell(j);
				String cellValue = null;
				switch (cell.getCellType()) {
				case HSSFCell.CELL_TYPE_STRING:
					cellValue = cell.getStringCellValue();
					break;
				case HSSFCell.CELL_TYPE_NUMERIC:
					double bc = cell.getNumericCellValue();
					DecimalFormat df = new DecimalFormat("#");
					cellValue = df.format(bc);
					break;
				}
				result.add(cellValue);
			}
			results.add(result);
		}
		return results;
	}
	
	public static List<List<String>> getExcelRecords(
			final File file, final String sheetName,
			final Integer sheetIndex) {
		
		List<List<String>> results = null;
		
		HSSFWorkbook hswb = null;
		try {
			hswb = new HSSFWorkbook(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		HSSFSheet sheet = null;
		if (sheetName != null) {
			sheet = hswb.getSheet(sheetName);
		} else if (sheetIndex != null) {
			sheet = hswb.getSheetAt(sheetIndex);
		} else {
			sheet = hswb.getSheetAt(0);
		}
		if (sheet == null) {
			throw new RuntimeException("��ǩҳ������");
		}

		int rows = sheet.getPhysicalNumberOfRows(); // ��¼����
		
		results = new ArrayList<List<String>>();
		
		for (int i = 0; i < rows; i++) {
			List<String> result = new ArrayList<String>();			
			HSSFRow row = sheet.getRow(i);
			int cells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < cells; j++) {
				HSSFCell cell = row.getCell(j);
				String cellValue = null;
				switch (cell.getCellType()) {
				case HSSFCell.CELL_TYPE_STRING:
					cellValue = cell.getStringCellValue();
					break;
				case HSSFCell.CELL_TYPE_NUMERIC:
					double bc = cell.getNumericCellValue();
					DecimalFormat df = new DecimalFormat("#");
					cellValue = df.format(bc);
					break;
				}
				result.add(cellValue);
			}
			results.add(result);
		}
		return results;
	}

	public static void main(String[] args) {
		String sheetName = null;
		Integer sheetIndex = null;
		List<List<String>> result = getExcelRecords("E:/�Ƿֱ�.xls",
				sheetName, sheetIndex);
		
		System.out.println(result.toString());
		
	}

}
