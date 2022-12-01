import javax.swing.*;
import java.util.*;

public class Example_403 {

	public static void main(String[] args) {
		/*Scanner sn = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String sentence = sn.nextLine();*/
		
		String sentence = JOptionPane.showInputDialog(null,"Input a sentence : ");
		
		while(!sentence.endsWith(".")) {
			/*System.out.print("Input a sentence, again : ");
			sentence = sn.nextLine();*/
			
			sentence = JOptionPane.showInputDialog(null,"Input a sentence, again : ");
		}
		System.out.println();
		int count = 0 ;
		for(int i = 0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				count++;
			}
		}
		/*System.out.println("This sentence has " + count + " spacebar.");
		System.out.println("This sentence has " + (count+1) + " word.");*/
		
		JOptionPane.showMessageDialog(null, "This sentence has " + count + " spacebar."
				+"\nThis sentence has " + (count+1) + " word.");
			
		
	}

}
