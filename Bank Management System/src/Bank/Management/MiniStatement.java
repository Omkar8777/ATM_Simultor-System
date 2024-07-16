package Bank.Management;

import java.awt.Color;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.mysql.cj.protocol.Resultset;

public class MiniStatement extends JFrame{
	
	MiniStatement(String pinnumber){
		setTitle("Mini-Statement");
		setLayout(null);
		
		JLabel mini = new JLabel();
		add(mini);
		
		JLabel bank = new JLabel("Indian Bank");
		bank.setBounds(150,20,100,20);
		add(bank);
		
		JLabel card = new JLabel();
		card.setBounds(20,80,300,20);
		add(card);
		
		
		JLabel balance = new JLabel();
		balance.setBounds(20,400,300,20);
		add(balance);
		
		try {
			
			Conn conn = new Conn();
			Resultset rs = (Resultset) conn.s.executeQuery("select * from login where pin = '"+pinnumber+"'");
			
			while(((ResultSet) rs).next()) {
				card.setText("Card NUmber :"+((ResultSet) rs).getString("cardnumber").substring(0,4)+"XXXXXXXXX"+((ResultSet) rs).getString("cardnumber").substring(12));
				
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}

		try {
			
			Conn conn = new Conn();
			Resultset rs = (Resultset) conn.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
			int bal = 0;
			while(((ResultSet) rs).next()) {
				mini.setText(mini.getText() +"<html>"+((ResultSet) rs).getString("date") +"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+((ResultSet) rs).getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+((ResultSet) rs).getString("amount")+"<br><br><html>");
		
				if(((ResultSet) rs).getString("type").equals("Deposit")) {
					
					bal += 	Integer.parseInt(((ResultSet) rs).getString("amount"));
					
				}else {
					bal -= 	Integer.parseInt(((ResultSet) rs).getString("amount"));
				}
			
			} balance.setText("Your Current account balance is Rs :" +bal);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
		mini.setBounds(20,140,400,200);
		setSize(400,600);
		setLocation(20,20);
		setVisible(true);
		getContentPane().setBackground(Color.white);
		
		
		
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
	new MiniStatement("");

	}

}
