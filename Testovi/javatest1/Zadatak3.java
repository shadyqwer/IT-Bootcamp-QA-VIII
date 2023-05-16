package javatest1;

import java.util.Scanner;

/*
Napisati program koji od korisnika traži unos sekundi, a kao rezultat obrade štampa
koliko je to sati, minuta i sekundi u formatu (sati:minuti:sekunde).
1 sat ima 3600 sekundi.
1 minut ima 60 sekundi.
Primeri ispisa u konzoli:
Molimo Vas unesite trajanje u sekundama
56428
Trajanje (sati:minuti:sekunde): 15hrs:40min:28sec
 */

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Molimo Vas unesite trajenje u sekundama: ");
        int seconds = input.nextInt();
        if (seconds < 0) {
            System.out.println("Unos mora biti pozitivan broj.");
        } else {
            int hours = seconds / 3600;
            seconds %= 3600;

            int minutes = seconds / 60;
            seconds %= 60;

            System.out.printf("Trajanje (sati:minuti:sekunde): %dhrs:%dmin:%dsec.%n", hours, minutes, seconds);
        }
        input.close();
    }
}
