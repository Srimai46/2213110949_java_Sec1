import java.util.*;
public class Lab402 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Input sime sentence : ");
		String sentence = sn.nextLine();
		
		while(!sentence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			sentence = sn.nextLine();
			
			
		}
				
		
		for(int i =0;i<sentence.length();i++) {
			if (sentence.charAt(i)!=' ') {	
				
				System.out.print(sentence.charAt(i));
				
			}		
			else {
				System.out.println();
			}
			
		}

	}

}
