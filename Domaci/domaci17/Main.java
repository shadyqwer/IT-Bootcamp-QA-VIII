package domaci17;
/*
1. Napraviti apstraktnu klasu koja će da predstavlja životinju. životinja treba da ima ime, nadimak i abstraktnu metodu koja predstavlja zvuk koji životinja pravi.
Napraviti klase pas i mačka koje nasleđuju životinju. Pas ima dodatni atribut boolean goodBoy i metodu koja ispisuje “I am a good boy” ili “I am a bad boy” u zavisnosti od toga da li je promenljiva goodBoy true ili false.
Mačka ima atribut za težinu i metodu koja ispisuje “I’m a chonk” ili “I’m not a chonk” u zavisnosti da li je težina preko 5kg.
U obe klase implementirati toString, gde u oba slučaja se ispisuje ime i nadimak. U klasi mačka dodati na toString da ispisuje još da li je chonk ili nije,
a u klasi pas da li je good boy ili ne (u oba slučaja pozivanjem konkretne metode). U konkretnim klasama implementirati metodu za zvuk koji životinja pravi, za mačku da vraća string “meow” a za psa “woof”.
I poziv te metode dodati u toString. U main metodi napraviti nekoliko mačaka i pasa. Staviti ih u listu i kroz petlju proći sve elemente,
za pse ispisati “dog: “ i dodati od psa toString a ako je mačka napisati “cat: “ i isto toString. Za ovo koristite instanceof.

2. Napraviti klasu koja predstavlja računar. Računar ima broj procesora, količinu ram memorije i količinu memorije. Ima toString metodu implementiranu kao
"Broj procesora: 4, ram: 16GB, memorija: 512GB". Napraviti klasu laptop koja nasleđuje računar i ima dodatno polja za veličinu ekrana i enum za tastaturu (da li je internacionalna ili US).
Isto implementirati toString, samo dodati još veličinu ekrana i tastaturu kao:  "Broj procesora: 4, ram: 16GB, memorija: 512GB, ekran: 15.6", tastatura: INTERNATIONAL"
Napraviti klasu mobilni telefon koji nasleđuje računar i ima dodatno polja za jačinu kamere u megapikselima i enum za mrežu koju podržava (3G, 4G, 5G).
Implementirati toString metodu da ispisuje "Broj procesora: 8, ram: 6GB, memorija: 128GB, kamera: 32Megapixela, mreza: 5G". U main metodi napraviti listu računara,
provući kroz jednu petlju i ispisati klasu kojoj objekat pripada (Da li je laptop ili mobilni)

 */
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadatak 1.");
        Pas pas1 = new Pas("Kuce", "Dzeki", true);
        Pas pas2 = new Pas("Pas", "Lesi", false);
        Pas pas3 = new Pas("Maks", "Pobesneli", false);
        Macka macka1 = new Macka("Garfild", "Lazanja", 266);
        Macka macka2 = new Macka("Tom", "Dzeri", 4.5);

        ArrayList<Zivotinja> zivotinje = new ArrayList<>();
        zivotinje.addAll(Arrays.asList(pas1, pas2, pas3, macka1, macka2));
//        zivotinje.add(pas1);
//        zivotinje.add(pas2);
//        zivotinje.add(pas3);
//        zivotinje.add(macka1);
//        zivotinje.add(macka2);

        for (Zivotinja zivotinja : zivotinje) {
            if (zivotinja instanceof Pas) {
                System.out.println("Dog: " + zivotinja);
            } else if (zivotinja instanceof Macka) {
                System.out.println("Cat: " + zivotinja);
            }
        }
        System.out.println("------------------------------------");
        System.out.println("Zadatak 2.");

        MobilniTelefon mobilni1 = new MobilniTelefon(8, 32, 512, 64, Mreza.G5);
        MobilniTelefon mobilni2 = new MobilniTelefon(2, 4, 32, 8, Mreza.G3);
        MobilniTelefon mobilni3 = new MobilniTelefon(4, 16, 124, 16, Mreza.G4);
        Laptop laptop1 = new Laptop(4, 12, 256, 15.6, Tastatura.US);
        Laptop laptop2 = new Laptop(8, 64, 1024, 17.3, Tastatura.INTERNATIONAL);

        ArrayList<Racunar> racunari = new ArrayList<>();
        racunari.addAll(Arrays.asList(mobilni1, mobilni2, mobilni3, laptop1, laptop2));
//        racunari.add(mobilni1);
//        racunari.add(mobilni2);
//        racunari.add(mobilni3);
//        racunari.add(laptop1);
//        racunari.add(laptop2);

        for (Racunar racunar : racunari) {
            if (racunar instanceof Laptop) {
                System.out.println("Uredjaj je laptop: " + racunar);
            } else if (racunar instanceof MobilniTelefon) {
                System.out.println("Uredjaj je mobilni telefon: " + racunar);
            }
        }
    }
}
