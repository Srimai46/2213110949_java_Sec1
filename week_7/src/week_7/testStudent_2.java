package week_7;
import java.util.*;
public class testStudent_2 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many student in classroom : ");
		 
		Student[] std =new Student[sc.nextInt()];
		System.out.println();
		
		
		for(int i =0 ;i <std.length;i++) {
			std[i] = new Student();
					
			System.out.print("Input Student name: ");
			std[i].setName(sc.next());
			System.out.print("Input Student score :");
			std[i].setScore(sc.nextInt());	
			while(!std[i].checkScore()) {
				System.out.print("Input Student score, again :");
				std[i].setScore(sc.nextInt());	
			}
			System.out.println("-------------------------------------------");
			
		}
		
		System.out.println("-------------------------------------------");
		for(Student _std:std ) {
			
				System.out.println(">> "+_std.getName()+" get grad "+_std.findGrade(_std.getScore()));
			
		}
		

	}

}
