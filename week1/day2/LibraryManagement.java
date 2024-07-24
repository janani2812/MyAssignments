package week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		Library Bw = new Library();
		String title =Bw.addBook("The Fairy Tale");
		System.out.println("Book title is :"+title);
		Bw.issueBook();
	}

}
