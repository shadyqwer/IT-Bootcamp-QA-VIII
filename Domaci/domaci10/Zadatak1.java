package domaci10;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite godinu: ");
        int godina = input.nextInt();

        if ((godina % 4 == 0 && godina % 100 != 0) || godina % 400 == 0) {
            System.out.println("Godina je prestupna");
        } else {
            System.out.println("Godina nije prestupna");
        }
        input.close();
    }
}
