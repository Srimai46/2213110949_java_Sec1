import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Full Name : ");
		String fullname = sn.nextLine();
		int spec = fullname.indexOf(' ');
		if(spec==-1) {
			System.out.println("Incorrect Name");
		}
		else {
			
			System.out.println("First Name :"+ fullname.substring(0,spec).toUpperCase());
			System.out.print("Last Name :"+ fullname.substring(spec+1).toLowerCase());
			
		}

	}

}
