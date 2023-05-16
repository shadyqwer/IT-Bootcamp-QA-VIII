package javazadaci;

import java.util.Scanner;

/*
Za uneti redni broj dana u godini preko konzole, odrediti kojoj nedelji pripada.
Primer: 75
Nedelja: 11

 */
public class Zadatak2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day;

        do {
            System.out.print("Unesite redni broj dana: 1 - 366: ");
            day = input.nextInt();
        } while (day <= 0 || day >= 367);

        int week;
        if (day % 7 == 0) {
            week = day / 7;
        } else {
            week = day / 7 + 1;
        }
        System.out.println("Nedelja: " + week);
        input.close();
    }
}
