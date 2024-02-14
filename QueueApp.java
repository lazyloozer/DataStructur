package com.kodnest.queue;

import java.util.Scanner;

public class QueueApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an element");
		int n=sc.nextInt();
		Queue queue=new Queue(n);
		while(true) {
			System.out.println("Press 1------->Insert");
			System.out.println("Press 2------->Delete");
			System.out.println("Press 3------->Display");
			System.out.println("Press Other ------->Stop");
			System.out.println("Enter the Your Choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:queue.insert();
			break;
			case 2:queue.delete();
			break;
			case 3:queue.display();
			break;
			default:System.exit(0);
			}
		}
		

	}

}
