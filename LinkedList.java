package com.kodnest.linkedList;

import java.util.Scanner;

public class LinkedList {
	class node{
		int data;
		node link;
		
	}
	private node first;
	private Scanner sc=new Scanner(System.in);
	public void insertrear()
	{ 
		System.out.println("enter the element");
		int ele=sc.nextInt();
		node newnode = new node();
		newnode.data=ele;
		newnode.link=null;
		if(first==null) {
			first=newnode;
		}
		else {
			node temp=first;
			while(temp.link!=null) {
				temp.link=newnode;
			}
		}
	}
		public void deleterear() {
			if(first==null) {
				System.out.println("Delection not possbile");
			}
			else if(first.link==null) {
				System.out.println("element deleted is"+first.data);
			first=null;
			}
			else {
				node temp=first;
				while(temp.link.link!=null) {
					temp=temp.link;
				}
				
				System.out.println("element deleted is"+temp.link.data);
				temp.link=null;
			}
			
			
		
	}
		public void insertfront() {
			System.out.println("Enter the element");
			int ele=sc.nextInt();
			node newnode=new node();
			newnode.data=ele;
			newnode.link=null;
			
			if(first==null) {
				first=newnode;
			}
			else {
				newnode.link=first;
				first=newnode;
			}
		}
		public void deletefront() {
			if(first==null) {
				System.out.println("Delection not possible");
			}
			else if(first.link==null) {
				System.out.println("Deletion element is"+first.data);
				first=null;
			}
			else {
				System.out.println("delete is"+first.data);
				first=first.link;
				first=null;
		
					
				}
			}
		public void display() {
			if(first==null) {
				System.out.println("No elements to display");
			}
			else if(first.link==null) {
				System.out.println(first.data+" ");
			}else {
				node temp;
				temp=first;
				while(temp!=null) {
					System.out.print(temp.data+" ");
					temp=temp.link;
				}
				System.out.println();
				
			}
		}
		

}
