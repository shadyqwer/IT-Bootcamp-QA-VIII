package domaci13;

public class Zadatak1 {
    public static void main(String[] args) {
        System.out.println("Brojevi 14 i 15 su uzastopni: " + consecutiveNumbers(14, 15)); // true
        System.out.println("Brojevi 24 i 25 su uzastopni: " + consecutiveNumbers(24, 25)); // true
        System.out.println("Brojevi 99 i 98 su uzastopni: " + consecutiveNumbers(99, 98)); // true
        System.out.println("Brojevi 20 i 25 su uzastopni: " + consecutiveNumbers(20, 25)); // false
        System.out.println("Brojevi 50 i 41 su uzastopni: " + consecutiveNumbers(50, 41)); // false
        System.out.println("Brojevi 55 i 55 su uzastopni: " + consecutiveNumbers(55, 55)); // false
    }

    public static boolean consecutiveNumbers(int num1, int num2) {
        // return num1 == num2 - 1 || num2 == num1 - 1;
        if (num1 == num2 - 1 || num2 == num1 - 1) {
            return true;
        }
        return false;
    }
}
