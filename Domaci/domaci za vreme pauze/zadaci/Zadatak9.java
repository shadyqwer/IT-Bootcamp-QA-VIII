package zadaci;

import java.util.Scanner;

/*
Napisati program koji ce učitati sa tastature visine za n osoba. Ispisati prosečnu i najveću visinu.

 */
public class Zadatak9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite broj osoba: ");
        int brojOsoba = input.nextInt();
        double ukupnaVisina = 0;
        double maksVisina = Double.MIN_VALUE;
        for(int i = 0; i < brojOsoba; i++) {
            System.out.print("Unesite visinu za osobu broj " + (i + 1) + ": ");
            double visina = input.nextDouble();
            ukupnaVisina += visina;
            if (visina > maksVisina) {
                maksVisina = visina;
            }
        }
        double prosecnaVisina = ukupnaVisina / brojOsoba;
        System.out.println("Prosecna visina je: " + prosecnaVisina);
        System.out.println("Najveca visina je: " + maksVisina);
        input.close();
    }
}
