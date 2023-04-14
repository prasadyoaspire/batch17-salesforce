package bean;
public class Book {
    private int bookId;
    private String bookName;
    private double bookPrice;
    private Author bookAuthor; // has-a relation
    public int getBookId() {
        return bookId;
    }
    public String getBookName() {
        return bookName;
    }
    public double getBookPrice() {
        return bookPrice;
    }
    public Author getBookAuthor() {
        return bookAuthor;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }
    public void setBookAuthor(Author bookAuthor) {
        this.bookAuthor = bookAuthor;
    }    
}
