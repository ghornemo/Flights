import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

import javax.swing.text.*;

public class LoginPage extends JFrame
{
	Container c = getContentPane();
	JPanel PFlightTypes = new JPanel(null);
	JPanel PLogin = new JPanel(null);
	JPanel PFlightDetails = new JPanel(null);

	public boolean bCheck=true;

	JLabel LDomesticFlight = new JLabel("<html><B></B></html>");
	JLabel LInternationalFlight = new JLabel("");

	JLabel LUserName, LPassword;

	JLabel LDomesticFlight1 = new JLabel("<html><B> Booking</B></html>");
	JLabel LInternationalFlight1 = new JLabel("");

	JTextField TFUserName;
	JPasswordField TPPassword;

	JButton BLogin, BRegister;

	 final Object[] col1 ={ "From", "To", "Price", "Time" };
	 final Object[] col2 = { "From", "To", "Price", "Time" };
    final Object[] col3 = { "From", "To", "Price", "Time" };

	final Object[][] row1 = { { "Saint John", "Toronto", "3125", "16:30" }, { "Saint John", "Monteral", "3225", "19:00" }, { "Saint John", "Ottawa", "1425 ", "08:30" }, { "Saint John", "Calgary", "1025 ", "09:50" }, { "Saint John", "Halifax", "1525", "11:00" }, { "Saint John", "BC", "3825 ", "05:30" }, { "Saint John", "St. John's", "3025 ", "05:30" }, { "Saint John", "Boston", "1725", "12:00" }, { "Saint John", "Pittsburgh", "3725", "19:00" } };
	final Object[][] row2 = { { "Saint John", "Bali", "21485", "06:20" }, { "Saint John", "Bangkok", "9000", "20:45" }, { "Saint John", "Cairo", "22975", "10:25" }, { "Saint John", "CapeTown", "42500", "16:45" }, { "Saint John", "Chicago", "35000", "06:30" }, { "Saint John", "Dubai", "12000", "08:15" }, { "Saint John", "Frankfurt", "18500", "06:50" }, { "Saint John", "HongKong", "20845", "12:00" }, { "Saint John", "Istanbul", "22000", "10:45" }, { "Saint John", "London", "22600", "14:35" }, { "Saint John", "LosAngeles", "35000", "22:00" }, { "Saint John", "Melbourne", "27800", "21:15" }, { "Saint John", "New York", "32000", "08:50" }, { "Saint John", "Paris", "18500", "18:45" }, { "Saint John", "Rome", "19900", "20:00"}, { "Saint John", "SanFrancisco", "35000", "12:00"}, { "Saint John", "shanghai", "24430", "10:15" }, { "Saint John", "Singapore", "9000", "21:10" }, { "Saint John", "Sydney", "27800", "12:00"}, { "Saint John", "Toronto", "35000", "17:00 " } };
	final Object[][] row3 = { { "Saint John", "Toronto", "9375", "16:30" }, { "Saint John", "Monteral", "9675", "19:00" }, { "Saint John", "Ottawa", "4275", "08:30" }, { "Saint John", "Calgary", "3075", "09:50" }, { "Saint John", "Halifax", "4575", "11:00" }, { "Saint John", "BC", "11475", "05:30" }, { "Saint John", "St. John's", "9075", "05:30" }, { "Saint John", "Boston", "5175", "12:00" }, { "Saint John", "Pittsburgh", "11175", "19:00" } };
	final Object[][] row4 = { { "Saint John", "Bali", "64455", "06:20" }, { "Saint John", "Bangkok", "27000", "20:45" }, { "Saint John", "Cairo", "68925", "10:25" }, { "Saint John", "CapeTown", "37500", "16:45" }, { "Saint John", "Chicago", "105000", "06:30" }, { "Saint John", "Dubai", "36000", "08:15" }, { "Saint John", "Frankfurt", "55500", "06:50" }, { "Saint John", "HongKong", "62535", "12:00" }, { "Saint John", "Istanbul", "66000", "10:45" }, { "Saint John", "London", "67800", "14:35" }, { "Saint John", "LosAngeles", "105000", "22:00" }, { "Saint John", "Melbourne", "83400", "21:15" }, { "Saint John", "New York", "96000", "08:50" }, { "Saint John", "Paris", "55500", "18:45" }, { "Saint John", "Rome", "59700", "20:00" }, { "Saint John", "SanFrancisco", "105000", "12:00" }, { "Saint John", "shanghai", "73290", "10:15" }, { "Saint John", "Singapore", "27000", "21:10"}, { "Saint John", "Sydney", "83400", "12:00"}, { "Saint John", "Toronto", "105000", "17:00" } };

	JTable TDomesticFlight = new JTable(row1, col1);
	JTable TInternationalFlight = new JTable(row2, col2);
	JTable TDomesticFlight1 = new JTable(row3, col3);
	JTable TInternationalFlight1 = new JTable(row4, col2);

