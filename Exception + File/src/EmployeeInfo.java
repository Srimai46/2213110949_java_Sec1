import java.io.*;
import java.util.*;
public class EmployeeInfo {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		String choice;
		System.out.print("Insert or Read data from file? : ");
		choice = sc.next().toLowerCase();
		while(!choice.equals("insert")&& !choice.equals("read")) {
			System.out.print("Please text insert or read data? : ");
			choice = sc.next().toLowerCase();
		}
		SaveandOpen file = new SaveandOpen();
		if(choice.equals("insert")) {
			file.insert();
		}
		else {
			System.out.print("\nEnter department");
			choice = sc.next();
			file.setDept(choice);
			file.read();
		}

	}

}
