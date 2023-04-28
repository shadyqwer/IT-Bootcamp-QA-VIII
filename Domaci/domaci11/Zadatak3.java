package domaci11;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num = 0;

        do {
            sum += num;
            System.out.print("Unesite sledeci broj (0 ili manje za kraj programa): ");
            num = input.nextInt();
        } while(num > 0);
        System.out.printf("Zbir brojeva je %d.%n", sum);
        input.close();
    }
}
