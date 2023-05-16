package javazadaci;

import java.util.Scanner;

/*
Napisati metodu koja u nizu celih brojeva pronalazi broj elemenata deljivih sa prosleđenim proizvoljnim brojem.
Primer:  niz = {5, 6, 8, 1, 2, 1, 2, 2, 20, 18, 19}
	  element = 4
	  Rezultat je: 2
 */
public class Zadatak3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Unesite broj elemenata niza: ");
        while (true) {
            n = input.nextInt();
            if (n <= 0) {
                System.out.print("Niz mora imati bar jedan element, unesite ponovo: ");
            } else {
                break;
            }
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite " + (i + 1) + " element niza: ");
            arr[i] = input.nextInt();
        }
        System.out.print("Unesite element koji trazimo: ");
        int element = input.nextInt();

        System.out.printf("Broj elemenata deljivih sa %d u nizu je %d.%n", element, divideCount(arr, element));

        input.close();
    }

    public static int divideCount(int[] arr, int n) {
        int count = 0;
        for (int num : arr) {
            if (num % n == 0) {
                count++;
            }
        }
        return count;
    }
}
