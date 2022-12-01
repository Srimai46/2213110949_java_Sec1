import java.util.*;
public class Example_401 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = "";
		String display = "";
		while(true) {
			System.out.print("Enter word : ");
			text = sc.next();
			if(text.equalsIgnoreCase("stop")) {
				break;
			}
			display = display+text;
		
		}
		System.out.println(display.toUpperCase());

	}

}
