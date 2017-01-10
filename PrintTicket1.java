import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PrintTicket1 extends JFrame
{
	public PrintTicket1(String sFrom, String sTo, String sClass, Integer iAdult, Integer iChildren, Integer iInfant, String sBookingDate, Integer iPrice, String sTime)
	{
		Container c=getContentPane();
		c.setLayout(new BorderLayout());


		JPanel Panel2 = new JPanel(null);

		Panel2.setPreferredSize(new Dimension(500,200));

		JLabel LTitle = new JLabel("<html><b><font color=\"#FF0000\",size=\"9\">AirLine Ticket</font></b></html>");
		JLabel LFrom = new JLabel("<html><b><font color=\"#D8D8D8\">From &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font></b><font color=\"#778899\">"+ sFrom+"</font></html>" );
		JLabel LTo = new JLabel("<html><font color=\"#D8D8D8\">To &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">"+sTo+"</font></html>");
		JLabel LClass = new JLabel("<html><font color=\"#D8D8D8\">Class &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">"+sClass+"</font></html>" );
		JLabel LBookingDate = new JLabel("<html><font color=\"#D8D8D8\">Traveling Date &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#778899\">"+ sBookingDate+"</font></html>" );
		JLabel LPrice = new JLabel("<html><font color=\"#D8D8D8\">Total Price &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#778899\">"+ iPrice+"</font></html>" );
		JLabel LTime = new JLabel("<html><font color=\"#D8D8D8\">DepatureTime  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#778899\">"+ sTime+"</font></html>" );
		JLabel LAdult = new JLabel("<html><font color=\"#D8D8D8\">Adult &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">"+iAdult+"</font></html>" );
		JLabel LChildren = new JLabel("<html><font color=\"#D8D8D8\">Children &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; : &nbsp;</font><font color=\"#778899\">"+ iChildren+"</font></html>" );
		JLabel LInfant = new JLabel("<html><font color=\"#D8D8D8\">Infant &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">"+iInfant+"</font></html>" );
		JLabel LWishes = new JLabel("<html><body><I><font color=\"#CC0000\",size=\"4\">Have a safe journey!</font></I></body></html>");


		JLabel LTicketNo=new JLabel("<html><font color=\"#D8D8D8\">TicketNumber &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font></html>");
		JLabel LBookedBy=new JLabel("<html><font color=\"#D8D8D8\">BookedBy &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font></html>");

		JLabel LEmpty = new JLabel("");
		JLabel LDemo = new JLabel("");
		JLabel LLaxmi=new JLabel("");
		JLabel LGemal=new JLabel("");
		JLabel LMayuran=new JLabel("");
		JLabel LSathya=new JLabel("");


		LTitle.setBounds(170,15,500,45);
		LFrom.setBounds(20,80,300,20);

		LTo.setBounds(20,125,300,20);
		LClass.setBounds(20,170,300,20);
		LBookingDate.setBounds(20,215,300,20);
		LPrice.setBounds(20,260,300,20);
		LTime.setBounds(20,305,300,20);
		LAdult.setBounds(20,345,300,20);
		LChildren.setBounds(20,385,300,20);
		LInfant.setBounds(20,430,300,20);

		LWishes.setBounds(530,435,300,20);


		LTicketNo.setBounds(320,80,300,20);
		LBookedBy.setBounds(320,125,300,20);

		LEmpty.setBounds(3,445,1000,20);

		LDemo.setBounds(280,465,300,20);
		LLaxmi.setBounds(285,485,300,20);
		LGemal.setBounds(285,505,300,20);
		LMayuran.setBounds(285,525,300,20);
		LSathya.setBounds(285,545,300,20);


		Panel2.add(LTitle);
		Panel2.add(LFrom);
		Panel2.add(LTo);
		Panel2.add(LClass);
		Panel2.add(LBookingDate);
		Panel2.add(LAdult);
		Panel2.add(LChildren);
		Panel2.add(LInfant);
		Panel2.add(LPrice);
		Panel2.add(LTime);
		//Panel2.add(LEmpty);

		Panel2.add(LWishes);

		Panel2.add(LTicketNo);
		Panel2.add(LBookedBy);
		Panel2.add(LEmpty);
		Panel2.add(LDemo);


		Panel2.add(LLaxmi);
		Panel2.add(LGemal);
		Panel2.add(LMayuran);
		Panel2.add(LSathya);


		Panel2.setBackground(Color.white);

		c.add(Panel2, BorderLayout.CENTER);


		//pack();
		setSize(700,650);
		setVisible(true);
	}
}
