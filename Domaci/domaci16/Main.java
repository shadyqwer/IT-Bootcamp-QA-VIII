package domaci16;
/*
Napraviti static metodu u main koje rade kao sql min, max, sum, avg i distinct u SQLu koristeci ArrayList<Integer>.
Ne morate praviti drugu klasu sem main, a metode prihvataju ArrayList<Integer> kao parametar.
Distinct vraća novi ArrayList<Integer> dok ostale metode imaju povratne tipove tipa int (za min, max i sum) i double (za avg).

Napraviti klasu Konverter koja kao atribute ima rsd i valutu.
Valuta je enum, dok je rsd celi broj. Valuta treba da bude jedna od:
EUR, USD, AUD, CAD, RUB i GBP.

Kroz konstruktor se unose vrednosti za dinare (rsd) i valutu, i postoje seteri, ali ne postoje geteri.
Napraviti metodu koja služi za konvertovanje valute u onu koja je prosleđena kroz konstruktor ili seter.
Znači rsd pretvara u tu neku valutu. U metodi koristiti iif else ili switch za poređenje.
Pogledati kako se porede enum-i u javi najpravilnije. U main-u testirati tako što će te napraviti jedan objekat tipa Konverter i isprobati za sve valute.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        // niz sa 10 random broja od -10 do 10, mali range zbog provere distinct-a
        for (int i = 0; i < 10; i++) {
            array.add((int) (Math.random() * 21) - 10);
        }
        System.out.println("Svi elementi niza " + array);
        System.out.println("Najmanji element je: " + min(array));
        System.out.println("Najveci element je: " + max(array));
        System.out.println("Suma elemenata je: " + sum(array));
        System.out.println("Prosecna vrednost niza je: " + avg(array));
        System.out.println("Unikatni elementi niza su: " + distinct(array));
        System.out.println("---------------");

        Konverter konverter = new Konverter();
        konverter.setRsd(15000);
        // System.out.println(Arrays.toString(Valuta.values()));
        // prolaz kroz svaku vrednost enum-a sa .values() metodom koja vraca Valuta[] niz
        for (Valuta valuta : Valuta.values()) {
            konverter.setValuta(valuta);
            konverter.konvertuj();
        }
    }

    public static int min(ArrayList<Integer> array) {
        int min = array.get(0);
        for (int num : array) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    public static int max(ArrayList<Integer> array) {
        int max = array.get(0);
        for (int num : array) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

    public static int sum(ArrayList<Integer> array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static double avg(ArrayList<Integer> array) {
        // avg je suma kroz broj elemenata
        // sum metodu vec imamo pa je mozemo upotrebiti
        return (double) sum(array) / array.size();
    }

    public static ArrayList<Integer> distinct(ArrayList<Integer> array) {
        ArrayList<Integer> distinct = new ArrayList<>();
        for (int num : array) {
            if (!distinct.contains(num)) {
                distinct.add(num);
            }
        }
        return distinct;
    }
}
