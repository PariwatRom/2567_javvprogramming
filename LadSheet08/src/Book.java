
public class Book {
	private String title;
	private Author author;
	private int page;
	
	Book(String title,Author author, int page ){
	this.title = title;
	this.author = author;
	this.page = page;
	}
	Book(String title,Author author){
		this(title,author,0);
	}
	Book(){
		this.title = null;
		this.author = null;
		this.page = 0;
	}
	public  String grtTitle()  {
		
	}
	public Author author() {
		
	}
	public void setPage (int page) {
		
	}
	public int getpage() {
		
	}
	public String toString() {
		
	}
}
