package com.trgis.utils.xls.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
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

	public static List<Map<String, Object>> getExcelRecords(
			String excelFilePath, String sheetName, String sheetIndex) {
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
		
		return null;
	}

}
