package domaci11;

public class Zadatak1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0) {
                System.out.printf("Broj %d je deljiv sa 3.%n", i);
            }
        }
    }
}
