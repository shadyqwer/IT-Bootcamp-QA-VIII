package zadaci;

/*
Kreirati metodu koja računa prizvod dva broja, vraća rezultat u main, duplira i ispisuje.

 */
public class Zadatak20 {
    public static void main(String[] args) {
        double a = 15.5;
        double b = 22.25;
        double c = proizvodDvaBroja(a, b);
        c *= 2;
        System.out.println(c);
    }

    public static double proizvodDvaBroja(double num1, double num2) {
        return num1 * num2;
    }
}
