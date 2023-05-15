package zadaci;

import java.util.Scanner;

/*
Napisati program za ispis uspeha za uneti broj sa tastature, prema sledećoj tabeli:
1-Nedovoljan, 2-Dovoljan, 3-Dobar, 4-Vrlo dobar, 5-Odlican.

 */
public class Zadatak3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite broj od 1 do 5: ");
        int uspeh = input.nextInt();
        switch (uspeh) {
            case 1:
                System.out.println("Neovoljan.");
                break;
            case 2:
                System.out.println("Dovoljan.");
                break;
            case 3:
                System.out.println("Dobar");
                break;
            case 4:
                System.out.println("Vrlo dobar");
                break;
            case 5:
                System.out.println("Odlican.");
                break;
            default:
                System.out.println("Nevalidan unos.");
                break;
        }
        input.close();
    }
}
