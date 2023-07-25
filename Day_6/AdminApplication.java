package com.highradius.admin;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class AdminApplication {
	
	public static String FILE_PATH = "C:\\Users\\KIIT\\Documents\\1 hrc\\Core Java\\Day_6\\Quiz_result.txt";

	public static void main(String[] args) {
		
		int id;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the id: ");
		id = Integer.parseInt(sc.nextLine());
		
		try {
			
			getScoreById(id);
		}
		catch(IOException e) {
			
			System.out.println("Some error occured.");
		}
		finally {
			
			sc.close();
		}
	}
	/**
	 * This method will take id and return score of that person
	 * @param id
	 * @return
	 * @throws IOException
	 */
	public static int getScoreById(int id) throws IOException{
	
		List<String> fileContent = Files.readAllLines(Paths.get(FILE_PATH));
		boolean isFound = false;
		
		String[] data;
		
		for(String line:fileContent) {
			
			data = line.split(",");
			if(Integer.parseInt(data[0]) == id) {
				
				isFound = true;
				System.out.println("Score: "+data[2]);
				break;
			}
		}
		
		if(!isFound) {
			
			System.out.println("Employee not there...");
		}
		return 0;
	}
}
