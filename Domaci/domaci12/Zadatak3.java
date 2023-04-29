package domaci12;

public class Zadatak3 {
    public static void main(String[] args) {
        char[] arr1 = {'h', 'e', 'l', 'l', 'o'};
        char[] arr2 = {'w', 'o', 'r', 'l', 'd', '.'};
        if (arr1.length > arr2.length) {
            System.out.println("Prvi niz ima vise clanova.");
        } else if (arr2.length > arr1.length) {
            System.out.println("Drugi niz ima vise clanova.");
        } else {
            System.out.println("Nizovi imaju isti broj clanova.");
        }
    }
}
