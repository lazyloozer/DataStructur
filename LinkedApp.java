package com.kodnest.linkedList;

import java.util.Scanner;

//import javax.swing.JOptionPane;

//import com.kodnest.node;

public class LinkedApp {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		LinkedList li=new LinkedList();
		while(true) {
			System.out.println("press 1---->Insertrear");
			System.out.println("press 2---->deleterear");
			System.out.println("press 3----->InsertFront");
			System.out.println("press 4----->DeleteFront");
			System.out.println("press 5------>Display");
			System.out.println("Exit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:li.insertrear();
			break;
			case 2:li.deleterear();
			break;
			case 3:li.insertfront();
			break;
			case 4:li.deletefront();
			break;
			case 5:li.display();
			break;
			default:System.exit(0);
			}
			
			
		}
		
		

	}

}

