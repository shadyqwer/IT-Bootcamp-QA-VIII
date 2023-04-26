package domaci9;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Unesite temperaturu u celzijusima u celobrojnom obliku: ");
        int celzijus = input.nextInt();

        double farenhajt = 1.8 * celzijus + 32;
        System.out.printf("%dC = %.1fF.", celzijus, farenhajt);
        input.close();
    }
}
