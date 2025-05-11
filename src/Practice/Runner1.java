package Practice;

class Library {
    String[] Book;
    int No_OF_Book;

    Library() {
        Book = new String[10];
        No_OF_Book = 0;
    }

    public void addBook(String book) {
        this.Book[No_OF_Book] = book;
        No_OF_Book++;

    }

    public void showBook() {
        for (String show : Book) {
            if (show == null) {
                continue;
            }
            System.out.println(show);
        }
    }

    public void issueBook(String issueBook ) {
       for(int i=0; i<this.Book.length; i++){
             String book= this.Book[i];
             if (book == issueBook ) {
                System.out.println("The Book is issued");
                Book[i] = null;
                return;
                 }
       }
        System.out.println( " this book is dose not exist");
    }
     public void returnBook( String returnBook){
           for(int i=0; i<this.Book.length; i++){
                String book = this.Book[i];
                if(book== null){
                  Book[i]= returnBook;
                  return;
                }
           }
     }
}
public class Runner1 {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("THE BOOK OF JAVA");
        library.addBook("THE BOOK OF c++");
        library.addBook("THE BOOK OF python");
          library.issueBook("THE BOOK OF python");
       library.showBook();
       library.returnBook("THE BOOK OF python");
        library.showBook();
    }
}

