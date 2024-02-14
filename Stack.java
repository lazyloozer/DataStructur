package com.kodnest.stack;


import java.util.Scanner;

public class Stack {
	private int s[];
	private int size;
	private int top=-1;
	
	public Stack(int n) {
		s=new int[n];
		size=s.length;
	}
	public void push() {
		int ele;
		if(top==size-1) {
			System.out.println("Stack is Full,Push not Possible");
		}
		else {
			System.out.println("Enter the Element");
			Scanner sc=new Scanner(System.in);
			ele=sc.nextInt();
			++top;
			 
			s[top]=ele;
			System.out.println("Push Is Completed");
			System.out.println("----------------");
			sc.close();
			
			
		}
		
	}
	public void pop() {
		if(top==-1) {
			System.out.println("Stack is Empty,Pop is not Possible");
			
		}
		else {
		System.out.println("Deleted element is"+s[top]);
		s[top]=0;
		--top;
	}
	}
	public void display() {
		if(top==-1) {
			System.out.println("Display not Possible");
		}
		else {
			for (int i = top; i >=0; i--) {
				System.out.println("The Stack ELements are "+s[i]);
				
				
			}
		}
	}

}
