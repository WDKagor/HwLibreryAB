public class Book {
    private String title;
    private int yearOfPublication;

    public Book(String title, int yearOfPublication) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
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


}
