class Book {
    static String libraryName = "Book Mania";
    private String author;
    private String title;
    private final int isbn;

    public Book(String author, String title, int isbn){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public void displayDetails(){
       if(this instanceof Book) {
           System.out.println("Author: " + author);
           System.out.println("Title: " + title);
           System.out.println("ISBN: " + isbn);
       }
    }

    static void displayLibraryName(){
        System.out.println(libraryName);
    }
}

public class Library{
    public static void main(String[] args) {
        Book book1 = new Book("John Smith", "Book Mania", 1990);
        book1.displayDetails();
    }
}

//Author: John Smith
//Title: Book Mania
//ISBN: 1990
