package advancedLibrary;

//Represents a book, with a title and an author
public class Books {
	 //Fields to store the title and author of the book.
	 String title;
	 String author;
	
	//Getter method to retrieve the title of the book
	public String getTitle() {
		return title;
	}
	//Setter method to set the title of the book.
	public void setTitle(String title) {
		this.title = title;
	}
	//Getter method to retrieve the author of the book
	public String getAuthor() {
		return author;
	}
	//Setter method to set the author of the book
	public void setAuthor(String author) {
		this.author = author;
	}
}