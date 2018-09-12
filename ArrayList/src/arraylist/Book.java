package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {

    private int isbn;
    private String bookName;
    private int nrPages;

    static ArrayList<Book> BookList = new ArrayList();
    Scanner sc = new Scanner(System.in);
    
    public Book(){}

    public Book(int isbn,String bookName,int nrPages ) {
        this.isbn=isbn;
        this.bookName=bookName;
        this.nrPages=nrPages;
        

    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setNrPages(int nrPages) {
        this.nrPages = nrPages;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public int getNrPages() {
        return nrPages;
    }
    
    public Book getBook(int index){
    return BookList.get(index);
    
    }
    
    public void addBook(){
        System.out.println("Vad heter boken?");
        String name = readText();
        System.out.println("Vad har den för isbn?");
        int isbn= readNumber();
        System.out.println("Hur många sidor har boken?");
        int nrPages= readNumber();
        Book newBook = new Book(isbn,name,nrPages);
        BookList.add(newBook);
    
    }

    @Override
    public String toString() {
        System.out.println("");
        return "this book has the isbn " + isbn + ",and the Books name is " + bookName + ", The book has " + nrPages + " pages" + "";
        
    }
    

    
    public int readNumber(){
     int numberRead = sc.nextInt();
    sc.nextLine();
        return numberRead;
    
    }
    
    public String readText(){
        return sc.nextLine();
    
    }
    
    public void removeBook(int index){
    BookList.remove(index);
    
    }
    
    public void updateBookName(int index){
        System.out.println("What name do you want instead?");
    String newName = readText();
    BookList.get(index).bookName=newName;
    
    }
   
}
