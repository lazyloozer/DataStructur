package com.kodnest.stack;

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of an array");
		try {
		int n=sc.nextInt();
		Stack stack = new Stack(n);
		while(true) {
			System.out.println("Press 1>>>>>>Push");
			System.out.println("Press 2>>>>>>Pop");
			System.out.println("Press 3>>>>>>Display");
			System.out.println("Any Other number");
			System.out.println("----------------");
			System.out.println("Enter your Choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:if(n>0)
				stack.push();
			break;
			case 2:stack.pop();
			break;
			case 3:stack.display();
			break;
			default:System.exit(0);
			}
		}

	}catch(Exception e) {
		System.out.println("Enter only numbers");
		e.printStackTrace();
	}
		sc.close();

	}
}
