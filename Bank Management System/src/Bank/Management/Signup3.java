package Bank.Management;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.util.*;
public class Signup3 extends JFrame implements ActionListener {
	JRadioButton r1,r2,r3,r4;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	JButton submit,cancel;
	String formno;
	
	Signup3(String formno){
		this.formno=formno;
		
		setLayout(null);
		
		JLabel l1= new JLabel("Page 3:Account Details ");
		l1.setFont(new Font("Raleway",Font.BOLD,22));
		l1.setBounds(280, 40, 400, 40);
		add(l1);
		
		JLabel type= new JLabel("Account Type : ");
		type.setFont(new Font("Raleway",Font.BOLD,22));
		type.setBounds(100, 140, 200, 30);
		add(type);
		
		r1 =new JRadioButton("Saving Account");
		r1.setBackground(Color.white);
		r1.setFont(new Font ("Raleway",Font.BOLD,16));
		r1.setBounds(100, 180, 150, 20);
		add(r1);
		 

		r2 =new JRadioButton("Fixed Deposit Account");
		r2.setBackground(Color.white);
		r2.setFont(new Font ("Raleway",Font.BOLD,16));
		r2.setBounds(350, 180, 250, 20);
		add(r2);
		

		r3 =new JRadioButton("Current Account");
		r3.setBackground(Color.white);
		r3.setFont(new Font ("Raleway",Font.BOLD,16));
		r3.setBounds(100, 220, 250, 20);
		add(r3);
		

		r4 =new JRadioButton("Recurring Account");
		r4.setBackground(Color.white);
		r4.setFont(new Font ("Raleway",Font.BOLD,16));
		r4.setBounds(350, 220, 250, 20);
		add(r4);
	
		ButtonGroup account = new ButtonGroup();
		account.add(r1);
		account.add(r2);
		account.add(r3);
		account.add(r4); 	
		
		
		JLabel card= new JLabel("Card Number : ");
		card.setFont(new Font("Raleway",Font.BOLD,22));
		card.setBounds(100, 260, 200, 30);
		add(card);
		
		
		JLabel number= new JLabel("XXXX-XXXX-XXXX-4184 ");
		number.setFont(new Font("Raleway",Font.BOLD,22));
		number.setBounds(330, 260, 300, 30);
		add(number);
		
		JLabel carddetails= new JLabel("Your 16 Digit Card Number ");
		carddetails.setFont(new Font("Raleway",Font.BOLD,12));
		carddetails.setBounds(100, 290, 200, 20);
		add(carddetails);
		
		JLabel pin= new JLabel("Pin : ");
		pin.setFont(new Font("Raleway",Font.BOLD,22));
		pin.setBounds(100, 350, 200, 30);
		add(pin);
		
		JLabel pindetails= new JLabel("Your 4 Digit Pin Number ");
		 pindetails.setFont(new Font("Raleway",Font.BOLD,12));
		 pindetails.setBounds(100, 380, 300, 20);
		add( pindetails);
		
		
		JLabel pnumber= new JLabel("XXXX ");
		pnumber.setFont(new Font("Raleway",Font.BOLD,22));
		pnumber.setBounds(330, 350, 200, 30);
		add(pnumber);
		
		JLabel services= new JLabel("Services Required : ");
		services.setFont(new Font("Raleway",Font.BOLD,18));
		services.setBounds(100, 430, 200, 30);
		add(services);
		
		c1 = new JCheckBox("ATM CARD");
		c1.setBackground(Color.white);
		c1.setFont(new Font("Raleway",Font.BOLD,16));
		c1.setBounds(100, 480, 200, 30);
		add(c1);
		
		c2 = new JCheckBox("Internet Banking");
		c2.setBackground(Color.white);
		c2.setFont(new Font("Raleway",Font.BOLD,16));
		c2.setBounds(350, 480, 200, 30);
		add(c2);
		
		c3 = new JCheckBox("Mobile Banking ");
		c3.setBackground(Color.white);
		c3.setFont(new Font("Raleway",Font.BOLD,16));
		c3.setBounds(100, 530, 200, 30);
		add(c3);
		
		c4 = new JCheckBox("Email & SMS Alerts");
		c4.setBackground(Color.white);
		c4.setFont(new Font("Raleway",Font.BOLD,16));
		c4.setBounds(350, 530, 200, 30);
		add(c4);
		
		c5 = new JCheckBox("Cheque Book");
		c5.setBackground(Color.white);
		c5.setFont(new Font("Raleway",Font.BOLD,16));
		c5.setBounds(100, 580, 200, 30);
		add(c5);

		c6 = new JCheckBox("E-Statement");
		c6.setBackground(Color.white);
		c6.setFont(new Font("Raleway",Font.BOLD,16));
		c6.setBounds(350, 580, 200, 30);
		add(c6);
		
		c7 = new JCheckBox("I hereby Declares that the above Details are Correct to the best of my Knowledge  ");
		c7.setBackground(Color.white);
		c7.setFont(new Font("Raleway",Font.BOLD,12));
		c7.setBounds(100, 630, 600, 30);
		add(c7);
		
		submit = new JButton("Submit");
		submit.setBackground(Color.black);
		submit.setForeground(Color.white);
		submit.setFont(new Font("Raleway",Font.BOLD,14));
		submit.setBounds(250, 680, 100, 30);
		submit.addActionListener(this);
		add(submit);
		
		cancel = new JButton("Cancel");
		cancel.setBackground(Color.black);
		cancel.setForeground(Color.white);
		cancel.setFont(new Font("Raleway",Font.BOLD,14));
		cancel.setBounds(420, 680, 100, 30);
		cancel.addActionListener(this);
		add(cancel);
		
		
		
		setSize(850,850);
		setLocation(250,0);
	   setVisible(true);
	   
		getContentPane().setBackground(Color.WHITE);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==submit) {
			
			String accountType = null;
			if(r1.isSelected()) {
				accountType = "Saving account";
			}else if(r2.isSelected()) {
				accountType  = "Fixed deposit account";
				
			}else if(r3.isSelected()) {
				accountType = "current account";
			}else if (r4.isSelected()) {
				accountType = "recurring account";
			}
			Random random = new Random();
			String cardnumber = "" + Math.abs((random.nextLong() % 90000000L)+ 5040936000000000L);
			String pinnumber = "" + Math.abs((random.nextLong() % 9000L)+ 1000L);
			
			String facility ="";
			if(c1.isSelected()) {
				facility = facility + "ATM CARD";
			}
			else if(c2.isSelected()) {
				facility = facility + "Internet Banking";
			}
			else if (c3.isSelected()) {
				facility = facility + "Mobile Banking";
			}
			else if(c4.isSelected()) {
				facility = facility + "Email & SMS Alerts";
			}
			else if(c5.isSelected()) {
				facility = facility + "Cheque Book";
			}
			else if(c6.isSelected()) {
				facility = facility + "E-Statement";
			}
			
			try {
				if(accountType.equals("")) {
					JOptionPane.showMessageDialog(null, "Account Type is Required");
				}else {
					Conn conn = new Conn();
					String query1 = "insert into Signup3 values ('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
					String query2 = "insert into login values ('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
					
					conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);  
					
					JOptionPane.showMessageDialog(null, "Card Number :"+cardnumber+"\n pin :"+pinnumber);
				}
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}else if(ae.getSource()==cancel) {
			
		}
		
	}

	
	public static void main(String[] args) {
		new Signup3("");

	}



	

}
