package zadaci;

import java.util.Scanner;

/*
Napisati program za ispis prirodnih brojeva od 1 do 17 koji nisu djeljivi sa proizvoljno unetim brojem.

 */
public class Zadatak14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int n = input.nextInt();
        System.out.println("Brojevi od 1 do 17 koji nisu deljivi sa " + n + " su.");
        for (int i = 1; i < 17; i++) {
            if (i % n != 0) {
                System.out.print(i + " ");
            }
        }
        input.close();
    }
}
