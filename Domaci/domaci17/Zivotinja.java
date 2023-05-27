package domaci17;

public abstract class Zivotinja {
    protected String ime;
    protected String nadimak;

    public Zivotinja() {

    }

    public Zivotinja(String ime, String nadimak) {
        this.ime = ime;
        this.nadimak = nadimak;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getNadimak() {
        return nadimak;
    }

    public void setNadimak(String nadimak) {
        this.nadimak = nadimak;
    }

    public abstract String zvuk();

    @Override
    public String toString() {
        return "Zivotinja{" +
                "ime='" + ime + '\'' +
                ", nadimak='" + nadimak + '\'' +
                '}';
    }
}
