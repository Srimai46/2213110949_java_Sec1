import java.util.*;
public class MovieDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Input movie id   : ");
		String id = sc.nextLine();
		System.out.print("Input movie name : ");
		String moviename = sc.nextLine();
		
		System.out.println();
		
		System.out.print("Input director name   :");
		String name = sc.nextLine();
		System.out.print("Input director e-mail :");
		String email = sc.nextLine();
		
		System.out.print("Input director gender :");
		String gender = sc.nextLine();
		while(!(gender == "f") ||!(gender == "F") ||!(gender == "m") ||!(gender == "M")) {
				System.out.print("Input director gender, again :");
				gender = sc.nextLine();	
			}	
		
		System.out.println();

		System.out.print("Input movie theater no.  :");
		int theaterNo = sc.nextInt();
		while(theaterNo<1||theaterNo>15) {
			System.out.print("Please input 1 - 15 only :");
			theaterNo = sc.nextInt();
		}
		System.out.println();
		
		Theater tt = new Theater(id,moviename,name,email.gender,theaterNo);
		System.out.println(tt);

		
	}

}
