import java.time.Year;

public class Book {
	private String title;
	private float price;
	private int publishyear;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPrice() {
		return this.price;
	}
	
	public void setPublishyear(int year) {
		publishyear = year;
	}
	public int getPublishyear() {
		return this.publishyear;
	}
	public int getTotalyear() {
		return (Year.now().getValue())-publishyear;
		
	}
	public String toString(){
		return ("Title: "+title+" published for "+getTotalyear()+" year ("+price+" baht).");
	}

}
