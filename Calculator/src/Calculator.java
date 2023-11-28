import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField TextField;
	private JButton Button6;
	private JButton Button1;
	private JButton Button2;
	private JButton Button3;
	private JButton Button5;
	private JButton Button7;
	private JButton Button4;
	private JButton Button8;
	private JButton Button10;
	private JButton Button9;
	private JButton Button11;
	private JButton Button13;
	private JButton Button12;
	private JButton Button14;
	private JButton Button15;
	private JButton Button16;
    private double answer,number;
    int operation;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void addTextField(String str) {
		TextField.setText(TextField.getText() + str);
	}
	public void calculate() {
		switch(operation) {
		case 1:
			answer = number + Double.parseDouble(TextField.getText());
			TextField.setText(Double.toString(answer));
		break;
		case 2:
			answer = number - Double.parseDouble(TextField.getText());
			TextField.setText(Double.toString(answer));
		break;
		case 3:
			answer = number * Double.parseDouble(TextField.getText());
			TextField.setText(Double.toString(answer));
		break;
		case 4:
			answer = number / Double.parseDouble(TextField.getText());
			TextField.setText(Double.toString(answer));
		break;
		
		}
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Panel = new JPanel();
		Panel.setBounds(10, 11, 364, 60);
		contentPane.add(Panel);
		Panel.setLayout(null);
		
		TextField = new JTextField();
		TextField.setEditable(false);
		TextField.setHorizontalAlignment(SwingConstants.RIGHT);
		TextField.setFont(new Font("Tahoma", Font.BOLD, 25));
		TextField.setBounds(0, 10, 364, 40);
		Panel.add(TextField);
		TextField.setColumns(10);
		
		JLabel lbl = new JLabel("");
		lbl.setFont(new Font("Tahoma", Font.BOLD, 10));
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setBounds(0, 0, 364, 13);
		Panel.add(lbl);
		
		JPanel Control = new JPanel();
		Control.setBounds(10, 81, 364, 372);
		contentPane.add(Control);
		Control.setLayout(new GridLayout(0, 4, 20, 20));
		
		Button1 = new JButton("7");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTextField(e.getActionCommand());
			}
		});
		Button1.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(Button1);
		
		Button2 = new JButton("8");
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTextField(e.getActionCommand());
			}
		});
		Button2.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(Button2);
		
		Button3 = new JButton("9");
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTextField(e.getActionCommand());
			}
		});
		Button3.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(Button3);
		
		Button4 = new JButton("+");
		Button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(TextField.getText());
			operation = 1;
			TextField.setText("");
			lbl.setText(number + e.getActionCommand());
		
			}
		});
		Button4.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(Button4);
		
		Button5 = new JButton("4");
		Button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTextField(e.getActionCommand());
			}
		});
		Button5.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(Button5);
		
		Button6 = new JButton("5");
		Button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTextField(e.getActionCommand());
			}
		});
		Button6.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(Button6);
		
		Button7 = new JButton("6");
		Button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTextField(e.getActionCommand());
			}
		});
		Button7.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(Button7);
		
		Button8 = new JButton("-");
		Button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(TextField.getText());
				operation = 2;
				TextField.setText("");
				lbl.setText(number + e.getActionCommand());
			
			}
		});
		Button8.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(Button8);
		
		Button9 = new JButton("1");
		Button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTextField(e.getActionCommand());
			}
		});
		Button9.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(Button9);
		
		Button10 = new JButton("2");
		Button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTextField(e.getActionCommand());
			}
		});
		Button10.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(Button10);
		
		Button11 = new JButton("3");
		Button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTextField(e.getActionCommand());
			}
		});
		Button11.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(Button11);
		
		Button12 = new JButton("x");
		Button12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(TextField.getText());
				operation = 3;
				TextField.setText("");
				lbl.setText(number + e.getActionCommand());
			
			}
		});
		Button12.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(Button12);
		
		Button13 = new JButton("0");
		Button13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText(TextField.getText() + e.getActionCommand());
			}
		});
		Button13.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(Button13);
		
		Button14 = new JButton("C");
		Button14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText(" ");
			}
		});
		Button14.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(Button14);
		
		Button15 = new JButton("=");
		Button15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		Button15.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(Button15);
		
		Button16 = new JButton("/");
		Button16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(TextField.getText());
				operation = 4;
				TextField.setText("");
				lbl.setText(number + e.getActionCommand());
			
			}
		});
		Button16.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(Button16);
	}
}
