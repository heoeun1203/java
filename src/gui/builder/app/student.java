package gui.builder.app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;

public class student {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					student window = new student();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public student() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("학생 정보");
		frame.setBounds(100, 100, 634, 585);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton.setBounds(15, 321, 91, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_1.setBounds(15, 354, 91, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_2.setBounds(15, 387, 91, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Search");
		btnNewButton_3.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_3.setBounds(365, 27, 91, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Load Data");
		btnNewButton_4.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_4.setBounds(468, 27, 140, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"id", "username", "password", "age", "dept", "grade"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(12, 27, 150, 23);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setToolTipText("");
		comboBox_1.setBounds(12, 60, 254, 23);
		frame.getContentPane().add(comboBox_1);
		
		JLabel B_id = new JLabel("id");
		B_id.setFont(new Font("굴림", Font.PLAIN, 15));
		B_id.setBounds(15, 107, 50, 15);
		frame.getContentPane().add(B_id);
		
		JLabel B_username = new JLabel("username");
		B_username.setFont(new Font("굴림", Font.PLAIN, 15));
		B_username.setBounds(15, 142, 76, 15);
		frame.getContentPane().add(B_username);
		
		JLabel B_password = new JLabel("password");
		B_password.setFont(new Font("굴림", Font.PLAIN, 15));
		B_password.setBounds(15, 177, 76, 15);
		frame.getContentPane().add(B_password);
		
		JLabel B_age = new JLabel("age");
		B_age.setFont(new Font("굴림", Font.PLAIN, 15));
		B_age.setBounds(15, 212, 50, 15);
		frame.getContentPane().add(B_age);
		
		JLabel B_dept = new JLabel("dept");
		B_dept.setFont(new Font("굴림", Font.PLAIN, 15));
		B_dept.setBounds(15, 247, 50, 15);
		frame.getContentPane().add(B_dept);
		
		JLabel B_grade = new JLabel("grade");
		B_grade.setFont(new Font("굴림", Font.PLAIN, 15));
		B_grade.setBounds(15, 282, 50, 15);
		frame.getContentPane().add(B_grade);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(278, 60, 330, 478);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBounds(118, 325, 140, 214);
		frame.getContentPane().add(table);
		
		textField = new JTextField();
		textField.setBounds(118, 104, 140, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(118, 139, 140, 21);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(118, 174, 140, 21);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(118, 209, 140, 21);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(118, 244, 140, 21);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(118, 279, 140, 21);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(174, 28, 179, 21);
		frame.getContentPane().add(textField_6);
	}
}
