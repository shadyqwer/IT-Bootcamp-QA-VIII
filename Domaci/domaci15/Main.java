package domaci15;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        // radnik
        final int CURRENT_YEAR = Year.now().getValue();
        Radnik radnik1 = new Radnik("Marko", "Markovic", 2000);
        Radnik radnik2 = new Radnik("Petar", "Petrovic", 2015);
        Radnik radnik3 = new Radnik("Ivana", "Ivanovic", 2005);
        System.out.println(radnik1.name + " radi vise od 10 godina: " + radnik1.workingTenYears(CURRENT_YEAR));
        System.out.println(radnik2.name + " radi vise od 10 godina: " + radnik2.workingTenYears(CURRENT_YEAR));
        System.out.println(radnik3.name + " radi vise od 10 godina: " + radnik3.workingTenYears(CURRENT_YEAR));

        // film
        Film film1 = new Film("Ted", "Seth MacFarlane", 2012);
        Film film2 = new Film("Annabelle", "John R. Leonetti", 2014);
        if (film1.year > film2.year) {
            System.out.println("Noviji je: " + film1.name);
        } else if (film1.year == film2.year) {
            System.out.println("Filmovi su izasli iste godine.");
        } else {
            System.out.println("Noviji je: " + film2.name);
        }

    }
}
