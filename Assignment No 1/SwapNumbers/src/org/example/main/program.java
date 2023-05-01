package org.example.main;

import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter two numbers");
		int a = 0;
		int b = 0;
		try {
			a = sc.nextInt ();
			b = sc.nextInt();
		} catch (Exception e) {
			System.out.println("OOps you entered element other than Integer");
			e.printStackTrace();
		}
		System.out.println("Numbers before swapping  : "+a + " "+b);
           a = a+b ;
           b = a-b;
           a  = a-b;
   		System.out.println("Numbers After swapping   : "+a + " "+b);

			
			
	}
}
