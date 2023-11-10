public class Main {


    public static void main(String[] args) {

        Author alexey = new Author("Alexey", "Lev");
        Author lev = new Author("Alexey", "Lev");

        Book buratino = new Book("Buratino", "Voina i mir", 2013, 1834);

        Book voinaImir = new Book("Buratino", "Voina i mir", 2013, 1834);

        Book annum1 = new Book("Buratino", "Voina i mir", 2013, 1834);

        Book annum2 = new Book("Buratino", "Voina i mir", 2013, 1834);

        System.out.println("alexey.name = " + alexey.getName() + "\n" + "lev.name = " + lev.getName2());
        System.out.println("buratino.title1 = " + buratino.title1 + "\n" + "voinaImir.title2 = " + voinaImir.title2);
        System.out.println("annum1.years1 = " + annum1.getYears1()+ "\n" + "annum2.years2 = " + annum2.getYears2());
        annum1.setYears1(1978);
        annum2.setYears2(1888);
        System.out.println("annum1.getYears1() = " + annum1.getYears1());
        System.out.println("annum2.getYears2() = " + annum2.getYears2());


    }
}
