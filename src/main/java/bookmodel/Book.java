package bookmodel;

public class Book extends PrintedProduct {

    private String bookAuthor;
    private int yearOfWriting;
    private String bookGenre;

    public Book() {
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getYearOfWriting() {
        return yearOfWriting;
    }

    public void setYearOfWriting(int yearOfWriting) {
        this.yearOfWriting = yearOfWriting;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nbookAuthor=" + bookAuthor + '\n' +
                "yearOfWriting=" + yearOfWriting + '\n' +
                "bookGenre='" + bookGenre;
    }
}
