package zadaci;

import java.util.Scanner;

/*
Napisati program koji ce da nađe proizvod prirodnih brojeva unetih sa tastature od a do b deljivih sa 5 i koliko ih ima.
 */
public class Zadatak7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        int prviBroj = input.nextInt();
        int drugiBroj;
        do {
            System.out.print("Unesite drugi broj, veci od: " + prviBroj + ": ");
            drugiBroj = input.nextInt();
        } while (drugiBroj < prviBroj);
        long proizvod = 1;
        int count = 0;
        for (int i = prviBroj; i <= drugiBroj; i++) {
            if (i % 5 == 0) {
                proizvod *= i;
                count++;
            }
        }
        System.out.println("Proizvod brojeva deljivih sa 5 u datom rasponu je: " + proizvod);
        System.out.println("Brojeva deljivih sa 5 ima ukupnp: " + count);
        input.close();

    }
}
