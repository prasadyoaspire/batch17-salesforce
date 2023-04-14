package main;

import bean.Author;
import bean.Book;

public class HasARelationDemo {
    public static void main(String[] args) {

        Author author1 = new Author();
        author1.setAuthorId(10);
        author1.setAuthorName("James");
        author1.setEmail("james@tmail.com");
        
        Book book1 = new Book();
        book1.setBookId(1011);
        book1.setBookName("Java in action");
        book1.setBookPrice(5000);
        book1.setBookAuthor(author1);

        int bookId = book1.getBookId();
        String nameOftheBook = book1.getBookName();
        double priceOftheBook = book1.getBookPrice();
        Author authorOfTheBook = book1.getBookAuthor();

        System.out.println("Book Details");
        System.out.println("Id: "+bookId);
        System.out.println("Name: "+nameOftheBook);
        System.out.println("Price: "+priceOftheBook);
        System.out.println("Author Details: ");
        System.out.println("Author Name:"+authorOfTheBook.getAuthorName());
        System.out.println("Email:"+authorOfTheBook.getEmail());
    }
}
