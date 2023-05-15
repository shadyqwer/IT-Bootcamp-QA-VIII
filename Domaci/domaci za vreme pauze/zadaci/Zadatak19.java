package zadaci;

import java.util.Scanner;

/*
Napisati metod za nalaženje minimuma od dva učitana broja (a, b) sa tastature.
Izvršiti dodeljivanje vrednosti metoda varijabli c.

 */
public class Zadatak19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        double a = input.nextDouble();
        System.out.print("Unesite drugi broj: ");
        double b = input.nextDouble();
        double c = minimumDvaBroja(a, b);
        System.out.println(c);

    }

    public static double minimumDvaBroja(double a, double b) {
        if (a < b) {
            return a;
        }
        return b;
    }
}
