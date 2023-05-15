package zadaci;

import java.util.Scanner;

/*
Napisati program koji ce učitati elemente niza i ispisati elemente niza u obrnutom redosledu.

 */
public class Zadatak16 {
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
        int arr1[] = {1, 2, 3, 4, 5};

        ispisiNizObrnuto(arr);
        ispisiNizObrnuto(arr1);
        input.close();
    }
    public static void ispisiNizObrnuto(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
