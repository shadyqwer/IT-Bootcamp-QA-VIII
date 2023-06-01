package testklase;

import java.util.ArrayList;

public class Teretana {
    private String naziv;
    private int godinaOsnivanja;
    private ArrayList<Clan> clanovi = new ArrayList<>();

    public Teretana() {

    }

    public Teretana(String naziv, int godinaOsnivanja, ArrayList<Clan> clanovi) {
        this.naziv = naziv;
        this.godinaOsnivanja = godinaOsnivanja;
        this.clanovi = clanovi;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }

    public void setGodinaOsnivanja(int godinaOsnivanja) {
        this.godinaOsnivanja = godinaOsnivanja;
    }

    public ArrayList<Clan> getClanovi() {
        return clanovi;
    }

    public void setClanovi(ArrayList<Clan> clanovi) {
        this.clanovi = clanovi;
    }

    // za clanove iz teratane
    public int brojPostignutihCiljeva(Sprava sprava) {
        int postigliCilj = 0;
        for (Clan clan : this.clanovi) {
            if (clan.postignutCilj(sprava)) {
                postigliCilj++;
            }
        }
        return postigliCilj;
    }

    // za prosledjenu listu clanova
    public int brojPostignutihCiljeva(Sprava sprava, ArrayList<Clan> listaClanova) {
        int postigliCilj = 0;
        for (Clan clan : listaClanova) {
            if (clan.postignutCilj(sprava)) {
                postigliCilj++;
            }
        }
        return postigliCilj;
    }

    @Override
    public String toString() {
        return "Teretana: " + this.naziv + ", osnovana je: " + this.godinaOsnivanja + ".";
    }
}
