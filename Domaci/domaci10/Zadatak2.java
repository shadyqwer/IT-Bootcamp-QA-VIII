package domaci10;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        String username = "korisnicko_ime";
        String password = "12345678";

        Scanner input = new Scanner(System.in);
        System.out.print("Unesite username: ");
        String unosUsername = input.nextLine();
        System.out.print("Unesite password: ");
        String unosPassword = input.nextLine();

        if (username.equals(unosUsername) && password.equals(unosPassword)) {
            System.out.println("Uspesno ste se ulogovali.");
        } else {
            System.out.println("Pogresan username ili password");
        }
        input.close();
    }
}
