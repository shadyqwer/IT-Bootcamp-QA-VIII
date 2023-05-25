package domaci16;

public class Konverter {
    private int rsd;
    private Valuta valuta;

    public Konverter() {

    }

    public Konverter(int rsd, Valuta valuta) {
        this.rsd = rsd;
        this.valuta = valuta;
    }

    public void setRsd(int rsd) {
        this.rsd = rsd;
    }

    public void setValuta(Valuta valuta) {
        this.valuta = valuta;
    }

    public void konvertuj() {
        // posto postoji samo ta jedna instanca enum-a sasvim je bezbedno i brze koristiti ==
        if (valuta == Valuta.EUR) {
            System.out.println(rsd + " RSD = " + (rsd / 117.2802) + " EUR");
        } else if (valuta == Valuta.USD) {
            System.out.println(rsd + " RSD = " + (rsd / 108.7741) + " USD");
        } else if (valuta == Valuta.AUD) {
            System.out.println(rsd + " RSD = " + (rsd / 71.7661) + " AUD");
        } else if (valuta == Valuta.CAD) {
            System.out.println(rsd + " RSD = " + (rsd / 80.5662) + " CAD");
        } else if (valuta == Valuta.GBP) {
            System.out.println(rsd + " RSD = " + (rsd / 135.2401) + " GBP");
        } else if (valuta == Valuta.RUB) {
            System.out.println(rsd + " RSD = " + (rsd / 1.3578) + " RUB");
        } else {
            System.out.println("Invalidna valuta.");
        }
    }
}
