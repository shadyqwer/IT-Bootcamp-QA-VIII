package javatest1;

/*
Napisati metodu koja proverava i vraća odgovor na pitanje da li su dva
prosleđena celobrojna niza isti. Nizovi su isti samo ukoliko imaju isti broj
elemenata i ukoliko su vrednosti elemenata na istim pozicijama jednake.
Program testirati za proizvoljan niz, nije neophodan unos sa tastature. Nije
dozvoljeno korišćenje Arrays.equals metode.
 */
public class Zadatak5 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 3, 4, 10, 11};
        int[] arr4 = {};
        int[] arr5 = {1, 2, 3, 4, 6};


        System.out.println(sameArraysBoolean(arr1, arr2)); // true
        System.out.println(sameArraysBoolean(arr4, arr4)); // true
        System.out.println(sameArraysBoolean(arr2, arr3)); // false
        System.out.println(sameArraysBoolean(arr1, arr4)); // false
        System.out.println(sameArraysBoolean(arr1, arr5)); // false

        sameArraysVoid(arr1, arr2); // true
        sameArraysVoid(arr4, arr4); // true
        sameArraysVoid(arr2, arr3); // false
        sameArraysVoid(arr1, arr4); // false
        sameArraysVoid(arr1, arr5); // false

    }

    public static boolean sameArraysBoolean(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // void varijanta koja odmah ispisuje odgovor
    public static void sameArraysVoid(int[] arr1, int[] arr2) {
        int i = -1; // zbog kasnije provere van loop-a, zadnji if se izvrsava uvek pa -1 jer duzina niza ne moze biti -1
        if (arr1.length != arr2.length) {
            System.out.println("Nizovi nisu isti.");
        } else {
            for (i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    System.out.println("Nizovi nisu isti.");
                    break;
                }
            }
        }
        // ako su svi elementi isti petlja ce se zavrsiti i i ce biti jednako duzini niza.
        // treba nam ovaj if jer za razliku od boolean metoda ovde se metoda nastavlja i nakon break-a iz for petlje.
        if (i == arr1.length) {
            System.out.println("Nizovi su isti.");
        }
    }
}
