package com.kodnest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CircularQueue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField displaytext;
	private int f=0;
	private int r=-1;
	private int size;
	private int cq[];
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULARQUEUE");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel.setBounds(160, 10, 126, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(21, 57, 138, 18);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(160, 55, 96, 19);
		contentPane.add(length);
		length.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER CIRCULAR Q ELEMENT");
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2.setBounds(21, 95, 212, 18);
		contentPane.add(lblNewLabel_2);
		
		JButton cqinsert = new JButton("INSERT");
		cqinsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Insertion in cicrularQueue
				if(count==size) {
					JOptionPane.showMessageDialog(contentPane, "Circular Queue is Full Insertion Not Possible");
				}
				else {
					int ele=Integer.valueOf(element.getText());
					r=(r+1)%size;
					cq[r]=ele;
					++count;
					JOptionPane.showMessageDialog(contentPane, "Insertion "+ele+" Inserted " );
					element.setText("");
					
					
					
				}
			}
		});
		cqinsert.setForeground(new Color(0, 128, 128));
		cqinsert.setFont(new Font("Constantia", Font.BOLD, 14));
		cqinsert.setBackground(Color.LIGHT_GRAY);
		cqinsert.setBounds(41, 123, 85, 27);
		contentPane.add(cqinsert);
		
		element = new JTextField();
		element.setBounds(232, 93, 96, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton cqdelete = new JButton("DELETE");
		cqdelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DeletionCircularQueue
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, "Circular Queue is Empty Delection Not Possible");
				}else {
					JOptionPane.showMessageDialog(contentPane, "Deleted Element is "+cq[f]);
					f=(f+1)%size;
					--count;
				}
			}
		});
		cqdelete.setForeground(new Color(139, 0, 0));
		cqdelete.setFont(new Font("Constantia", Font.BOLD, 14));
		cqdelete.setBounds(150, 123, 87, 27);
		contentPane.add(cqdelete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Display circular queue
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, "Circular Queue is Empty Display Not Possible");
				}else {
					String msg="";
					for(int i=0;i<count;i++) {
						msg=msg+" "+cq[i];
					}
					displaytext.setText(msg);
					f=(f+1)%size;
				}
			}
		});
		display.setForeground(new Color(128, 0, 128));
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(271, 123, 93, 27);
		contentPane.add(display);
		
		displaytext = new JTextField();
		displaytext.setBounds(61, 189, 303, 19);
		contentPane.add(displaytext);
		displaytext.setColumns(10);
		
		JButton createcqueue = new JButton("CREATE C QUEUE");
		createcqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//create circular queue
				int len=Integer.valueOf(length.getText());
				cq=new int[len];
				size=cq.length;
				JOptionPane.showMessageDialog(contentPane, "Circular Queue size "+len+" Created");
			}
		});
		createcqueue.setFont(new Font("Constantia", Font.BOLD, 14));
		createcqueue.setBounds(266, 53, 157, 27);
		contentPane.add(createcqueue);
	}
}
