package javazadaci;

import java.util.Arrays;
import java.util.Scanner;


/*
Napisati program koji od korisnika zahteva da unese broj elemenata niza n,
a zatim kreirati niz A od n slučajnih brojeva iz intervala 0, 250 i niz B od n slučajnih brojeva iz intervala 10, 1000.
Napisati metod koji kreira i vraća novi niz C koji sadrži sve elemente niza A i sve parne elemente niza B.
Primer:  {9, 16,11,12,14,77,24,125}, {4, 320,8,12,120,45,22, 33}
→ {9, 16, 11, 12, 14, 77, 24, 125, 4, 320, 8, 12, 120, 22}
 */
public class Zadatak5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Unesite broj elemenata niza: ");
        while (true) {
            n = input.nextInt();
            if (n <= 0) {
                System.out.print("Uneli ste broj elemenata manjih od 0, unesite ponovo: ");
            } else {
                break;
            }
        }
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i = 0; i < A.length; i++) {
            // Math.random() * (max - min) + min;
            A[i] = (int) (Math.random() * 251);
            B[i] = (int) (Math.random() * 991 + 10);
//            if (A[i] == 250) {
//                System.out.println(A[i]);
//            }
//            if (B[i] == 1000) {
//                System.out.println(B[i]);
//            }
//            if (A[i] == 0) {
//                System.out.println(A[i]);
//            }
//            if (B[i] == 10) {
//                System.out.println(B[i]);
//            }
//            if (A[i] > 250 || B[i] > 1000 || A[i] < 0 || B[i] < 10) {
//                System.out.println("Greska");
//            }

        }
        System.out.println(Arrays.toString(createAndPrint(A, B)));
        input.close();
    }

    public static int[] createAndPrint(int[] A, int[] B) {
        int cLen = 0;
        for (int i = 0; i < B.length; i++) {
            if (B[i] % 2 == 0) {
                cLen++;
            }
        }
        cLen += A.length;

        int[] C = new int[cLen];
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }

        int cInx = A.length;
        for (int i = 0; i < B.length; i++) {
            if (B[i] % 2 == 0) {
                C[cInx++] = B[i];
            }
        }
        return C;
    }
}
