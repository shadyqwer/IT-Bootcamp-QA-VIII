package javazadaci;
/*
Implementirati metodu koja vraca sumu svih elemenata niza, i to tako da je svaki element pomnozen sa indeksom na kojim se nalazi.
  {1, 2, 3, 4, ...} -> (1 * 0) + (2 * 1) + (3 * 2) + (4 * 3) + ...
  {99} -> 99 * 0
  {} -> 0

 */
public class Zadatak11 {
    public static void main(String[] args) {
        System.out.println(sumaNiza(new double[]{1.5, 2.5, 3, 4, 5}));
    }
    public static double sumaNiza(double[] arr) {
        double suma = 0;
        for(int i = 0; i < arr.length; i++) {
            suma += arr[i] * i;
        }
        return suma;
    }
}
