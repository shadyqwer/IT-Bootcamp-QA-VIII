package javazadaci;

import java.util.Scanner;

public class MiddleSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        long number = scanner.nextLong();
        char s;
        do {
            number = middleSquareGenerator(number);
            System.out.println("Your new number is: " + number);

            System.out.println("Continue (Y/n)? ");
            s = scanner.next().charAt(0);
        } while (s != 'N' && s != 'n');

        scanner.close();
    }

    public static long middleSquareGenerator(long number) {
        long squared = number * number;
        int length = 0;
        if (number < 0) {
            number *= -1;
        }
        while (number != 0) {
            length++;
            number /= 10;
        }

        long temp = squared;
        int squaredLenght = 0;
        while (temp != 0) {
            squaredLenght++;
            temp /= 10;
        }

        int diff = squaredLenght - length;
        int leftErase = diff / 2;
        int rightErase = diff / 2;
        if (diff % 2 == 1) {
            rightErase++;
        }

        for (int i = 0; i < leftErase; i++) {
            squared = (long) (squared % Math.pow(10, squaredLenght - 1));
            squaredLenght--;
        }

        for (int i = 0; i < rightErase; i++) {
            squared /= 10;
        }

        return squared;
    }

    public static long middleSquareGen(long number) {
        long squared = (long) Math.pow(number, 2);
        int length = String.valueOf(number).replace("-", "").length();
        int newNumLength = String.valueOf(squared).length();
        int diff = newNumLength - length;
        return Long.parseLong(String.valueOf(squared).substring(diff / 2, newNumLength - diff / 2 - (diff % 2 == 0 ? 0 : 1)));
    }
}
