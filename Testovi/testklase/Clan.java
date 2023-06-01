package testklase;

public abstract class Clan {
    protected String id;
    protected String ime;
    protected String prezime;
    protected double visina;
    protected double tezina;

    public Clan() {

    }

    public Clan(String id, String ime, String prezime, double visina, double tezina) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        setVisina(visina);
        setTezina(tezina);
    }

    public String getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        if (visina > 0) {
            this.visina = visina;
        } else {
            System.out.println("Visina ne moze biti negativna.");
        }
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        if (tezina > 0) {
            this.tezina = tezina;
        } else {
            System.out.println("Tezina ne moze biti negativna.");
        }
    }

    public abstract void prikaziProfil();

    public abstract boolean postignutCilj(Sprava sprava);

    public double racunajBMI() {
        return tezina / ((visina / 100.0) * (visina / 100.0));
    }
}
