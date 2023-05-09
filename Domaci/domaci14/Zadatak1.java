package domaci14;

import java.util.Arrays;
import java.util.Scanner;

/*
Napraviti metodu koja ispisuje niz i kao parametre prihvata niz.
Unutar metode pronaći najveću vrednost u nizu,
a zatim tu vrednost postaviti kao vrednost svakog elementa u nizu.
Koristiti scanner za popunjavanje početnog niza. (3-4 poziva dovoljno).

 */
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite broj nizova: ");
        int arrNums = input.nextInt();

        if (arrNums > 0) {
            // inicijalizacija n praznih nizova
            int[][] arrays = new int[arrNums][];

            for (int i = 0; i < arrNums; ) {
                // kreiranje i. niza
                System.out.printf("Unesite broj elemenata %d. niza: ", (i + 1));
                int arrElements = input.nextInt();

                if (arrElements > 0) {
                    arrays[i] = new int[arrElements];

                    // popunjavanje i. niza
                    for (int j = 0; j < arrElements; j++) {
                        System.out.printf("Unesite %d. element: ", (j + 1));
                        arrays[i][j] = input.nextInt();
                    }
                    // pozivanje metode
                    arrPrintAndChange(arrays[i]);
                    i++;
                } else {
                    System.out.println("Broj elemenata mora biti veci od 0. Unesite ponovo.");
                }
            }
        } else {
            System.out.println("Broj nizova mora biti veci od 0.");
        }
        input.close();
    }

    public static void arrPrintAndChange(int[] arr) {
        // ispis
        System.out.println("Niz pre izmene: " + Arrays.toString(arr));
        // nalazenje maksimuma
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // popunjavanje niza
        Arrays.fill(arr, max);
        System.out.println("Niz posle izmene: " + Arrays.toString(arr));
    }
}
