import java.util.Objects;

public class Book {
    private String title;
    private int yearOfPublication;
    private Author author;


    public Book(Author author, String title, int yearOfPublication) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + yearOfPublication + " yr";
    }


    public String getTitle() {
        return this.title;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, yearOfPublication, author);
    }
}
