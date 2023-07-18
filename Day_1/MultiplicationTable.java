package mypackage;

import java.util.Scanner;

public class MultiplicationTable{
	public static void main(String[] args){
			@SuppressWarnings("resource")
			Scanner  sc = new Scanner(System.in);
			System.out.println("Enter number : ");
			int  n = sc.nextInt();
			for(int i =0; i<=n; i++){
				System.out.println(n + "x" + i  + "=" + n*i);
			}
	}
}
