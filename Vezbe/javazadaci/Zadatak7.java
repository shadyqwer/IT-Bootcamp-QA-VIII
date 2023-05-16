package javazadaci;
/*
Napisati program koji simulira korigovanje jacine zvuka na jutjubu. Podrazumevana vrednost za jacinu zvuka, u trenutku kada se ucita video, je 75%. Korisnik unosi akcije koje uticu na jacinu zvuka sve dok ne unese PLAY. Dozvoljene akcije su:
●	up - akcija povecava jacinu zvuka za 10%
●	down - akcija smanjuje jacinu zvuka za 10%
●	mute - akcije postavlja jacinu zvuka na 0%
Jacina zvuka u bilo kom trenutku maksimalno moze biti 100% i minimalno 0%.Na kraju programa ispisati jacinu zvuka.
BONUS) Prema tekstu zadataka broj 2. Dozvoljene akcije su:
●	up - akcija povecava jacinu zvuka za 10%
●	down - akcija smanjuje jacinu zvuka za 10%
●	mute - akcija postavlja jacinu zvuka na 0%
●	unmute - akcija jacinu zvuka vraca na vrednost koja je bila pre mute akcije samo ako je prethodna akcija bila mute, u suprotnom vraca na podrazumevanu vrednost od 75%.

 */
import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        int volume = 75;
        int temp = 0;
        boolean muted = false;
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
                    muted = false;
                    break;
                case "DOWN":
                    volume -= 10;
                    if (volume < 0) {
                        volume = 0;
                    }
                    muted = false;
                    break;
                case "MUTE":
                    temp = volume;
                    volume = 0;
                    muted = true;
                    break;
                case "UNMUTE":
                    if (muted) {
                        volume = temp;
                    } else {
                        volume = 75;
                    }
                    muted = false;
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
//                muted = false;
//            } else if (kontrola.equals("DOWN")) {
//                volume -= 10;
//                if (volume < 0) {
//                    volume = 0;
//                }
//                muted = false;
//            } else if (kontrola.equals("MUTE")) {
//                temp = volume;
//                volume = 0;
//                muted = true;
//            } else if (kontrola.equals("UNMUTE")) {
//                if (muted == true) {
//                    volume = temp;
//                } else {
//                    volume = 75;
//                }
//                muted = false;
//            }
//        } while (!kontrola.equals("PLAY"));
        System.out.println(volume);
    }
}