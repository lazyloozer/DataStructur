package com.kodnest.doublelinkedlist;

import java.util.Scanner;

public class Doublelinkedlist {
	class node{
		int data;
		node prevlink;
		node nextlink;
	}
	private node first;
	private Scanner sc=new Scanner(System.in);
	 public void insertfront() {
		 System.out.println("Enter an element");
		 int ele=sc.nextInt();
		 node newnode = new node();
		 newnode.data=ele;
		 newnode.nextlink=null;
		 newnode.prevlink=null;
		 if(first==null) {
			 first=newnode;
		 }
		 else {
			 newnode.nextlink=first;
			 first.prevlink=newnode;
			 first=newnode;
		 }
	 }
	 public void insertrear() {
		 System.out.println("Enter any element");
		 int ele=sc.nextInt();
		 node newnode = new node();
		 newnode.data=ele;
		 newnode.nextlink=null;
		 newnode.prevlink=null;
		 if(first==null) {
			 first=newnode;
		 }else {
			 node temp=first;
			 while(temp.nextlink!=null) {
				 temp=temp.nextlink;
			 }
			 temp.nextlink=newnode;
			 newnode.prevlink=temp;
			 
		 }
	 }
	 public void deletefront() {
		 if(first==null) {
			 System.out.println("Deletion not possible");
		 }
		 else if(first.nextlink!=null) {
			 System.out.println("Delete element is"+first.data);
			 first=null;
		 }
		 else {
			 first.nextlink=first;
			 first.prevlink=null;
		 }
	 }
	 public void deleterear() {
		 if(first==null) {
			 System.out.println("Deletion not possible");
		 }
		 else if(first.nextlink!=null) {
			 System.out.println("Deleted element is"+first.data);
		 }
		 else {
			 node temp=first;
			 while(temp.nextlink.nextlink!=null) {
				 temp=temp.nextlink.nextlink;
			 }
			 System.out.println("Element deleted is"+temp.nextlink.data);
			 temp.nextlink=null;
			 
		 }
	 }
	 public void displayfoward() {
		 if(first==null) {
			 System.out.println("Display id not possible");
		 }
		 else if(first.nextlink==null) {
			 System.out.println(first.data+" ");
			 
		 }
		 else {
			 node temp;
			 temp=first;
			 while(temp!=null) {
				 System.out.print(temp.data+" ");
				 temp=temp.nextlink;
			 }
			 System.out.println();
			 
		 }
	 }
	 public void displayrevesre() {
		 if(first==null) {
			 System.out.println("Display not possible");
		 }
		 else if(first.nextlink==null) {
			 System.out.println(first.data+"");
		 }
		 else {
			 node temp;
			 temp=first;
			 while(temp.nextlink!=null) {
				 temp=temp.nextlink;
			 }
			 while(temp!=null) {
				 System.out.print(temp.data+" ");
				 temp=temp.prevlink;
			 }
			 System.out.println();
			 
		 }
	 }
	 
}


