package com.kodnest.arraydatastructure;

import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Length");
		int n=sc.nextInt();
		Array a=new Array(n);
		while(true) {
			System.out.println("1.Insert");
			System.out.println(" ");
			System.out.println("2.Delete");
			System.out.println(" ");
			System.out.println("3.Display");
			System.out.println(" ");
			System.out.println("Any other number for exiting");
			System.out.println(" ");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:a.insert();
			break;
			case 2:a.delete();
			break;
			case 3:a.display();
			break;
			default:System.exit(0);
			
			}
			sc.close();
		}
	

	}

}
