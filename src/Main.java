public class Main {


    public static void main(String[] args) {

        Author alexey = new Author("Alexey", "Lev");
        Author lev = new Author("Alexey", "Lev");

        Book buratino = new Book("Buratino", 1950, alexey);
        Book voinaImir = new Book("Voina i mir", 1843, lev);

        System.out.println(buratino.getTitle() + "-" + buratino.getAuthor().getFirstName() + "-" +
                buratino.getYear());
        System.out.println(voinaImir.getTitle() + "-" + lev.getLastName() +
                "-" + voinaImir.getYear());

        buratino.setYear(1788);
        System.out.println(buratino.getYear());

    }
}
