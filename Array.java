package com.kodnest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField postion;
	private JTextField delepostion;
	private JTextField displaytext;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		length = new JTextField();
		length.setBounds(201, 62, 96, 19);
		contentPane.add(length);
		length.setColumns(10);
		
		JLabel lblEnterAnSize = new JLabel("Enter Size Of Array");
		lblEnterAnSize.setFont(new Font("Constantia", Font.BOLD, 14));
		lblEnterAnSize.setForeground(new Color(255, 0, 0));
		lblEnterAnSize.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEnterAnSize.setBounds(42, 65, 130, 18);
		contentPane.add(lblEnterAnSize);
		
		JLabel header = new JLabel("ArrayDataSturture");
		header.setFont(new Font("Constantia", Font.BOLD, 14));
		header.setForeground(new Color(0, 0, 255));
		header.setBounds(180, 10, 128, 18);
		contentPane.add(header);
		
		JButton CreateArray = new JButton("CreateArray");
		CreateArray.setBackground(new Color(255, 255, 240));
		CreateArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//create of an array
				int len=Integer.valueOf(length.getText());
				arr=new int[len];
				String message="Array of Size "+len+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		CreateArray.setFont(new Font("Constantia", Font.PLAIN, 12));
		CreateArray.setForeground(new Color(210, 105, 30));
		CreateArray.setBounds(202, 91, 95, 23);
		contentPane.add(CreateArray);
		
		JLabel lblNewLabel = new JLabel("Enter Integer Element");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(0, 134, 159, 18);
		contentPane.add(lblNewLabel);
		
		element = new JTextField();
		element.setBounds(164, 132, 64, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("POS");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(241, 136, 24, 15);
		contentPane.add(lblNewLabel_1);
		
		postion = new JTextField();
		postion.setBounds(275, 132, 45, 19);
		contentPane.add(postion);
		postion.setColumns(10);
		
		JButton ArrayInsert = new JButton("INSERT");
		ArrayInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			//Insertion of any array
			int ele=Integer.valueOf(element.getText());
			int pos=Integer.valueOf(postion.getText());
			arr[pos]=ele;
			String message="Inserted element "+ele+" @ Position"+pos;
			JOptionPane.showMessageDialog(contentPane, message);
			element.setText("");
			postion.setText("");
		}
			
		});
	
		ArrayInsert.setFont(new Font("Constantia", Font.BOLD, 12));
		ArrayInsert.setBounds(341, 133, 85, 21);
		contentPane.add(ArrayInsert);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER DELETE POSITION:");
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2.setBounds(0, 175, 245, 18);
		contentPane.add(lblNewLabel_2);
		
		delepostion = new JTextField();
		delepostion.setBounds(182, 173, 83, 19);
		contentPane.add(delepostion);
		delepostion.setColumns(10);
		
		JButton ArrayDelete = new JButton("DELETE");
		ArrayDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Deletion array
				int pos=Integer.valueOf(delepostion.getText());
				String msg="Deleted element:"+arr[pos];
				arr[pos]=0;
				JOptionPane.showMessageDialog(contentPane, msg);
				delepostion.setText("");
				
			}
		});
		ArrayDelete.setFont(new Font("Constantia", Font.BOLD, 12));
		ArrayDelete.setBounds(299, 174, 85, 21);
		contentPane.add(ArrayDelete);
		
		JButton ArrayDisplay = new JButton("DISPLAY");
		ArrayDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				for(int i=0;i<arr.length;i++) {
					msg=msg+" "+arr[i];					
				}
				
				displaytext.setText(msg);
			
				
				
			}
		});
		ArrayDisplay.setFont(new Font("Constantia", Font.BOLD, 12));
		ArrayDisplay.setBounds(201, 203, 85, 21);
		contentPane.add(ArrayDisplay);
		
		displaytext = new JTextField();
		displaytext.setBackground(new Color(105, 105, 105));
		displaytext.setBounds(110, 234, 176, 19);
		contentPane.add(displaytext);
		displaytext.setColumns(10);
	}
}
