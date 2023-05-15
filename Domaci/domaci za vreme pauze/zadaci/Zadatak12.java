package zadaci;

import java.util.Scanner;

/*
Napisati program koji ce ispisati parne prirodne brojeve od 1 do 25 unete sa tastature.
Kada korisnik unese 25 zavrsava se program. (while petlja).
 */
public class Zadatak12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ans = "";
        int num = 0;
        while(num != 25) {
            System.out.print("Unesite sledeci broj: ");
            num = input.nextInt();
            if (num % 2 == 0 && num > 0 && num < 25) {
                ans += num + " ";
            }
        }
        System.out.println(ans);
//        - ispis odmah u petlji
//        while(true) {
//            System.out.print("Unesite sledeci broj: ");
//            int num = input.nextInt();
//            if(num % 2 == 0 && num >= 1 && num < 25) {
//                System.out.println("Broj " + num + " odgovara uslovu.");
//            } else if (num == 25) {
//                break;
//            }
//        }
//        - ispis u string na kraju do-while
//        String ans = "";
//        int num;
//        do {
//            System.out.print("Unesite sledeci broj: ");
//            num = input.nextInt();
//            if (num % 2 == 0 && num > 0 && num < 25) {
//                ans += num + " ";
//            }
//        } while(num != 25);
//        System.out.println(ans);
//        - ispis u string na kraju while

        input.close();
    }
}
