package zadaci;

import java.util.Scanner;

/*
Napisati program koji od dva učitana broja (a, b) sa tastature nalazi veći.

 */
public class Zadatak2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        double num1 = input.nextDouble();
        System.out.print("Unesite drugi broj: ");
        double num2 = input.nextDouble();

        if (num1 > num2) {
            System.out.println("Prvi broj je veci. " + num1);
        } else if (num2 > num1) {
            System.out.println("Drugi broj je veci. " + num2);
        } else {
            System.out.println("Brojevi su jednaki.");
        }
        input.close();
    }
}
