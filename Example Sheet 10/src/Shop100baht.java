import javax.swing.*;
public class Shop100baht {

	public static void main(String[] args) {
		Product sold = new Product();
		
		int buttom = JOptionPane.showConfirmDialog(null, "Pattanakran?");
		if (buttom == 0) {
			sold = new PatthanakranBranch();
		}
		
		sold.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:")));
		JOptionPane.showMessageDialog(null, sold);

	}

}
