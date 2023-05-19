package domaci15_2;

public class FilmMain {
    public static void main(String[] args) {

        Film film1 = new Film("Ted", "Seth MacFarlane", 2012);
        Film film2 = new Film("Annabelle", "John R. Leonetti", 2014);

        if (film1.getYear() > film2.getYear()) {
            System.out.println("Noviji je: " + film1);
        } else if (film1.getYear() == film2.getYear()) {
            System.out.println("Filmovi su izasli iste godine.");
        } else {
            System.out.println("Noviji je: " + film2);
        }
    }
}
