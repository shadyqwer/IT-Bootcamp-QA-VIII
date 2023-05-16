package javazadaci;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite tezinu u kg: ");
        double tezina = input.nextDouble();
        System.out.print("Unesite visinu u metrima: ");
        double visina = input.nextDouble();
        double bmi = tezina / (visina * visina);

        if (bmi < 18.5) {
            System.out.println("Kategorija je Neuhranjenost.");
        } else if (bmi < 25) {
            System.out.println("Kategorija je Normalna tezina.");
        } else if (bmi < 30) {
            System.out.println("Kategorija je Prekomerna tezina.");
        } else {
            System.out.println("Kategorija je Gojaznost.");
        }
    }
}
