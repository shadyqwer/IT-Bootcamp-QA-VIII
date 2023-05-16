package javatest1;

import java.util.Scanner;

/*
Napisati program koji od korisnika traži unos 2 cela broja i tekst (String) za izbor
operacije (+, -, *, /). U zavisnosti od unosa, prikazati rezultat izabrane operacije.
Primeri ispisa u konzoli:
Unesite prvi broj
10
Unesite drugi broj
5
Unesite operaciju (+, -, /, *)
/
Rezultat je 2
 */
public class Zadatak2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        int num1 = input.nextInt();
        System.out.println("Unesite drugi broj: ");
        int num2 = input.nextInt();

        input.nextLine();
        System.out.println("Unesite operaciju (+, -, /, *): ");
        String operator = input.nextLine();

        switch (operator) {
            case "+":
                System.out.println("Rezultat je: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Rezultat je: " + (num1 - num2));
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Deljenje nulom nije moguce.");
                } else {
                    System.out.println("Rezultat je: " + (double) (num1 / num2));
                }
                break;
            case "*":
                System.out.println("Rezultat je: " + (num1 * num2));
                break;
            default:
                System.out.println("Nevazeci operator, pokusajte ponovo.");
                break;
        }
        input.close();
    }
}
