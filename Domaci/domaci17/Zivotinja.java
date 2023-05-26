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

    public abstract String zvuk();
}
