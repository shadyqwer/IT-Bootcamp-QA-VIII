package zadaci;

import java.util.Scanner;

/*
Napisati program koji ce učitati elemente niza i ispisati elemente niza sa neparnim indeksom.

 */
public class Zadatak15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Unesite broj clanova niza: ");
        do {
            n = input.nextInt();
            if (n <= 0) {
                System.out.print("Broj mora biti veci od 0. Unesite ponovo. ");
            }
        } while(n <= 0);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Unestie sledeci element: ");
            arr[i] = input.nextInt();
        }
        int[] arr1 = {1, 2, 3, 4, 5};
        ispisiNeparneIndekse(arr);
        ispisiNeparneIndekse(arr1);
        input.close();
    }
    public static void ispisiNeparneIndekse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                System.out.printf("Index %d: element: %d.%n", i, arr[i]);
            }
        }
    }
}
