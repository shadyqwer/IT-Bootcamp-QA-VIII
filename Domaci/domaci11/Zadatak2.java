package domaci11;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num; // num = 1

        while (true) { // while (num != 0) nije potrebno jer imamo break
            System.out.print("Unesite sledeci broj (0 za kraj programa): ");
            num = input.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.printf("Zbir brojeva je: %d.%n", sum);
        input.close();
    }
}
