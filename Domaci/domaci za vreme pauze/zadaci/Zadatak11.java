package zadaci;
/*
Napisati program koji ce nakon unosa sa tastature ispisati pravougaoni trougao kao na slici sa proizvoljnim brojem redova:

 */

import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite broj redova: ");
        int brojRedova = input.nextInt();
        // string
        String zvezdice = "*";
        for (int i = 0; i < brojRedova; i++) {
            System.out.println(zvezdice);
            zvezdice += "*";
        }
        // nested for
        for (int i = 0; i < brojRedova; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
