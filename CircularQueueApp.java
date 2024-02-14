package com.kodnest.circularqueue;

import java.util.Scanner;

public class CircularQueueApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an size of an array");
		int n=sc.nextInt();
		CircularQueue cq=new CircularQueue(n);
		
		while(true) {
			System.out.println("Press1--------->Insert");
			System.out.println("Press2--------->Delete");
			System.out.println("Press3--------->Display");
			System.out.println("Other --------->Exit");
			
			System.out.println("Enter Your Choice");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:cq.insert();
			break;
			case 2:cq.delete();
			break;
			case 3:cq.display();
			break;
			default:System.exit(0);
			}
		}
	

	}

}
