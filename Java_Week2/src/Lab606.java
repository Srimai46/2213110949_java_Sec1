import javax.swing.*;
public class Lab606 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {25, 78, 41, 22, 36, 85, 37};
		for(int i =0;i< number.length;i++) {
			int array = Integer.parseInt(JOptionPane.showInputDialog("input index of array:"));
			
			while(!checkIndex(number,array)) {
			    array = Integer.parseInt(JOptionPane.showInputDialog("input index of array, again:"));			    
			}
			JOptionPane.showMessageDialog(null,"Current data, num["+currenData(number,array)+"] is "+number[array]+"\n"+
					(prevData(number,array)!=-1? "Previous data, nums["+prevData(number,array)+"] is "+number[array-1]:"No previous data")+"\n"+
					(nextData(number,array)<=6?"Next data, nums ["+nextData(number,array)+"] is "+number[array+1]:"No next data"));
		}		 		
						
		}
	
	public static boolean checkIndex(int[] nums,int index) {
		return (index >=0 && index <7);
			
	}
	public static int currenData(int[] nums,int index) {
		return	index;	
		
	}
	public static int prevData(int[] nums,int index) {
		return index-1;	
	}
	public static int nextData(int[] nums,int index) {
		return index+1;	
 }
}