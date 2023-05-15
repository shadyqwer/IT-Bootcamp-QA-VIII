package zadaci;

/*
Napisati program koji ce prebrojati prirodne brojeve u intervalu od 1 do 50 koji su djeljivi sa 3.

 */
public class Zadatak6 {
    public static void main(String[] args) {
        int deljiviSaTri = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                deljiviSaTri++;
            }
        }
        System.out.println("Brojeva deljivih sa 3 izmedju 1 i 50 ima: " + deljiviSaTri);
    }
}
