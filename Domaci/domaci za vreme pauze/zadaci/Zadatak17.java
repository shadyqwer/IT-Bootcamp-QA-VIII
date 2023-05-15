package zadaci;

import java.util.Scanner;

/*
Napisati program koji ce učitati elemente i naći najveći element niza.
 */
public class Zadatak17 {
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
        double[] arr = new double[n];
        double najveci = Double.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.print("Unestie sledeci element: ");
            arr[i] = input.nextInt();
            if (arr[i] > najveci) {
                najveci = arr[i];
            }
        }
        System.out.println("Najveci element je: " + najveci);
        //
        double[] arr1 = {1.5, 2.5, 3.5, 10, 100.15};
        System.out.println(najveciElement(arr1));
    }
    // funkcija nije potrebna posto mozemo tokom unosa uporedo da nalazimo najveci
    public static double najveciElement(double[] arr) {
        double najveci = Double.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > najveci) {
                najveci = arr[i];
            }
        }
        return najveci;
    }
}
