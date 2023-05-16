package javatest1;

import java.util.Scanner;

/*
Napisati program koji od korisnika traži unos 2 cela broja, a zatim da nađe koji je
manji broj.
Primeri ispisa u konzoli:
Unesite prvi broj
15
Unesite drugi broj
10
Manji broj je 10
 */
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        int num1 = input.nextInt();
        System.out.println("Unesite drugi broj: ");
        int num2 = input.nextInt();

        if (num1 < num2) {
            System.out.println("Manji broj je " + num1);
        } else {
            System.out.println("Manji broj je " + num2);
        }
        input.close();
    }
}
