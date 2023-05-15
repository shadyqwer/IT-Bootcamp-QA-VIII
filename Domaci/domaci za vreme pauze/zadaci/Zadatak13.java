package zadaci;

import java.util.Scanner;

/*
Napisati program za ispis kvadrata prirodnih brojeva
do n unetih sa tastature (while petlja).

 */
public class Zadatak13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite prirodni broj n: ");
        int n = input.nextInt();
        int i = 1;
        while(i < n) {
            System.out.print(i * i + " "); // Math.pow(i, 2);
            i++;
        }
        input.close();
    }
}
