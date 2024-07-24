package week1.day2;

public class Library {

		 public String addBook(String bookTitle) {
				System.out.println("Book added successfully");
				return bookTitle;
			 }
			 void issueBook() {
					System.out.println("Book issued successfully");
			 }
			public static void main(String[] args) {
				Library Bw = new Library();
				String title =Bw.addBook("The Red Dog");
				System.out.println("Book title is :"+title);
				Bw.issueBook();
			}
			}

