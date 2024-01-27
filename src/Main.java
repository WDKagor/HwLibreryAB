public class Main {
    public static void main(String[] args) {
        Author crouch = new Author("Blake", "Crouch");
        Author king = new Author("Stephen", "King");
        Book pines = new Book(crouch, "Pines", 2011);
        Book dome = new Book(king, "Under the Dome", 2013);

        System.out.println(pines);
        System.out.println(dome);

        System.out.println(pines.equals(dome));



    }

}