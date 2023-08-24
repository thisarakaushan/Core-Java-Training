package mypackage.csvparsing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import au.com.bytecode.opencsv.CSVReader;

public class CSV {
	
	public static void main(String[] args) {
		
		csvUsingBufferReader();
		csvUsingCSVReader();
		csvParsing();
		
		csvParsing1();
	}
	
	
	/**
	 * Using BufferReader
	 * 
	 */
	public static void csvUsingBufferReader() {
		
		String path = "C:\\Users\\thisara.kaushan\\Documents\\Core Java\\Day_21\\csv_files\\Training(CSV)1.csv";
		BufferedReader bufferedReader = null;
		
		try {
			File file = new File(path);
			FileReader fileReader =  new FileReader(file);
			
			bufferedReader = new BufferedReader(fileReader);
			
			String line = bufferedReader.readLine();
			
			while(line != null) {
				
				System.out.println(line);
				line = bufferedReader.readLine();	
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Using CSVReader
	 * 
	 */
	public static void csvUsingCSVReader() {
		
		System.out.println();
		
		String path = "C:\\Users\\thisara.kaushan\\Documents\\Core Java\\Day_21\\csv_files\\Training(CSV)1.csv";
		CSVReader csvReader = null;
		
		try {
			csvReader = new CSVReader(new FileReader(path));
			csvReader.readNext();
			
			String[] line;
			
 			while((line = csvReader.readNext()) != null) {
 				
 				System.out.println(line[0] +" " + line[1] +" " + line[2]);
 			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Using CSVReader
	 * 
	 */
	public static void csvParsing() {
		
		System.out.println();
		
		String path = "C:\\Users\\thisara.kaushan\\Documents\\Core Java\\Day_21\\csv_files\\Training(CSV)1.csv";
		
		try {
			CSVReader csvReader = new CSVReader(new FileReader(path));
			
			String[] headers = csvReader.readNext();
			
			List<String> headerList = new ArrayList<String>();
			
			for(String header : headers) {
				
				headerList.add(header.replace(" "," ").toUpperCase());
			}
			System.out.println(headerList);
			System.out.println();
			
			String[] line;
			
			while((line = csvReader.readNext()) != null) {
				
				System.out.print(line[headerList.indexOf("VENDOR_ID")] + "\t   ");
				System.out.print(line[headerList.indexOf("COMPANY_NAME")] + "\t  ");
				System.out.println(line[headerList.indexOf("INVOICE_NUMBER")]);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Using Scanner Class
	 * 
	 */
	public static void csvParsing1() {
		
		System.out.println();
		
		String path = "C:\\Users\\thisara.kaushan\\Documents\\Core Java\\Day_21\\csv_files\\Training(CSV)1.csv";
		
		try {
			//parsing a CSV file into Scanner class constructor  
			Scanner sc = new Scanner(new File(path));  
			sc.useDelimiter(" , ");   //sets the delimiter pattern  
			while (sc.hasNext()) // returns a boolean value
			{
				System.out.print(sc.next()); // find and returns the next complete token from this scanner
			} 
			sc.close();  //closes the scanner  	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
