import javax.swing.*;
import java.text.*;
public class Lab301 {
	static final int PRICEPERSON = 299;
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		double totalPrice = PRICEPERSON*numberofCustomer;
		int memberCard = JOptionPane.showConfirmDialog(null,
				"Total Price is "+frm.format(totalPrice)+" baht."+
				"\nDo you have a number card??") ;
		while(memberCard==2)
			{
				memberCard = JOptionPane.showConfirmDialog(null,
						"Total Price is "+frm.format(totalPrice)+" baht."+
						"\nDo you have a number card??") ;
			}
		double pricediscount ;
		if(memberCard==0) {
			pricediscount = totalPrice*90/100;//totalPrice+(totalPrice*10/100)
			JOptionPane.showMessageDialog(null,
					"Amount to be paid is "+frm.format(pricediscount)+" baht.");
								
		}
		else if (memberCard ==1) {
			JOptionPane.showMessageDialog(null,
					"Amount to paid is "+frm.format(totalPrice)+" baht.");
		}
		
			
		}
	}
}


