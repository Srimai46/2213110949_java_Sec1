import java.io.*;
import java.util.*;
public class Example1201 {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(new File("MemberLogin.txt"));
		while(sc.hasNext()) {
			String fname = sc.next(); 
			//String lname = sc.next();
			sc.next();
			sc.next();
			String email = sc.next().toUpperCase();
			System.out.println(fname+ "(" + email+")");
			
		}
		
		sc.close();
		

	}

}
