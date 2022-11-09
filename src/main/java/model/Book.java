package model;

public class Book extends PrintedProduct {

    private String author;
    private int yearOfWriting;
    private String genre;

    public Book(String name, String author, int yearOfWriting, String genre) {
        super(name);
        this.author = author;
        this.yearOfWriting = yearOfWriting;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfWriting() {
        return yearOfWriting;
    }

    public void setYearOfWriting(int yearOfWriting) {
        this.yearOfWriting = yearOfWriting;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" + super.toString() +
                "author='" + author + '\'' +
                ", yearOfWriting=" + yearOfWriting +
                ", genre='" + genre + '\'' +
                '}';
    }
}
