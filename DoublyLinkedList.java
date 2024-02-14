package com.kodnest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import com.kodnest.linkedList.node;

//import com.kodnest.doublelinkedlist.Doublelinkedlist.node;

//import com.kodnest.doublelinkedlist.Doublelinkedlist.node;

//import com.kodnest.doublelinkedlist.Doublelinkedlist.node;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoublyLinkedList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField element;
	private JTextField element2;
	private JTextField display;
	private int data;
	node link;
	private node first;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setForeground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST");
		lblNewLabel.setForeground(new Color(50, 205, 50));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel.setBounds(157, 21, 153, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER ELEMENT");
		lblNewLabel_1.setForeground(new Color(106, 90, 205));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(52, 57, 119, 18);
		contentPane.add(lblNewLabel_1);
		
		element = new JTextField();
		element.setBounds(177, 55, 96, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER ELEMENT");
		lblNewLabel_2.setForeground(new Color(147, 112, 219));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2.setBounds(52, 85, 119, 18);
		contentPane.add(lblNewLabel_2);
		
		element2 = new JTextField();
		element2.setBounds(177, 84, 96, 19);
		contentPane.add(element2);
		element2.setColumns(10);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Insertion front in doubly Linked list
				node newnode=new node();
				int ele=Integer.valueOf(element.getText());
				newnode.data=ele;
				newnode.prevlink=null;
				newnode.nextlink=null;
				if(first==null) {
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Insertion Succesfull");
					element.setText("");
					
				}else {
					newnode.nextlink=first;
					first.prevlink=newnode;
					first=newnode;
					
					
				}
				JOptionPane.showMessageDialog(contentPane, "Inserted element is :"+first.data);
				
			}
		});
		insertfront.setFont(new Font("Constantia", Font.BOLD, 14));
		insertfront.setForeground(new Color(255, 0, 0));
		insertfront.setBounds(283, 49, 139, 27);
		contentPane.add(insertfront);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//InsertionRear In DoublyLinked list
				node newnode = new node();
				int ele=Integer.valueOf(element2.getText());
				newnode.data=ele;
				newnode.prevlink=null;
				newnode.nextlink=null;
				
				if(first==null) {
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "InsertionRear Successfully");
					element2.setText("");
				}else {
					node temp=first;
					while(first.nextlink!=null){
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prevlink=temp;
					
				}
				JOptionPane.showMessageDialog(contentPane, "InsertionRear Element is ");
				
			}
			
		});
		insertrear.setForeground(new Color(255, 0, 0));
		insertrear.setFont(new Font("Constantia", Font.BOLD, 14));
		insertrear.setBounds(281, 82, 127, 27);
		contentPane.add(insertrear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//deletefront
				if(first==null) {
					 //System.out.println("Deletion not possible");
					JOptionPane.showMessageDialog(contentPane, "Delection not Possible");
				 }
				 else if(first.nextlink!=null) {
					 //System.out.println("Delete element is"+first.data);
					 JOptionPane.showMessageDialog(contentPane, "Delected element is"+first.data);
					 first=null;
				 }
				 else {
					 first.nextlink=first;
					 first.prevlink=null;
				 }
			 }
				
			
		});
		deletefront.setForeground(new Color(255, 0, 0));
		deletefront.setFont(new Font("Constantia", Font.BOLD, 14));
		deletefront.setBounds(91, 129, 141, 27);
		contentPane.add(deletefront);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Deleted rear
				if(first==null) {
					 //System.out.println("Deletion not possible");
					JOptionPane.showMessageDialog(contentPane, "Delection not Possible");
				 }
				 else if(first.nextlink!=null) {
					// System.out.println("Deleted element is"+first.data);
					 JOptionPane.showMessageDialog(contentPane, "Delected element is :"+first.data);
				 }
				 else {
					 node temp=first;
					 while(temp.nextlink.nextlink!=null) {
						 temp=temp.nextlink.nextlink;
					 }
					 //System.out.println("Element deleted is"+temp.nextlink.data);
					 JOptionPane.showMessageDialog(contentPane, "Element deleted is"+temp.nextlink.data);
					 temp.nextlink=null;
					 
				 }
			}
		});
		deleterear.setForeground(new Color(255, 0, 0));
		deleterear.setFont(new Font("Constantia", Font.BOLD, 14));
		deleterear.setBounds(266, 129, 129, 27);
		contentPane.add(deleterear);
		
		JButton displayforward = new JButton("DISPLAYFORWARD");
		displayforward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				//displayrevrse
				if(first==null) {
					 //System.out.println("Display not possible");
					JOptionPane.showMessageDialog(contentPane, "Display is not Possible");
				 }
				 else if(first.nextlink==null) {
					 //System.out.println(first.data+"");
					 msg=msg+first.data;
					 
					 display.setText(msg);
				 }
				 else {
					 node temp;
					 temp=first;
					 while(temp.nextlink!=null) {
						 temp=temp.nextlink;
					 }
					 while(temp!=null) {
						 //System.out.print(temp.data+" ");
						 msg=msg+" "+temp.data;
						 display.setText(msg);
						 temp=temp.prevlink;
					 }
					 System.out.println();
					 
				 }
				 }
		});
		displayforward.setForeground(new Color(255, 0, 0));
		displayforward.setFont(new Font("Constantia", Font.BOLD, 14));
		displayforward.setBounds(75, 164, 169, 27);
		contentPane.add(displayforward);
		
		JButton displayrear = new JButton("DISPLAYREAR");
		displayrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				//displayforward
				 if(first==null) {
					// System.out.println("Display id not possible");
					 JOptionPane.showMessageDialog(contentPane, "Display is Not Possible");
					 
				 }
				 else if(first.nextlink==null) {
					 //System.out.println(first.data+" ");
					// JOptionPane.showMessageDialog(contentPane,first.data);
					 
					 msg=msg+first.data;
					 display.setText(msg);
				 }
				 else {
					 node temp;
					 temp=first;
					 while(temp!=null) {
						 //System.out.print(temp.data+" ");
						msg= msg+" "+temp.data;
						 temp=temp.nextlink;
					
					 }
					 display.setText(msg);
					 }
				
				
			 
			}
		});
		displayrear.setForeground(new Color(255, 0, 0));
		displayrear.setFont(new Font("Constantia", Font.BOLD, 14));
		displayrear.setBounds(276, 165, 133, 27);
		contentPane.add(displayrear);
		
		display = new JTextField();
		display.setBounds(91, 221, 285, 19);
		contentPane.add(display);
		display.setColumns(10);
	}
}
