package week_7;
import java.util.*;
public class testStudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many student in classroom : ");
		int student = sc.nextInt();
		Student[] std =new Student[student];
		
		
		for(int i =0 ;i <=student;i++) {
			std[i] = new Student();
			
			System.out.println("\nINPUT INFORMATION OF STUDENT "+(i+1));
			System.out.println("-------------------------------------------");
			System.out.print("Input Student name: ");
			std[i].setName(sc.next());
			System.out.print("Input Student score :");
			std[i].setScore(sc.nextInt());	
			while(!std[i].checkScore()) {
				System.out.print("Input score, again :");
				std[i].setScore(sc.nextInt());	
			}
			
		}
		System.out.println("\4nLIST OF PASS STUDENT (>=50):");
		System.out.println("-------------------------------------------");
		for(int i =0;i<std.length;i++) {
			if(std[i].isPass()) {
				System.out.print(">> "+std[i].getName()+"(>="+std[i].getScore()+")");
			}
		}
		

	}

}
