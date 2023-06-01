package testklase;

public class Trener extends Clan {
    private int godineIskustva;

    public Trener() {

    }

    public Trener(String id, String ime, String prezime, double visina, double tezina, int godineIskustva) {
        super(id, ime, prezime, visina, tezina);
        setGodineIskustva(godineIskustva);
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        if (godineIskustva > 0) {
            this.godineIskustva = godineIskustva;
        } else {
            System.out.println("Godine iskustva moraju biti pozitivne.");
        }
    }

    @Override
    public void prikaziProfil() {
        System.out.println("Instruktor: (" + super.id + " " + super.ime + " " + super.prezime +
                ")\nGodine iskustva: (" + this.godineIskustva + ")");
    }

    @Override
    public boolean postignutCilj(Sprava sprava) {
        return true;
    }
}
