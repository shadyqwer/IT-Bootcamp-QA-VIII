package javazadaci;

import java.util.Scanner;

/*
Napisati FUNKCIJU(METOD) koji u prosleđenom tekstu briše sve razmake, a svako slovo a pretvara u veliko slovo.
Primer:Java je super -> JAvAjesuper

 */
public class Zadatak4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite string: ");
        String s = input.nextLine();
        System.out.println(deleteBlanks("Java  je super"));
        System.out.println(deleteBlanks(s));
        input.close();
    }

    public static void deleteBlanksVoid(String s) {
        System.out.println(s.replaceAll(" ", "").replaceAll("a", "A"));
    }
    public static String deleteBlanks(String s) {
        return s.replaceAll(" ", "").replaceAll("a", "A");
    }
}
