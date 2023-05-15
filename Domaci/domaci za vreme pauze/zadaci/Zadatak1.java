package zadaci;

import java.util.Scanner;

/*
Napisati program za odredjivanje apsolutne vrednosti broja koji unesete sa tastature.

 */
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        double broj = input.nextDouble();
        // double broj = Math.abs(input.nextDouble());
        if (broj < 0) {
            broj *= -1;
        }
        System.out.println("Apsolutna vrednost broja je : " + broj);
        input.close();
    }
}
