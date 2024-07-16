package Bank.Management;

import java.awt.Color;
import java.awt.Font;

import java.awt.event.*;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener{
	
	
	long random;
	JTextField nameTextField,fnameTextField,emailTextField,addTextField,cityTextField,stateTextField,pinTextField;
	JButton next;
	JRadioButton male,female,married,unmarried,others;
	JDateChooser datechooser;
	
Signup(){
		
	setLayout(null);
	
	  Random ran=new Random();
	 random=Math.abs((ran.nextLong() % 9000L) +1000L);

		
	JLabel formno=new JLabel("APPLICATION FORM NO. "+ random );
	formno.setFont(new Font("Raleway",Font.BOLD,38));
	formno.setBounds(140, 20, 600, 40);
	add(formno);
	
	
	
	JLabel personDetails=new JLabel("Page 1: Person Details" );
	personDetails.setFont(new Font("Raleway",Font.BOLD,22));
	personDetails.setBounds(290, 80, 400, 30);
	add(personDetails);
	
	JLabel name=new JLabel("Name:" );
	name.setFont(new Font("Raleway",Font.BOLD,20));
	name.setBounds(100, 140, 100, 30);
	add(name);
	
	 nameTextField = new JTextField();
	nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
	nameTextField.setBounds(300, 140, 400, 30);
	add(nameTextField);
	
	JLabel fname=new JLabel("Father's Name:" );
	fname.setFont(new Font("Raleway",Font.BOLD,20));
	fname.setBounds(100, 190, 200, 30);
	add(fname);
	
	 fnameTextField = new JTextField();
	fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
	fnameTextField.setBounds(300, 190, 400, 30);
	add(fnameTextField);
	
	JLabel dob=new JLabel("Date of Birth:" );
	dob.setFont(new Font("Raleway",Font.BOLD,20));
	dob.setBounds(100, 240, 200, 30);
	add(dob);
	
	
	 datechooser = new JDateChooser();
	datechooser.setBounds(300, 240, 400, 30);
	datechooser.setForeground(new Color(105,105,105));
	add(datechooser);
	
	JLabel gender=new JLabel("Gender:" );
	gender.setFont(new Font("Raleway",Font.BOLD,20));
	gender.setBounds(100, 290, 200, 30);
	add(gender);
	
	 male = new JRadioButton("Male");
	male.setBounds(300, 290, 60, 30);
	male.setBackground(Color.white);
	add(male);
	
	 female = new JRadioButton("Female");
	female.setBounds(450, 290, 120, 30);
	female.setBackground(Color.white);
	add(female);
		
	ButtonGroup gendergroup =new ButtonGroup();
	gendergroup.add(male);
	gendergroup.add(female);
	
	
	JLabel email=new JLabel("Email Address:" );
	email.setFont(new Font("Raleway",Font.BOLD,20));
	email.setBounds(100, 340, 200, 30);
	add(email);
	
	 emailTextField = new JTextField();
	emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
	emailTextField.setBounds(300, 340, 400, 30);
	add(emailTextField);
	
	JLabel marital=new JLabel("Marital Status:" );
	marital.setFont(new Font("Raleway",Font.BOLD,20));
	marital.setBounds(100, 390, 200, 30);
	add(marital);
	
	 married = new JRadioButton("Married");
	married.setBounds(300, 390, 100, 30);
	married.setBackground(Color.white);
	add(married);
	
	 unmarried = new JRadioButton("Unmarried");
	unmarried.setBounds(450, 390, 120, 30);
	unmarried.setBackground(Color.white);
	add(unmarried);
	
	 others = new JRadioButton("Others");
	others.setBounds(600, 390, 120, 30);
	others.setBackground(Color.white);
	add(others);
	
	ButtonGroup maritalgroup =new ButtonGroup();
	maritalgroup.add(married);
	maritalgroup.add(unmarried);
	maritalgroup.add(others);
	
	
	JLabel address=new JLabel("Address:" );
	address.setFont(new Font("Raleway",Font.BOLD,20));
	address.setBounds(100, 440, 200, 30);
	add(address);
	
	 addTextField = new JTextField();
	addTextField.setFont(new Font("Raleway",Font.BOLD,14));
	addTextField.setBounds(300, 440, 400, 30);
	add(addTextField);
	
	JLabel city=new JLabel("City:" );
	city.setFont(new Font("Raleway",Font.BOLD,20));
	city.setBounds(100, 490, 200, 30);
	add(city);
	
	cityTextField = new JTextField();
	 cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
	 cityTextField.setBounds(300, 490, 400, 30);
	add( cityTextField);
	
	JLabel state=new JLabel("State:" );
	state.setFont(new Font("Raleway",Font.BOLD,20));
	state.setBounds(100, 540, 200, 30);
	add(state);
	
	 stateTextField = new JTextField();
	stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
	stateTextField.setBounds(300, 540, 400, 30);
	add(stateTextField);
	
	JLabel pincode=new JLabel("Pincode:" );
	pincode.setFont(new Font("Raleway",Font.BOLD,20));
	pincode.setBounds(100, 590, 200, 30);
	add(pincode);
	
    pinTextField = new JTextField();
	pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
	pinTextField.setBounds(300, 590, 400, 30);
	add(pinTextField);
	
	
	 next = new JButton("Next");
	next.setBackground(Color.black);
	next.setForeground(Color.white);
	next.setFont(new Font("Raleway",Font.BOLD,14));
	next.setBounds(620, 660, 80, 30);
	next.addActionListener(this);
	add(next);
	
		
	setSize(850, 800);
	setLocation(250, 10);
	setVisible(true);
	
	getContentPane().setBackground(Color.WHITE);
}

@Override
public void actionPerformed(ActionEvent e) {
	
	String formno = "" + random;
	String name = nameTextField.getText();
	String fname = fnameTextField.getText();
	String dob = ((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
	String gender = null;
	if(male.isSelected()) {
		gender = "Male";
		
	}else if(female.isSelected()) {
		gender = "Female";
	}
	String email = emailTextField.getText();
	
	String marital= null;
	if(married.isSelected()) {
		marital = "Married";
	}else if(unmarried.isSelected()) {
		marital= "Unmarried";
	}else if(others.isSelected()) {
		marital = "Others";
	}
	
	String add = addTextField.getText();
	String city = cityTextField.getText();
	String state = stateTextField.getText();
	String pin = pinTextField.getText();
	
	try {
		if(name.equals("")) {
			JOptionPane.showMessageDialog(null, "Name is Required");
			
		}else {
			Conn c =new Conn();
			
			String query = "insert into signup values ('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+add+"','"+city+"','"+state+"','"+pin+"')";
			
			c.s.executeUpdate(query);
			setVisible(false);
			
			new Signup2(formno).setVisible(true);
			
			
		}
		
	}catch(Exception ae) {
		System.out.println(ae);
	}
	
}
	public static void main(String[] args) {
	new Signup();

	}
	

}
