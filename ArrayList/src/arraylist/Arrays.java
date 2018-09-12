package arraylist;

public class Arrays {

    public static void main(String[] args) {

        Book BookList = new Book();
//        BookList.addBook();
//        System.out.println(BookList.BookList);



        boolean whileTrue = true;
        while (whileTrue) {
            System.out.println("Use 1-6 to choose what do do!");
            System.out.println("1.Add a book.");
            System.out.println("2.Remove a book.");
            System.out.println("3.Update book name.");
            System.out.println("4.Print all books in the list.");
            System.out.println("5.Print one book in the list.");
            System.out.println("6.Exit.");

            int val = BookList.readNumber();
            switch (val) {
                case 1:
                    //add book (name ,isbn and number of pages!)

                    BookList.addBook();
                    break;
                case 2:
                    // remove Book using an int index
                    System.out.println("Välj vilken book du vill ta bort.");
                    BookList.removeBook(BookList.readNumber());
                    break;
                case 3:
                    // Update the Book name!
                    System.out.println("Vilken book vill du ändra namn på?");
                    BookList.updateBookName(BookList.readNumber());
                    break;
                case 4:
                    //Print all
                    System.out.println(Book.BookList.toString());
                    break;
                case 5:
                    //Print one Book
                    System.out.println(Book.BookList.get(BookList.readNumber()));
                    break;
                case 0:
                    System.exit(0);
                    break;

            }
        }

    }

}
