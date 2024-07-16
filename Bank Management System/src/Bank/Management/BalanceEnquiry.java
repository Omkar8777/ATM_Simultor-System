package Bank.Management;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.mysql.cj.protocol.Resultset;

public class BalanceEnquiry extends JFrame implements ActionListener{
    JButton back;
    String pinnumber;
	BalanceEnquiry(String pinnumber){
		this.pinnumber = pinnumber;
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
		ImageIcon i3 =new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		back = new JButton("BACK");
		back.setBounds(355,520,150,30);
		back.addActionListener(this);
		image.add(back);
		
		Conn conn = new Conn();
		int balance = 0;
		try {
			
			Resultset rs = (Resultset) conn.s.executeQuery("select *from bank where pin = '"+pinnumber+"'");
			
			
			while(((ResultSet) rs).next()) {
				if(((ResultSet) rs).getString("type").equals("Deposit")) {
	
					balance += 	Integer.parseInt(((ResultSet) rs).getString("amount"));
					
				}else {
					balance -= 	Integer.parseInt(((ResultSet) rs).getString("amount"));
				}
			}
			}catch(Exception e) {
				System.out.println(e);
			}
			
		JLabel text = new JLabel("Your Current Account balance is Rs " +balance);
		text.setBounds(170,300,400,30);
		text.setForeground(Color.white);
		image.add(text);
		
		setSize(900,900);
		setLocation(250,0);
		setVisible(true);
		
		
		
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
	   setVisible(false);
	   new Transactions(pinnumber).setVisible(true);
		
	}

	
	
	public static void main(String[] args) {
		new BalanceEnquiry("");
		
	}



	
}
