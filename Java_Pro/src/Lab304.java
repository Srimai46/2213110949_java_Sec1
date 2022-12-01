import javax.swing.*;
import java.text.*;
import java.util.Random;
public class Lab304 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###");
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		int withdraw = Integer.parseInt(JOptionPane.showInputDialog("Your balance : "+frm.format(balance)+
																	"\nInput money to withdraw:"));
		
		int B1000 = withdraw/1000 , B500  , B100;
		int withdraw1000 = withdraw-(B1000*1000);		
		B500 = 	withdraw1000/500;
		int withdraw500 =  withdraw1000-(B500*500);
		B100 = withdraw500/100;
		int withdraw100 = withdraw500-(B100*100);
		
		if( withdraw > balance) {
			JOptionPane.showMessageDialog(null,
					"Error:Cannot withdraw more than balance",
					"ERROR",JOptionPane.ERROR_MESSAGE);			
		}
		else if (withdraw > 20000) {
			JOptionPane.showMessageDialog(null,
					"Error: Cannot withdraw more than 20,000",
					"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		
		else if (withdraw100 != 0 ) {
			JOptionPane.showMessageDialog(null,
					"Error:Cannot witchdraw "+withdraw100+" baht",
					"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else  {
			JOptionPane.showMessageDialog(null,
		
				"You withdraw : "+frm.format(withdraw)+
				"\n1000 ="+B1000+
				"\n500 = "+B500+
				"\n100 = "+B100);
		}
		
	}

}
