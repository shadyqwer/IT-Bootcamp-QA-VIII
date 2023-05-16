package javazadaci;
/*
  Implementirati metodu koja vraca indeks na koji treba ubaciti element, tako da je redosled elemenata sacuvan. Pretpostaviti da je niz rastuci.
  ({1, 2, 3, 4, 5}, 1.5) -> 1
  ({77, 78, 79, 80, 81}, 76.999999) -> 0
  ({-11, -10, -9, -8, -7}, 7) -> 5

 */
public class Zadatak13 {
    public static void main(String[] args) {
        System.out.println(indexNovogElementa(new double[]{1, 2, 3, 4, 5}, 1.5));
        System.out.println(indexNovogElementa(new double[]{77, 78, 79, 80, 81}, 76.999999));
        System.out.println(indexNovogElementa(new double[] {-11, -10, -9, -8, -7}, 7));
    }
    public static int indexNovogElementa(double[] arr, double element) {
        if (element < arr[0]) {
            return 0;
        } else if (element > arr[arr.length-1]) {
            return arr.length;
        } else {
            for(int i = 0; i < arr.length; i++) {
                if(element > arr[i] && element < arr[i+1]) {
                    return i + 1;
                }
            }
        }
        return -1;
    }
}
