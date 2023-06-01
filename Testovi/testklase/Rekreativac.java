package testklase;

public class Rekreativac extends Clan {
    private int maksimalnoPonavljanja;
    private int maksimalnoOpterecenje;

    public Rekreativac() {

    }

    public Rekreativac(String id, String ime, String prezime, double visina, double tezina, int maksimalnoPonavljanja, int maksimalnoOpterecenje) {
        super(id, ime, prezime, visina, tezina);
        setMaksimalnoPonavljanja(maksimalnoPonavljanja);
        setMaksimalnoOpterecenje(maksimalnoOpterecenje);
    }

    public int getMaksimalnoPonavljanja() {
        return maksimalnoPonavljanja;
    }

    public void setMaksimalnoPonavljanja(int maksimalnoPonavljanja) {
        if (maksimalnoPonavljanja > 0) {
            this.maksimalnoPonavljanja = maksimalnoPonavljanja;
        } else {
            System.out.println("Broj ponavljanja mora biti pozitivan.");
        }
    }

    public int getMaksimalnoOpterecenje() {
        return maksimalnoOpterecenje;
    }

    public void setMaksimalnoOpterecenje(int maksimalnoOpterecenje) {
        if (maksimalnoOpterecenje > 0) {
            this.maksimalnoOpterecenje = maksimalnoOpterecenje;
        } else {
            System.out.println("Maksimalno opterecenje mora biti pozitivno.");
        }
    }

    @Override
    public void prikaziProfil() {
        System.out.println("Rekreativac: (" + super.id + " " + super.ime + " " + super.prezime +
                ")\nMaksimalno opterecenje: (" + this.maksimalnoOpterecenje + ")");
    }

    @Override
    public boolean postignutCilj(Sprava sprava) {
        return this.maksimalnoOpterecenje >= sprava.getTezinaRada() && this.maksimalnoPonavljanja > 3;
    }
}
