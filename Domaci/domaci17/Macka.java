package domaci17;

public class Macka extends Zivotinja {
    private double tezina;

    public Macka() {

    }

    public Macka(String ime, String nadimak, double tezina) {
        super(ime, nadimak);
        setTezina(tezina);
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        if (tezina <= 0) {
            this.tezina = tezina;
        } else {
            System.out.println("Tezina ne moze biti 0 ili negativna.");
        }
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
