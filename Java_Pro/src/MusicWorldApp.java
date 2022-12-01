
import javax.swing.JOptionPane;

public class MusicWorldApp {

	static final double TAX_RATE = 0.0625;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String cdId = JOptionPane.showInputDialog("this program calculates the total cost of a CD order"+
		"\nPlease enter the ID of the CD ");
		String cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
		String strPrice = JOptionPane.showInputDialog("Please enter the price of the CD in U.S.dollars");
		double cdPrice = Double.parseDouble(strPrice);
		String strQuantity = JOptionPane.showInputDialog("Please enter the quantity to be purchased");
		int cdQuantity = Integer.parseInt(strQuantity);
		double cdSubtotal = cdPrice * cdQuantity;
		double cdTotal = cdSubtotal * (1+TAX_RATE);
		double Tax = TAX_RATE*100;
		
		JOptionPane.showMessageDialog(null,"Summary to the transsaction:\n\n"+"CD ID: "+cdId+"\nCD Title: "+cdTitle+
				"\nCD Unit Price: "+"$"+cdPrice+"\nCD Quantity: "+cdQuantity+"\n\nSubtotal: $"+cdSubtotal+
				"\nTax rate: "+Tax+"%"+"\nTotal: "+"$"+cdTotal+"\n\nEnd of Program");
	}

}
