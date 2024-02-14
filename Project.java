package com.kodnest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Project extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project frame = new Project();
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
	public Project() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 448);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 215, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Header = new JLabel("Data Structures");
		Header.setForeground(new Color(255, 69, 0));
		Header.setBounds(179, 49, 71, 13);
		contentPane.add(Header);
		
		JButton Array = new JButton("Array");
		Array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ArrayAction
				new  Array().setVisible(true);
			}
		});
		Array.setBackground(new Color(192, 192, 192));
		Array.setForeground(new Color(0, 0, 255));
		Array.setBounds(165, 88, 85, 21);
		contentPane.add(Array);
		
		JButton Stack = new JButton("Stack");
		Stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//StackAction
				new Stack().setVisible(true);
			}
		});
		Stack.setForeground(new Color(139, 69, 19));
		Stack.setBounds(61, 154, 85, 21);
		contentPane.add(Stack);
		
		JButton Queue = new JButton("Queue");
		Queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//QueueAction
				new Queue().setVisible(true);
			}
		});
		Queue.setForeground(new Color(0, 128, 0));
		Queue.setBounds(253, 154, 85, 21);
		contentPane.add(Queue);
		
		JButton Ll = new JButton("LinkedList");
		Ll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LinkedListAction
				new LinkedList().setVisible(true);
			}
		});
		Ll.setForeground(new Color(148, 0, 211));
		Ll.setBounds(61, 232, 77, 21);
		contentPane.add(Ll);
		
		JButton dll = new JButton("DoublyLinkedList");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DoubleLinkedListAction
				new DoublyLinkedList().setVisible(true);			}
		});
		dll.setForeground(new Color(220, 20, 60));
		dll.setBounds(253, 232, 107, 21);
		contentPane.add(dll);
		
		JButton clq = new JButton("CircularQueue");
		clq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CircularQueue Action
				new CircularQueue().setVisible(true);
			}
		});
		clq.setForeground(new Color(220, 20, 60));
		clq.setBounds(154, 296, 107, 21);
		contentPane.add(clq);
	}
}
