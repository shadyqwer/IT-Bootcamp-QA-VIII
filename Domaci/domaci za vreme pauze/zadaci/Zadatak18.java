package zadaci;

/*
Metod povrsina računa i vraća u main povrsinu pravougaonika (a*b).
Main poziva metod povrsina(a,b) i ispisuje površine pravougaonika. Pozvati 3 puta metod sa razlicitim vrednostima.

 */
public class Zadatak18 {
    public static void main(String[] args) {
        System.out.println(povrsina(5, 10));
        System.out.println(povrsina(1.5, 4.77));
        System.out.println(povrsina(2.9, 2.6));
    }
    public static double povrsina(double a, double b) {
        return a * b;
    }
}
