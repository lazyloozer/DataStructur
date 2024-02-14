package com.kodnest.queue;

import java.util.Scanner;

public class Queue {
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;
	public Queue(int n) {
		q=new int[n];
		size=q.length;
	}
	public void insert() {
		if(r==size-1) {
			System.out.println("Insertion not possible");
		}
		else {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the element");
			int elem=sc.nextInt();
			
			++r;
			q[r]=elem;
		}
	}
	public void delete() {
		if(r==-1||f>r) {
			System.out.println("Deletion element not possible");
		}
		else {
			System.out.println("Deleted elememt is "+q[f]);
			++f;
		}
	}
	public void display() {
		if(r==-1||f>r) {
			System.out.println("Display is not possible");
		}
		else {
			for(int i=f;i<=r;i++) {
				System.out.println("Queue "+q[i]+" ");
			}
		}
	}
	

}
