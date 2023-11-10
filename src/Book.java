public class Book {
    String title1;
    String title2;
    private int years1;
    private int years2;

    public Book(String title1, String title2, int years1, int years2) {
        this.title1 = title1;
        this.title2 = title2;
        this.years1 = years1;
        this.years2 = years2;
    }

    public int getYears1() {
        return this.years1;
    }
    public int getYears2() {
        return this.years2;
    }
    public void setYears1(int years1) {
        this.years1 = years1;
    }
    public void setYears2(int years2) {
        this.years2 = years2;
    }
}
