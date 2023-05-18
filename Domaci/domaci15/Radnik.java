package domaci15;

public class Radnik {
    String name;
    String surname;
    int employmentYear;

    public Radnik() {
    }

    public Radnik(String name, String surname, int employmentYear) {
        this.name = name;
        this.surname = surname;
        this.employmentYear = employmentYear;
    }

    public boolean workingTenYears(int currentYear) {
        return currentYear - this.employmentYear >= 10;
    }
}
