package domaci10;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite dan rodjenja: ");
        int dan = input.nextInt();
        System.out.print("Unesite mesec rodjenja: ");
        int mesec = input.nextInt();

        switch (mesec) {
            case 1:
                if (dan > 0 && dan <= 20) {
                    System.out.println("Jarac");
                } else if (dan <= 31) {
                    System.out.println("Vodolija");
                }
                break;
            case 2:
                if (dan > 0 && dan <= 19) {
                    System.out.println("Vodolija");
                } else if (dan <= 29) {
                    System.out.println("Ribe");
                }
                break;
            case 3:
                if (dan > 0 && dan <= 20) {
                    System.out.println("Ribe");
                } else if (dan <= 31) {
                    System.out.println("Ovan");
                }
                break;
            case 4:
                if (dan > 0 && dan <= 20) {
                    System.out.println("Ovan");
                } else if (dan <= 30) {
                    System.out.println("Bik");
                }
                break;
            case 5:
                if (dan > 0 && dan <= 21) {
                    System.out.println("Bik");
                } else if (dan <= 31) {
                    System.out.println("Blizanci");
                }
                break;
            case 6:
                if (dan > 0 && dan <= 21) {
                    System.out.println("Blizanci");
                } else if (dan <= 30) {
                    System.out.println("Rak");
                }
                break;
            case 7:
                if (dan > 0 && dan <= 22) {
                    System.out.println("Rak");
                } else if (dan <= 31) {
                    System.out.println("Lav");
                }
                break;
            case 8:
                if (dan > 0 && dan <= 22) {
                    System.out.println("Lav");
                } else if (dan <= 31) {
                    System.out.println("Devica");
                }
                break;
            case 9:
                if (dan > 0 && dan <= 22) {
                    System.out.println("Devica");
                } else if (dan <= 30) {
                    System.out.println("Vaga");
                }
                break;
            case 10:
                if (dan > 0 && dan <= 23) {
                    System.out.println("Vaga");
                } else if (dan <= 31) {
                    System.out.println("Skorpija");
                }
                break;
            case 11:
                if (dan > 0 && dan <= 22) {
                    System.out.println("Skorpija");
                } else if (dan <= 30) {
                    System.out.println("Strelac");
                }
                break;
            case 12:
                if (dan > 0 && dan <= 21) {
                    System.out.println("Strelac");
                } else if (dan <= 31) {
                    System.out.println("Jarac");
                }
                break;
            default:
                System.out.println("Nevalidan unos");
                break;
        }
        input.close();
    }
}