	JScrollPane JSP1 = new JScrollPane(TDomesticFlight, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP2 = new JScrollPane(TInternationalFlight, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP3 = new JScrollPane(TDomesticFlight1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP4 = new JScrollPane(TInternationalFlight1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

	Icon img1 = new ImageIcon("img/economic.jpg");
	Icon img2 = new ImageIcon("img/business.jpg");
	Icon img3 = new ImageIcon("img/economic1.jpg");
	Icon img4 = new ImageIcon("img/business1.jpg");
	Icon img5 = new ImageIcon ("img/aircanada1.png");

	JLabel LEconomic = new JLabel("Economic",  img1, SwingConstants.LEFT);
	JLabel LBusiness = new JLabel("Business",  img2,  SwingConstants.LEFT);
	JLabel LEconomic1 = new JLabel("Economic", img3,  SwingConstants.LEFT);
	JLabel LBusiness1 = new JLabel("Business", img4, SwingConstants.LEFT);
	
	JLabel backGroundImage  = new JLabel(img5);
	JLabel logo = new JLabel(new ImageIcon("img/logo.png"));
	

	public LoginPage()
	{
		WindowUtilities.setNativeLookAndFeel();
		setPreferredSize(new Dimension(500,400));

		PFlightTypes.setBackground(Color.blue);
		PLogin.setBackground(Color.red);
		PFlightDetails.setBackground(Color.red);
		
	


		/*JSP1.setBounds(0, 340, 790, 200);
		JSP2.setBounds(0, 340, 790, 200);
		JSP3.setBounds(0, 340, 790, 200);
		JSP4.setBounds(0, 340, 790, 200);*/

		PFlightTypes.setBounds(0,0,0, 0);
		PLogin.setBounds( 300 ,00,300, 200);
		PFlightDetails.setBounds(0,0,0,0);


		LUserName = new JLabel("User Name ");
		LPassword = new JLabel("Password ");
		TFUserName = new JTextField(10);
		TPPassword = new JPasswordField(10);
		BLogin = new JButton("Sign In");
		BRegister = new JButton ( "Create Account " );
		
      logo.setBounds ( 1, 5, 300,40 );
		//backGroundImage.setBounds(1, 200, 400, 21);
		LUserName.setBounds(1, 50, 100, 21);
		LPassword.setBounds(1, 90, 100, 21);
		TFUserName.setBounds(55, 50, 100, 21);
		TPPassword.setBounds(55, 90, 100, 21);
		BLogin.setBounds(55, 120, 100,25);
		BRegister.setBounds (55, 160, 110,25); 

		LDomesticFlight1.setBounds(60, 60, 138, 20);
		LInternationalFlight1.setBounds(60, 100, 153, 20);
      PLogin.add(backGroundImage);
		PLogin.add(LUserName);
		PLogin.add(TFUserName);
		PLogin.add(LPassword);
		PLogin.add(TPPassword);
		PLogin.add(BLogin);
		PLogin.add(BRegister);
		PLogin.add (logo);
		
		
		backGroundImage.setBounds(0,10, 400, 400);
		
		PFlightDetails.add (backGroundImage);
		
		PFlightDetails.add (logo); 
		
		PLogin.setSize(450,450);
		
		
		backGroundImage.setVisible(true);
		//PLogin.add(backGroundImage);
		//setIconImage(img5);

	/*	PFlightDetails.add(JSP1);
		PFlightDetails.add(JSP2);
		PFlightDetails.add(JSP3);
		PFlightDetails.add(JSP4);

		JSP1.setVisible(true);
		JSP2.setVisible(false);
		JSP3.setVisible(false);
		JSP4.setVisible(false);

		LBusiness.setBounds(265, 170, 300, 125);
		LEconomic.setBounds(0, 170, 250, 125);
		LBusiness1.setBounds(280, 200, 135, 60);
		LEconomic1.setBounds(50, 200, 147, 60);

		PFlightTypes.add(LEconomic);
		PFlightTypes.add(LBusiness);
		PFlightTypes.add(LEconomic1);
		PFlightTypes.add(LBusiness1);

		LBusiness.setVisible(false);
		LEconomic1.setVisible(false);
		LBusiness1.setVisible(true);
		LEconomic.setVisible(true);*/


		LDomesticFlight.setBounds(60, 60, 100, 25);
		LInternationalFlight.setBounds(60, 100, 120, 25);

		c.add(PFlightTypes);
		c.add(PLogin);
		c.add(PFlightDetails);

		PFlightTypes.add(LDomesticFlight);
		PFlightTypes.add(LInternationalFlight);

		pack();
		setVisible(true);

		addWindowListener(new ExitListener());

		LDomesticFlight.addMouseListener(new mouse1(this, true));
		LInternationalFlight.addMouseListener(new mouse1(this, false));

		LDomesticFlight1.addMouseListener(new mouse3(this, true));
		LInternationalFlight1.addMouseListener(new mouse3(this, false));

	//	LBusiness1.addMouseListener(new mouse2(this, true));
		//LEconomic1.addMouseListener(new mouse2(this, false));

		BLogin.addActionListener(new button1(this));
		BRegister.addActionListener(new button2());
		//BRegister.addActionListener (new button2(this));
	}

	public static void main(String args[])
	{
		new LoginPage();
	}
}


class
button2 implements ActionListener
{

public button2()
{
}
public void actionPerformed(ActionEvent e)
{

String userName = JOptionPane.showInputDialog("Please enter your desired username.");

File f = new File(userName+".txt");

//Username exists
if(f.isFile()) {
JOptionPane.showMessageDialog(null, "Username already exists.");

return;

}

String password = JOptionPane.showInputDialog("Please enter a password.");

//Passwords don't match
if(!password.equals(JOptionPane.showInputDialog("Confirm your password."))) {

JOptionPane.showMessageDialog(null, "Passwords do not match.");

return;

}

//Create our file :)
try {
PrintWriter writer = new PrintWriter(new FileWriter(f)); 
writer.println(password); 
writer.close();
JOptionPane.showMessageDialog(null, "Account successfully created!");
}catch(Exception ew) {
JOptionPane.showMessageDialog(null, "ur white as fuk");
}


}
}


class button1 implements ActionListener
{
LoginPage type;
char[] cCheck, cPassword={'a','d','m','i','n','\0'};
JFrame f;
String sCheck,sCheck1="admin";

public button1(LoginPage type)
{
this.type = type;
}
public void actionPerformed(ActionEvent e)
{
cCheck=type.TPPassword.getPassword();
sCheck = type.TFUserName.getText();

File f = new File(sCheck+".txt");

//Invalid username
if(!f.isFile()) {

JOptionPane.showMessageDialog(null, "Invalid username.");

} else {

Scanner s = null;

try {

s = new Scanner(f);

}catch(Exception E) {

}

String pass = s.nextLine();

//Successful login
if(pass.equals(sCheck)) {

type.PLogin.add(type.LDomesticFlight1);
type.PLogin.add(type.LInternationalFlight1);

type.PLogin.remove(type.LUserName);
type.PLogin.remove(type.TFUserName);
type.PLogin.remove(type.LPassword);
type.PLogin.remove(type.TPPassword);
type.PLogin.remove(type.BLogin);

type.c.repaint();


//Invalid password
} else {

JOptionPane.showMessageDialog(null, "Invalid password.");

}

}

}

	public boolean check()
	{
		if (cCheck.length >= 6 || cCheck.length < 4)
			return false;
		for(int i=0;i<=4;i++)
		{
			if(cCheck[i]!=cPassword[i])
				return false;
		}
		return true;
	}
}

class mouse1 extends MouseAdapter
{
	LoginPage type;
	boolean bCheck;

	public mouse1(LoginPage type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	public void mouseEntered(MouseEvent e)
	{
		type.LDomesticFlight.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		type.LInternationalFlight.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	public void mouseClicked(MouseEvent e)
	{
		if(bCheck)
			type.bCheck = true;
		else
			type.bCheck = false;
		/*type.LEconomic.setVisible(true);
		type.LBusiness1.setVisible(true);
		type.LEconomic1.setVisible(false);
		type.LBusiness.setVisible(false); 

		type.JSP1.setVisible(false);
		type.JSP2.setVisible(false);
		type.JSP3.setVisible(false);
		type.JSP4.setVisible(false);
		if(bCheck)
			type.JSP1.setVisible(true);
		else
			type.JSP2.setVisible(true);*/
	}
}



class mouse3 extends MouseAdapter
{
	LoginPage type;
	boolean bCheck;

	public mouse3(LoginPage type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	public void mouseEntered(MouseEvent e)
	{
		type.LDomesticFlight1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		type.LInternationalFlight1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	public void mouseClicked(MouseEvent e)
	{
		if (bCheck)
			new DomesticFlight(type);
		else
			new InternationalFlight(type);
	}
}


class mouse2 extends MouseAdapter
{
	LoginPage type;
	boolean bCheck;

	public mouse2(LoginPage type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	public void mouseEntered(MouseEvent e)
	{
	//type.LEconomic1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		//type.LBusiness1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	public void mouseClicked(MouseEvent e)
	{
		if(type.bCheck)
		{
			if (bCheck)
			{
			/*	type.LBusiness1.setVisible(false);
				type.LBusiness.setVisible(true);
				type.LEconomic.setVisible(false);
				type.LEconomic1.setVisible(true);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(true);
				type.JSP4.setVisible(false);*/
			}
			else
			{
				/*type.LEconomic1.setVisible(false);
				type.LBusiness.setVisible(false);
				type.LBusiness1.setVisible(true);
				type.LEconomic.setVisible(true);
				type.JSP1.setVisible(true);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(true);
				type.JSP4.setVisible(false);*/
			}
		}
		else
		{
			if (bCheck)
			{
				/*type.LBusiness1.setVisible(false);
				type.LBusiness.setVisible(true);
				type.LEconomic.setVisible(false);
				type.LEconomic1.setVisible(true);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(false);
				type.JSP4.setVisible(true);*/
			}
			else
			{
				/*type.LEconomic1.setVisible(false);
				type.LBusiness.setVisible(false);
				type.LBusiness1.setVisible(true);
				type.LEconomic.setVisible(true);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(true);
				type.JSP3.setVisible(false);
				type.JSP4.setVisible(false);*/
			}
		}
	}
}

