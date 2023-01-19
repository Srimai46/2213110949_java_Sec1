import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk = new Book();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input book title   : ");
		bk.setTitle(sc.nextLine());
		System.out.print("Input book price   : ");
		bk.setPrice(sc.nextFloat());
		System.out.print("Input publish year : ");
		bk.setPublishyear(sc.nextInt());
		
		System.out.print("\n"+bk);
		
		//System.out.print("\nTitle: "+bk.getTitle()+" published for "+bk.getTotalyear()+" year ("+bk.getPrice()+" baht).");
		

	}

}
