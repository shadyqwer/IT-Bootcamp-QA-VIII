package domaci14;

import java.util.Scanner;

/*
Napraviti metodu koja radi konverziju valuta.
Valute koje se koriste su EUR, USD, GBP.
Napisati konverzije preko switch-a, tako sto proveravate koju je valutu korisnik uneo kao parametar,
a vracate (return) u toj nekoj novoj valuti izracunatu vrednost.
U main-u preko skenera korisnik unosi broj dinara koji zeli da konvertuje u neku valutu,
i samu valutu kao string. Ispisati nekoliko primera poziva u main-u.
Valute su vrednosti double i njih mozete uzeti sa sajta NBS. (3-4 poziva dovoljno).
 */

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dinara;
        do {
            System.out.print("Unesite iznos u dinarima za konverziju: ");
            dinara = input.nextDouble();
        } while (dinara < 0);  // dok se ne unese pozitivan broj
        System.out.println("Unesite zeljenu valutu: (EUR, USD, GBP)");
        input.nextLine();  // ocistimo '\n' nakon double unosa
        String valuta = input.nextLine();
        System.out.printf("Za %f dinara mozete kupiti %f %s-a.%n", dinara, valueConverter(dinara, valuta), valuta.toUpperCase());

        double din = 50000;
        System.out.printf("%f DIN = %f EUR.%n", din, valueConverter(din, "eur"));
        System.out.printf("%f DIN = %f USD.%n", din, valueConverter(din, "usd"));
        System.out.printf("%f DIN = %f GBP.%n", din, valueConverter(din, "gbp"));
    }

    public static double valueConverter(double amount, String value) {
        switch (value.toUpperCase()) {
            case "EUR":
                return amount / 117.2954;
            case "USD":
                return amount / 106.1977;
            case "GBP":
                return amount / 133.8683;
            default:
                return -1;
        }
    }
}
