package zadaci;

import java.util.Scanner;

/*
Napisati program koji ce nakon unosa sa tastature da ispisuje 3 puta u 3 reda IME sa razmakom.
IME IME IME
IME IME IME
IME IME IME
 */
public class Zadatak10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite ime: ");
        String ime = input.nextLine();
        int n = 3;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(ime + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
