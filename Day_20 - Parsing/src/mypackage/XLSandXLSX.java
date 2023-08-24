package mypackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.FormulaEvaluator;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellValue;

public class XLSandXLSX {

	public static void main(String[] args) throws IOException {

		xlsparsing();
		xlsparsing1();
		// xlsparsing2();

		xlsxparsing();
		xlsxparsing1();
	}

	public static void xlsparsing() throws IOException {

		String path = "C:\\Users\\thisara.kaushan\\Documents\\Core Java\\Day_21\\xls_files\\Training(XLS).xls";
		FileInputStream fileInputStream = null;
		HSSFWorkbook hssfWorkbook = null;

		try {
			// obtaining input bytes from a file
			// object of file reader
			fileInputStream = new FileInputStream(new File(path));
			// creating workbook instance that refers to .xls file
			hssfWorkbook = new HSSFWorkbook(fileInputStream);
			// creating a sheet object to retrieve the object
			HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);
			for (Row row : hssfSheet) {
				for (Cell cell : row) {

					if (cell.getCellType() == CellType.STRING) {

						System.out.println(cell.getStringCellValue());
					} else if (cell.getCellType() == CellType.NUMERIC) {

						System.out.println(cell.getNumericCellValue());
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			fileInputStream.close();
			hssfWorkbook.close();
		}
	}

	public static void xlsxparsing() throws IOException {
		
		System.out.println();

		String path = "C:\\Users\\thisara.kaushan\\Documents\\Core Java\\Day_21\\xls_files\\Training(XLSX).xlsx";
		FileInputStream fileInputStream = null;
		XSSFWorkbook xssfWorkbook = null;

		try {

			fileInputStream = new FileInputStream(new File(path));
			xssfWorkbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
			for (Row row : xssfSheet) {
				for (Cell cell : row) {

					if (cell.getCellType() == CellType.STRING) {

						System.out.println(cell.getStringCellValue());
					} else if (cell.getCellType() == CellType.NUMERIC) {

						System.out.println(cell.getNumericCellValue());
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			fileInputStream.close();
			xssfWorkbook.close();
		}
	}

	public static void xlsparsing1() throws IOException {

		System.out.println();

		String path = "C:\\Users\\thisara.kaushan\\Documents\\Core Java\\Day_21\\xls_files\\Training(XLS).xls";
		FileInputStream fileInputStream = null;
		HSSFWorkbook hssfWorkbook = null;

		try {
			// obtaining input bytes from a file
			fileInputStream = new FileInputStream(new File(path));
			// creating workbook instance that refers to .xls file
			hssfWorkbook = new HSSFWorkbook(fileInputStream);
			// creating a sheet object to retrieve the object
			HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);

			FormulaEvaluator formulaEvaluator = hssfWorkbook.getCreationHelper().createFormulaEvaluator();

			for (Row row : hssfSheet) { // iteration over row using for each loop
				for (Cell cell : row) { // iteration over cell using for each loop

					switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
					case NUMERIC: // field that represents numeric cell type
						// getting the value of the cell as a number
						System.out.print(cell.getNumericCellValue() + "\t");
						break;
					case STRING: // field that represents string cell type
						// getting the value of the cell as a string
						System.out.print(cell.getStringCellValue() + "\t");
						break;
					default:
						break;
					}
				}
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			fileInputStream.close();
			hssfWorkbook.close();
		}
	}

	// Using FormulaEvaluator.evaluate(Cell cell)

//	@SuppressWarnings("rawtypes")
//	public static void xlsparsing2() throws IOException {
//
//		System.out.println();
//
//		FileInputStream fis = null;
//		Workbook wb = null;
//		String path = "C:\\Users\\thisara.kaushan\\Documents\\Core Java\\Day_21\\xls_files\\Training(XLS).xls";
//
//		try {
//			fis = new FileInputStream(path);
//			wb = new HSSFWorkbook(fis); // or new XSSFWorkbook("c:/temp/test.xls")
//			Sheet sheet = (Sheet) wb.getSheetAt(0);
//
//			FormulaEvaluator evaluator = wb.getCreationHelper().createFormulaEvaluator();
//
//			// suppose your formula is in B3
//			CellReference cellReference = new CellReference("B3");
//			Row row = sheet.getRow(cellReference.getRow());
//			Cell cell = row.getCell(cellReference.getCol());
//			CellValue cellValue = evaluator.evaluate(cell);
//
//			switch (cellValue.getCellType()) {
//			case BOOLEAN:
//				System.out.println(cellValue.getBooleanValue());
//				break;
//			case NUMERIC:
//				System.out.println(cellValue.getNumberValue());
//				break;
//			case STRING:
//				System.out.println(cellValue.getStringValue());
//				break;
//			case BLANK:
//				break;
//			case ERROR:
//				break;
//			// CELL_TYPE_FORMULA will never happen
//			case FORMULA:
//				break;
//			default:
//				break;
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//
//			fis.close();
//			wb.close();
//		}
//	}

	public static void xlsxparsing1() throws IOException {
		
		System.out.println();

		String path = "C:\\Users\\thisara.kaushan\\Documents\\Core Java\\Day_21\\xls_files\\Training(XLSX).xlsx";
		FileInputStream fileInputStream = null;
		XSSFWorkbook xssfWorkbook = null;

		try {
			File file = new File(path); // creating a new file instance
			fileInputStream = new FileInputStream(file); // obtaining bytes from the file

			// creating Workbook instance that refers to .xlsx file
			xssfWorkbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet sheet = xssfWorkbook.getSheetAt(0); // creating a Sheet object to retrieve object
			
			Iterator<Row> itr = sheet.iterator(); // iterating over excel file
			
			while (itr.hasNext()) {
				Row row = itr.next();
				Iterator<Cell> cellIterator = row.cellIterator(); // iterating over each column
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cell.getCellType()) {
					case STRING: // field that represents string cell type
						System.out.print(cell.getStringCellValue() + "\t");
						break;
					case NUMERIC: // field that represents number cell type
						System.out.print(cell.getNumericCellValue() + "\t");
						break;
					default:
					}
				}
				System.out.println("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			fileInputStream.close();
			xssfWorkbook.close();
		}
	}

}
