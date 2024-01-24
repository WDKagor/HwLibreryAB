public class Main {
    public static void main(String[] args) {
        Author crouch = new Author("Blake", "Crouch");
        Author king = new Author("Stephen", "King");
        Book pines = new Book("Pines", 2011);
        Book dome = new Book("Under the Dome", 2013);

        System.out.println(crouch.getFirstName() + " " + crouch.getLastName() + ", " + pines.getTitle() + ", " + pines.getYearOfPublication() + " yr.");
        System.out.println(king.getFirstName() + " " + king.getLastName() + ", " + dome.getTitle() + ", " + dome.getYearOfPublication() + " yr.");
        pines.setYearOfPublication(2016);
        System.out.println(crouch.getFirstName() + " " + crouch.getLastName() + ", " + pines.getTitle() + ", " + pines.getYearOfPublication() + " yr.");
    }

}