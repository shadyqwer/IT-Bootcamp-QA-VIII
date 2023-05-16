package javatest1;

/*
Napisati metodu koja za neko slovo proverava i vraća odgovor na pitanje da li
je u pitanju samoglasnik ili ne. Program testirati za proizvoljno slovo, nije
neophodan unos sa tastature.
 */
public class Zadatak4 {
    public static void main(String[] args) {
        System.out.println(isVowel('a')); // true
        System.out.println(isVowel('E')); // true
        System.out.println(isVowel('T')); // false
        System.out.println(isVowel('r')); // false
        System.out.println(isVowel('m')); // false
        System.out.println(isVowel('d')); // false
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
