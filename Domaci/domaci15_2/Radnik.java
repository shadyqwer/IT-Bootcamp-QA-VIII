package domaci15_2;

public class Radnik {
    private String name;
    private String surname;
    private int employmentYear;
    private final int CURRENT_YEAR = 2023;

    public Radnik() {
    }

    public Radnik(String name, String surname, int employmentYear) {
        setName(name);
        setSurname(surname);
        setEmploymentYear(employmentYear);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals("")) {
            this.name = name;
        } else {
            System.out.println("Radnik mora imati ime.");
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getEmploymentYear() {
        return employmentYear;
    }

    public void setEmploymentYear(int employmentYear) {
        if (employmentYear <= CURRENT_YEAR) {
            this.employmentYear = employmentYear;
        } else {
            System.out.println("Invalidna godina.");
        }
    }

    public boolean workingTenYears() {
        return CURRENT_YEAR - getEmploymentYear() >= 10;
    }

    @Override
    public String toString() {
        return "Radnik{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employmentYear=" + employmentYear +
                '}';
    }
}
