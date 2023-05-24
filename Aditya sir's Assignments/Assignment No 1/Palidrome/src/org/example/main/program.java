package org.example.main;
import java.util.Scanner;

public class program{
	public static void main(String[] args) {
		String rev ="";
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter string ");
		
		String str = null;
		try {
			str = sc.nextLine();
		} catch (Exception e) {
			System.out.println("Oops you have enterd other than string");
			e.printStackTrace();
		}
		
		for (int i = str.length()-1;i>=0;i--) {
			
		  rev =rev + str.charAt(i);
			
		}
		if (str.equals(rev)) {
			System.out.println("Given string is palindrome");
		}
		else 
			System.out.println("Givern Srting is not a palindrome string");
		
	}
}
