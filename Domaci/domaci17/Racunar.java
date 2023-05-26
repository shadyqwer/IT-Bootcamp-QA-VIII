package domaci17;

public class Racunar {
    protected int brojProcesora;
    protected int ramMemorija;
    protected int memorija;

    public Racunar() {

    }

    public Racunar(int brojProcesora, int ramMemorija, int memorija) {
        this.brojProcesora = brojProcesora;
        this.ramMemorija = ramMemorija;
        this.memorija = memorija;
    }

    public int getBrojProcesora() {
        return brojProcesora;
    }

    public void setBrojProcesora(int brojProcesora) {
        this.brojProcesora = brojProcesora;
    }

    public int getRamMemorija() {
        return ramMemorija;
    }

    public void setRamMemorija(int ramMemorija) {
        this.ramMemorija = ramMemorija;
    }

    public int getMemorija() {
        return memorija;
    }

    public void setMemorija(int memorija) {
        this.memorija = memorija;
    }

    @Override
    public String toString() {
        return "Broj procesora: " + brojProcesora + ", ram: " + ramMemorija + "GB, memorija: " + memorija + "GB";
    }
}
