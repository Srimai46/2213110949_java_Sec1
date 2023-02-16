
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class ATMBanking {

	public static void main(String[] args) throws IOException{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter account number : ");
		String  id = sc.next();
		BufferedReader read = new BufferedReader(new FileReader("ATMBookBank.txt"));
		String temp = "";
		while((temp=read.readLine())!=null) {
			String[] data = temp.split("\t");
			if (!data[0].equals(id)) {
				System.out.print("Input wrong type, Enter account number :");
			}
		}
		
		}
		
		
			
		
			
		

	}

}
