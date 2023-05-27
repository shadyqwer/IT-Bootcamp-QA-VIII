package domaci17;

public class MobilniTelefon extends Racunar {
    private int megapikseli;
    private Mreza mreza;

    public MobilniTelefon() {

    }

    public MobilniTelefon(int brojProcesora, int ramMemorija, int memorija, int megapikseli, Mreza mreza) {
        super(brojProcesora, ramMemorija, memorija);
        this.megapikseli = megapikseli;
        this.mreza = mreza;
    }

    public int getMegapikseli() {
        return megapikseli;
    }

    public void setMegapikseli(int megapikseli) {
        this.megapikseli = megapikseli;
    }

    public Mreza getMreza() {
        return mreza;
    }

    public void setMreza(Mreza mreza) {
        this.mreza = mreza;
    }

    @Override
    public String toString() {
        return super.toString() + ", kamera: " + megapikseli + "Megapixela, mreza: " + mreza.getMreza();
    }
}
