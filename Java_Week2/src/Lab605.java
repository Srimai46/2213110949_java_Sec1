import javax.swing.*;
public class Lab605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int[5];
		for(int i =0;i<number.length;i++) {
			number[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+" : "));								
		}
		
		showEven(number);
			
		showOdd(number);
		}		
	
	
	public static void showEven(int[] nums) {
	    String even = ""; 
		for(int _num:nums) {
			if(_num%2==0) {
				even = even+_num+" ";
								
			}
		}
			JOptionPane.showMessageDialog(null, "List of even number:\n"+even);
	}
			
	public static void showOdd(int[] nums) {
		String odd ="";
		for(int _num:nums) {
			if(_num%2!=0) {
				odd = odd+_num+" ";
			}
     	}
		JOptionPane.showMessageDialog(null, "List of odd number:\n"+odd);
		
   }
}
