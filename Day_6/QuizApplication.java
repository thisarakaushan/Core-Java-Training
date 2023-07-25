// Create a Quiz application with 5 questions and store scores in a flat file.

package com.highradius.quiz.app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QuizApplication {

	public static void main(String[] args) {

		String name;
		int answer, score = 0, id;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		
		System.out.println("Enter your id: ");
		id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Hi"+name+"Welcome to the Quiz!");
		System.out.println("===============================");
		
		System.out.println("Q1. What is the capital city of Sri Lanka?");
		System.out.println("1. Galle  2. Colombo  3. Matara  4. Kalutara");
		System.err.println("Enter your choice: ");
		answer = Integer.parseInt(sc.nextLine());
		if(answer==2)
			score+=20;
		
		System.out.println("Q2. What is the capital city of India?");
		System.out.println("1. Delhi  2. Odisha  3. Kalkata  4. Chennai");
		System.err.println("Enter your choice: ");
		answer = Integer.parseInt(sc.nextLine());
		if(answer==1)
			score+=20;
		
		System.out.println("Q3. What is the capital city of Nepal?");
		System.out.println("1. Birgunj  2. Dharan  3. Kathmandu  4. Pokhara");
		System.err.println("Enter your choice: ");
		answer = Integer.parseInt(sc.nextLine());
		if(answer==3)
			score+=20;
		
		System.out.println("Q4. What is the capital city of Bangaladesh?");
		System.out.println("1. Tongi  2. Dhaka  3. Feni  4. Pabna");
		System.err.println("Enter your choice: ");
		answer = Integer.parseInt(sc.nextLine());
		if(answer==2)
			score+=20;
		
		System.out.println("Q5. What is the capital city of Australia?");
		System.out.println("1. Melborn  2. Perth  3. Sydny  4. Canbera");
		System.err.println("Enter your choice: ");
		answer = Integer.parseInt(sc.nextLine());
		if(answer==4)
			score+=20;
		
		if(score>60)
			System.out.println("Congratulation! yoy got "+score+"%");
		else {
			
			System.out.println("Sorry! Again try....");
		}	
		
		try 
		{
			saveScoreDetails(id, name, score);
		}
		catch(IOException e) 
		{
			System.out.println("Some error occured.!!");
		}
		finally {
			
			sc.close();
		}
	
	}
	
	/**
	 * This method will take id, name and score and save the details in file.
	 * @param id
	 * @param name
	 * @param score
	 */
	public static void saveScoreDetails(int id,String name, int score) throws IOException {
		
		File f1 = new File("C:\\Users\\KIIT\\Documents\\1 hrc\\Core Java\\Day_6\\Quiz_result.txt");
		FileWriter fw = new FileWriter(f1, true);
		
		fw.write(id+","+name+","+score+"\n");
		fw.close();
	
	}
}
