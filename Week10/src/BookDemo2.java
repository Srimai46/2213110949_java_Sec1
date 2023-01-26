import javax.swing.*;

public class BookDemo2 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Input author name:");
		String email = JOptionPane.showInputDialog("Input author e-mail:");
		String title = JOptionPane.showInputDialog("Input book title:");
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page:")) ;
		
		
		Book book = new Book(title,new Author(name,email),page);
		int confirm = JOptionPane.showConfirmDialog(null, "is the page correct","Confirm",JOptionPane.YES_NO_OPTION);
		if (confirm!=0) {
			page = Integer.parseInt(JOptionPane.showInputDialog("Input book page, again:"));
			book.setPage(page);
			
		}
		JOptionPane.showMessageDialog(null,"Book Title : "+book.getTitle()+"\nAuthor name : "
				+book.getAuthor().getName()+" ("+book.getPage()+" page)\nAuthor e-mail : "
				+book.getAuthor().getEmail());
	}

}
