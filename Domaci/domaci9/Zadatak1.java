package domaci9;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        final int TRENUTNA_GODINA = 2023;
        Scanner input = new Scanner(System.in);

        System.out.print("Unesite ime: ");
        String ime = input.nextLine();

        System.out.print("Unesite prezime: ");
        String prezime = input.nextLine();

        System.out.print("Unesite godinu rodjenja: ");
        int godinaRodjenja = input.nextInt();
        int godine = TRENUTNA_GODINA - godinaRodjenja;

        System.out.printf("Ime i prezime: %s %s.\nBroj godina: %d.", ime, prezime, godine);
        input.close();
    }
}
