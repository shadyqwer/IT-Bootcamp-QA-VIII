package javazadaci;

import java.util.Arrays;

/*
Implementirati metodu koja pretvara niz od String podataka u niz u kome su svi stringovi mala slova.
 {"Stefan", "Dusan", "Ana"} -> {"stefan", "dusan", "ana"}
  {"ZDRAVO JA SAM PROGRAM"} -> {"zdravo ja sam program"}
  {"ZDRAVO JA", "SAM PROGRAM"} -> {"zdravo ja", "sam program"}
{} -> {}

 */
public class Zadatak12 {
    public static void main(String[] args) {
        String[] arr = {"Stefan", "Dusan", "Ana"};
        String[] arr1 = {"ZDRAVO JA SAM PROGRAM"};
        System.out.println(Arrays.toString(svaMalaSlova(arr)));
        System.out.println(Arrays.toString(svaMalaSlova(arr1)));
    }
    public static String[] svaMalaSlova(String[] arr) {
        String[] arr1 = new String[arr.length];
        for(int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i].toLowerCase();
        }
        return arr1;
    }
}
