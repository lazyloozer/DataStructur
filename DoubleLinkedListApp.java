package com.kodnest.doublelinkedlist;

import java.util.Scanner;

public class DoubleLinkedListApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Doublelinkedlist dll=new Doublelinkedlist();
		while(true) {
			System.out.println("Press 1----->InsertFront");
			System.out.println("Press 2---->DeleteFront");
			System.out.println("Press 3----->InsertRear");
			System.out.println("Press 4----->DeleteRear");
			System.out.println("Press 5----->DisplayFroward");
			System.out.println("Press 6----->DisplayReverse");
			System.out.println("Exit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:dll.insertfront();
			break;
			case 2:dll.deletefront();
			break;
			case 3:dll.insertrear();
			break;
			case 4:dll.deleterear();
			break;
			case 5:dll.displayfoward();
			break;
			case 6:dll.displayrevesre();
			break;
			default:System.exit(0);
			}
		}

	}

}
