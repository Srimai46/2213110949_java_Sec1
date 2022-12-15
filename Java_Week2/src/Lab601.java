import java.util.*;
public class Lab601 {
	static int cou =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int[] positiveNumber = new int[7];
		for (int i =0 ;i<positiveNumber.length;i++) {
			System.out.print("Input number "+(i+1)+" : ");
			positiveNumber[i] = sc.nextInt();
			if(positiveNumber[i]%2 != 0) {
				cou++;
			}
		}
		
		System.out.println("Tere are "+cou +" of odd number.");
		
		
		
		for (int _posNum:positiveNumber) {
			if (_posNum%2 != 0) {
				System.out.print(_posNum+" ");
			}
		}
		
	}
	public static int countOddNumber (int[] num) {
		for(int i =0;i<num.length;i++) {
			if(num[i] % 2!=0) {
				cou++;
			}
		}
		return cou;
	}

}
