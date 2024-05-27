package Question.seven_week;


import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc {

   private JFrame frame;
   private JTextField tfNum;
   
   private double num1 = 0;
   private double num2 = 0;
   private String op = null;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Calc window = new Calc();
               window.frame.setLocationRelativeTo(null);
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
   public Calc() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setTitle("계산기_ver 1.0");
      frame.setBounds(100, 100, 590, 430);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      tfNum = new JTextField();
      tfNum.setFont(new Font("굴림", Font.PLAIN, 20));
      tfNum.setHorizontalAlignment(SwingConstants.RIGHT);
      tfNum.setBounds(12, 10, 552, 56);
      frame.getContentPane().add(tfNum);
      tfNum.setColumns(10);
      
      JLabel lblName = new JLabel("허은의 계산기");
      lblName.setFont(new Font("굴림", Font.BOLD, 20));
      lblName.setHorizontalAlignment(SwingConstants.CENTER);
      lblName.setBounds(22, 346, 542, 37);
      frame.getContentPane().add(lblName);
      
      JButton btnDel = new JButton("DEL");
      btnDel.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		String str = tfNum.getText();
      		tfNum.setText(str.substring(0, str.length()-1));
      	}
      });
      btnDel.setFont(new Font("굴림", Font.PLAIN, 18));
      btnDel.setBackground(Color.DARK_GRAY);
      btnDel.setForeground(Color.WHITE);
      btnDel.setBounds(22, 76, 80, 123);
      frame.getContentPane().add(btnDel);
      
      JButton btnC = new JButton("C");
      btnC.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		tfNum.setText("");
      	}
      });
      btnC.setFont(new Font("굴림", Font.PLAIN, 18));
      btnC.setBackground(Color.DARK_GRAY);
      btnC.setForeground(Color.WHITE);
      btnC.setBounds(22, 213, 80, 123);
      frame.getContentPane().add(btnC);
      
      JButton btnDash = new JButton("-");
      btnDash.setFont(new Font("굴림", Font.PLAIN, 18));
      btnDash.setBackground(Color.GRAY);
      btnDash.setForeground(Color.WHITE);
      btnDash.setBounds(114, 76, 80, 80);
      frame.getContentPane().add(btnDash);
      
      JButton btnStar = new JButton("*");
      btnStar.setFont(new Font("굴림", Font.PLAIN, 18));
      btnStar.setBackground(Color.GRAY);
      btnStar.setForeground(Color.WHITE);
      btnStar.setBounds(114, 166, 80, 80);
      frame.getContentPane().add(btnStar);
      
      JButton btnSlash = new JButton("/");
      btnSlash.setFont(new Font("굴림", Font.PLAIN, 18));
      btnSlash.setBackground(Color.GRAY);
      btnSlash.setForeground(Color.WHITE);
      btnSlash.setBounds(114, 256, 80, 80);
      frame.getContentPane().add(btnSlash);

      JButton btnDot = new JButton(".");
      btnDot.setFont(new Font("굴림", Font.PLAIN, 18));
      btnDot.setBackground(Color.ORANGE);
      btnDot.setBounds(392, 280, 80, 56);
      frame.getContentPane().add(btnDot);
      
      JButton btnResult= new JButton("=");
      btnResult.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		num2 = Double.parseDouble(tfNum.getText());
      		double result = 0;
      		
      		if(op.equals("+")) {
      			result = num1 + num2;
      		} else if (op.equals("-")){
      			result = num1 - num2;
      		} else if (op.equals("*")){
      			result = num1 * num2;
      		} else if (op.equals("/")){
      			result = num1 / num2;
      		} else {
      			JOptionPane.showMessageDialog(frame, "잘못된 연산입니다.");
      		}
      		
      		tfNum.setText(result + "");
      		op = null;
      	}
      });
      btnResult.setFont(new Font("굴림", Font.PLAIN, 18));
      btnResult.setBackground(Color.YELLOW);
      btnResult.setBounds(484, 213, 80, 123);
      frame.getContentPane().add(btnResult);
      
      JButton btnPlus = new JButton("+");
      btnPlus.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		num1 = Double.parseDouble(tfNum.getText());
      		tfNum.setText("");
      		op = "+";
      	}
      });
      btnPlus.setFont(new Font("굴림", Font.PLAIN, 18));
      btnPlus.setBackground(Color.GRAY);
      btnPlus.setForeground(Color.WHITE);
      btnPlus.setBounds(484, 76, 80, 123);
      frame.getContentPane().add(btnPlus);
      
      JButton btn0 = new JButton("0");
      btn0.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		tfNum.setText(tfNum.getText()+"0");
      	}
      });
      btn0.setFont(new Font("굴림", Font.PLAIN, 18));
      btn0.setBackground(Color.BLACK);
      btn0.setForeground(Color.WHITE);
      btn0.setBounds(206, 280, 174, 56);
      frame.getContentPane().add(btn0);
      
      JButton btn1 = new JButton("1");
      btn1.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		tfNum.setText(tfNum.getText()+"1");
      	}
      });
      btn1.setFont(new Font("굴림", Font.PLAIN, 18));
      btn1.setBackground(Color.BLACK);
      btn1.setForeground(Color.WHITE);
      btn1.setBounds(206, 214, 80, 56);
      frame.getContentPane().add(btn1);
      
      JButton btn2 = new JButton("2");
      btn2.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		tfNum.setText(tfNum.getText()+"2");
      	}
      });
      btn2.setFont(new Font("굴림", Font.PLAIN, 18));
      btn2.setBackground(Color.BLACK);
      btn2.setForeground(Color.WHITE);
      btn2.setBounds(298, 214, 80, 56);
      frame.getContentPane().add(btn2);
      
      JButton btn3 = new JButton("3");
      btn3.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		tfNum.setText(tfNum.getText()+"3");
      	}
      });
      btn3.setFont(new Font("굴림", Font.PLAIN, 18));
      btn3.setBackground(Color.BLACK);
      btn3.setForeground(Color.WHITE);
      btn3.setBounds(392, 214, 80, 56);
      frame.getContentPane().add(btn3);
      
      JButton btn4 = new JButton("4");
      btn4.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		tfNum.setText(tfNum.getText()+"4");
      	}
      });
      btn4.setFont(new Font("굴림", Font.PLAIN, 18));
      btn4.setBackground(Color.BLACK);
      btn4.setForeground(Color.WHITE);
      btn4.setBounds(206, 143, 80, 56);
      frame.getContentPane().add(btn4);
      
      JButton btn5 = new JButton("5");
      btn5.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		tfNum.setText(tfNum.getText()+"5");
      	}
      });
      btn5.setFont(new Font("굴림", Font.PLAIN, 18));
      btn5.setBackground(Color.BLACK);
      btn5.setForeground(Color.WHITE);
      btn5.setBounds(300, 143, 80, 56);
      frame.getContentPane().add(btn5);
      
      JButton btn6 = new JButton("6");
      btn6.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		tfNum.setText(tfNum.getText()+"6");
      	}
      });
      btn6.setFont(new Font("굴림", Font.PLAIN, 18));
      btn6.setBackground(Color.BLACK);
      btn6.setForeground(Color.WHITE);
      btn6.setBounds(392, 143, 80, 56);
      frame.getContentPane().add(btn6);
      
      JButton btn7 = new JButton("7");
      btn7.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		tfNum.setText(tfNum.getText()+"7");
      	}
      });
      btn7.setFont(new Font("굴림", Font.PLAIN, 18));
      btn7.setBackground(Color.BLACK);
      btn7.setForeground(Color.WHITE);
      btn7.setBounds(206, 76, 80, 56);
      frame.getContentPane().add(btn7);
      
      JButton btn8 = new JButton("8");
      btn8.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		tfNum.setText(tfNum.getText()+"8");
      	}
      });
      btn8.setFont(new Font("굴림", Font.PLAIN, 18));
      btn8.setBackground(Color.BLACK);
      btn8.setForeground(Color.WHITE);
      btn8.setBounds(300, 76, 80, 56);
      frame.getContentPane().add(btn8);
      
      JButton btn9 = new JButton("9");
      btn9.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		tfNum.setText(tfNum.getText()+"9");
      	}
      });
      btn9.setFont(new Font("굴림", Font.PLAIN, 18));
      btn9.setBackground(Color.BLACK);
      btn9.setForeground(Color.WHITE);
      btn9.setBounds(392, 76, 80, 56);
      frame.getContentPane().add(btn9);
      

   }
}