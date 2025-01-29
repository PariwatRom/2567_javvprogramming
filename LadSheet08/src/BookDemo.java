import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System. in) ;
		System. out.print ("Input author name : ");
		String authorName = scan. nextLine ();
		System. out. print ("Input author e-mail : ");
		String authorEmail = scan. nextLine ();
		Author authorl = new Author (authorName, authorEmail);
		System. out.println(authorl); //call toString() method
		System. out.println();
		System. out.print("Input book title : ");
		String bookTitle = scan. nextLine ();
		System. out.print("Input book page : ");
		int bookpage = scan.nextInt();
		Book book1 = new Book(bookTitle,authorl,bookpage);
		System. out.println(book1);
	}

}
