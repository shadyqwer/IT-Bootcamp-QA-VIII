package domaci17;

public class Pas extends Zivotinja {
    private boolean goodBoy;

    public Pas () {

    }

    public Pas(String ime, String nadimak, boolean goodBoy) {
        super(ime, nadimak);
        this.goodBoy = goodBoy;
    }

    public boolean isGoodBoy() {
        return goodBoy;
    }

    public void setGoodBoy(boolean goodBoy) {
        this.goodBoy = goodBoy;
    }

    public String goodBad() {
        if(goodBoy) {
            return "I am a good boy.";
        } else {
            return "I am a bad boy.";
        }
    }

    @Override
    public String zvuk() {
        return "Woof";
    }

    @Override
    public String toString() {
        return ime + "(" + nadimak + "). " + goodBad() + " " + zvuk()+ " " + zvuk()+ " " + zvuk();
    }
}
