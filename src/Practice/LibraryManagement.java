package Practice;

import java.util.ArrayList;

class Book{
    String name ,author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;

    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
class MyLibrary{
    public ArrayList<Book> books ;
    public MyLibrary(ArrayList<Book> book) {
        this.books = book;
    }
    public void addBook(Book book){
        System.out.println("The book has been added ");
        this.books.add(book);
    }
    public void returnBook(Book book ){
        System.out.println("The book has been returned ");
        this.books.add(book);
    }
    public void issueBook(Book book){
        System.out.println("The book has been issued  on ");
        this.books.remove(book);
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
      ArrayList<Book> bk = new ArrayList<>();
      Book b1 =new Book("java","abhay");
        bk.add(b1 );
      MyLibrary myLibrary = new MyLibrary(bk);
   myLibrary.addBook(new Book("c+++","abhay"));
   myLibrary.issueBook(b1);
        for (int i = 0; i < bk.size(); i++) {
            System.out.print(bk.get(i));
            System.out.print(", ");


        }
    }
}
