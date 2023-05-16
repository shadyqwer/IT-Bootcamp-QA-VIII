package javazadaci;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        int volume = 75;
        Scanner input = new Scanner(System.in);
        String kontrola;
        do {
            System.out.print("Unesite komandu (UP, DOWN, MUTE, UNMUTE): ");
            kontrola = input.nextLine().toUpperCase();
            switch (kontrola) {
                case "UP":
                    volume += 10;
                    if (volume > 100) {
                        volume = 100;
                    }
                    break;
                case "DOWN":
                    volume -= 10;
                    if (volume < 0) {
                        volume = 0;
                    }
                    break;
                case "MUTE":
                    volume = 0;
                    break;
            }
        } while (!kontrola.equals("PLAY"));
//        do {
//            System.out.print("Unesite komandu (UP, DOWN, MUTE, UNMUTE): ");
//            kontrola = input.nextLine().toUpperCase();
//            if (kontrola.equals("UP")) {
//                volume += 10;
//                if (volume > 100) {
//                    volume = 100;
//                }
//            } else if (kontrola.equals("DOWN")) {
//                volume -= 10;
//                if (volume < 0) {
//                    volume = 0;
//                }
//            } else if (kontrola.equals("MUTE")) {
//                volume = 0;
//            }
//        } while (!kontrola.equals("PLAY"));
        System.out.println("Jacina zvuka je " + volume + "%");
    }
}