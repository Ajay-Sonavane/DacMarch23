package org.example.main;

import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		int size;
		 System.out.println("Enter array size");
		 Scanner sc = new Scanner (System.in);
		 size = sc.nextInt();
		 
		 System.out.println("Enter "+size+" element in the array");

			int [] arr = new int [size];
			for (int i = 0; i<size; i++) {
				try {
					arr[i] = sc.nextInt();
				} catch (Exception e) {
					System.out.println("OOps you entered other than Integer element ");
					e.printStackTrace();
				}
				
			}
			int sum =0;
			for (int i=0; i<size;i++) {
				sum = sum+arr[i];
				
			}
			System.out.println("The addition of the array elements is "+sum);

			
			
	}
}
