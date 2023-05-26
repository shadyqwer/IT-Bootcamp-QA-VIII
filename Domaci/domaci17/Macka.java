package domaci17;

public class Macka extends Zivotinja {
    private double tezina;

    public Macka() {

    }

    public Macka(String ime, String nadimak, double tezina) {
        super(ime, nadimak);
        this.tezina = tezina;
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }

    public String isChunk() {
        if (tezina > 5) {
            return "I'm a chunk.";
        } else {
            return "I'm not a chunk.";
        }
    }

    @Override
    public String zvuk() {
        return "Meow";
    }

    @Override
    public String toString() {
        return ime + "(" + nadimak + "). " + isChunk() + " " + zvuk() + " " + zvuk() + " " + zvuk();
    }
}
