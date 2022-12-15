import java.util.*;
public class Lab603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int[] numberOfInteger = {78, 36, 58, 41, 25, 92 , 75};
		
		System.out.print("Input index od array : ");
		int indexOfArray = sc.nextInt();
		
		while(indexOfArray <0||indexOfArray >(numberOfInteger.length-1)) {
			System.out.print("Input index od array : ");
			indexOfArray = sc.nextInt();
		}
		System.out.println();
		System.out.println("Value in current index is "+(numberOfInteger[indexOfArray]));
		if(indexOfArray == 6) {
			System.out.print("Sorry, "+indexOfArray + " is the last index in array");
		}
		else System.out.println("Value in next index is "+(numberOfInteger[indexOfArray]));
		
		
	}

}
