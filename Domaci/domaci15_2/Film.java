package domaci15_2;

import java.time.Year;

public class Film {
    private String name;
    private String director;
    private int year;
    private final int CURRENT_YEAR = Year.now().getValue();

    public Film() {

    }

    public Film(String name, String director, int year) {
        setName(name);
        setDirector(director);
        setYear(year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) {
            System.out.println("Film mora imati ime.");
        } else {
            this.name = name;
        }
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= CURRENT_YEAR) {
            this.year = year;
        } else {
            System.out.println("Invalidna godina.");
        }
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                '}';
    }
}
