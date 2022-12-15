import javax.swing.*;
public class EX602_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] deptName = {"Accounting","HR","Sales","Innovation"};
		boolean deptF = false; 
		
		String dept = JOptionPane.showInputDialog("Enter a deparment name");
		for(int i= 0;i<deptName.length;i++) {
			if(dept.equalsIgnoreCase(deptName[i]) ) {
				deptF = true;
			}
		}
		JOptionPane.showMessageDialog(null,
										(deptF)? dept + "was found in the lst"
											   : dept + "was not found in the list");
		

	}

}
