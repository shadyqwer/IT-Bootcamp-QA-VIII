package domaci13;

public class Zadatak2 {
    public static void main(String[] args) {
        printFullName("milos", "STAMENKOVIC");
        printFullName("MILOS", "stamenkovic");
        printFullName("MiLoS", "sTaMeNkOvIc");
        printFullName("MORTY", "SMITH");
        printFullName("morty", "smith");
    }

    public static void printFullName(String name, String surname) {
        System.out.printf("Ime: %s i Prezime: %s.%n", name.toUpperCase(), surname.toLowerCase());
    }
}
