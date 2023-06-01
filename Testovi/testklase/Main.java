package testklase;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Teretana teretana = new Teretana();
        teretana.setNaziv("Leskovac");
        teretana.setGodinaOsnivanja(1900);

        Rekreativac rekreativac1 = new Rekreativac("01", "Petar", "Petrovic", 190, 80, 15, 80);
        Rekreativac rekreativac2 = new Rekreativac("02", "Marko", "Markovic", 185, 90, 10, 50);
        Rekreativac rekreativac3 = new Rekreativac("03", "Janko", "Jankovic", 200, 100, 20, 80);
        Rekreativac rekreativac4 = new Rekreativac("04", "Stanko", "Stankovic", 170, 70, 5, 30);

        Trener trener1 = new Trener("10", "Milos", "Stamenkovic", 180, 75, 10);

        ArrayList<Clan> clanovi = new ArrayList<>(Arrays.asList(rekreativac1, rekreativac2, rekreativac3, rekreativac4, trener1));
        teretana.setClanovi(clanovi);

        Sprava sprava1 = new Sprava("teg50", "tegovi od 50kg", 80);

        rekreativac1.prikaziProfil();
        System.out.println("BMI " + rekreativac1.ime + " " + rekreativac1.racunajBMI());
        System.out.println("--------------");
        trener1.prikaziProfil();
        System.out.println("BMI " + trener1.ime + " " + trener1.racunajBMI());
        System.out.println("--------------");


        System.out.println("Broj clanova koji ce uspesno savladati vezbu: " + teretana.brojPostignutihCiljeva(sprava1));
        System.out.println("Broj clanova koji ce uspesno savladati vezbu: " + teretana.brojPostignutihCiljeva(sprava1, clanovi));
    }
}
