import java.util.*;
public class Example_401 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String text = "";
		String word = "";
		while(true) {
			System.out.print("Enter word ");
			text = kb.next();
			if (text.equalsIgnoreCase ("stop")) {
				break;
			}
			word = word+text+" ";

		}
		System.out.print(word.toUpperCase());

	}
	
}
