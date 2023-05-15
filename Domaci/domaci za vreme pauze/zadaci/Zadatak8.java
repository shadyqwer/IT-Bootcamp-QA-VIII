package zadaci;

import java.util.Scanner;

/*
Napisati program koji ce izračunati aritmetičku sredinu parnih brojeva unetih sa tastature od k do n.

 */
public class Zadatak8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        int k = input.nextInt();
        int n;
        do {
            System.out.print("Unesite drugi broj, veci od: " + k + ": ");
            n = input.nextInt();
        } while (n < k);
        double sum = 0;
        int count = 0;
        for (int i = k; i <= n; i++) {
            if (i % 2 == 0) {
                count++;
                sum += i;
            }
        }

        double avg = sum / count;
        System.out.println("Aritmeticka sredina je: " + avg);
        input.close();
    }
}
