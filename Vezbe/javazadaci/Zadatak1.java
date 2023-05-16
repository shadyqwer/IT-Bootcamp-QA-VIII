package javazadaci;
/*
Za uneta tri različita pozitivna broja A, B, i C preko konzole otkriti i ispisati vrednost koja se nalazi između druge dve.
Primer: Unesite prvi broj:  5
	Unesite drugi broj: 15
	Unesite treci broj: 2
	Rezultat je: 5
    9 6 7
 */

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        int num1 = input.nextInt();
        System.out.print("Unesite drugi broj: ");
        int num2 = input.nextInt();
        System.out.print("Unesite treci broj: ");
        int num3 = input.nextInt();
        if(num1 > 0 && num2 > 0 && num3 > 0 && num1 != num2 && num1 != num3) {
            if ((num1 > num2 && num1 < num3) || (num1 > num3 && num1 < num2)) {
                System.out.println(num1);
            } else if ((num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1)) {
                System.out.println(num2);
            } else {
                System.out.println(num3);
            }
        } else {
            System.out.println("Brojevi moraju biti pozitivni i razliciti.");
        }

// za pozitivne i iste brojevi
//            int middle;
//            int min = Math.min(Math.min(num1, num2), num3);
//            int max = Math.max(Math.max(num1, num2), num3);
//            if (num1 != max && num1 != min) {
//                middle = num1;
//            } else if (num2 != max && num2 != min) {
//                middle = num2;
//            } else if (num1 == num2) {
//                middle = num2;
//            } else {
//                middle = num3;
//            }
//            System.out.println(middle);
//
        input.close();
    }
}

