package domaci15_2;

public class RadnikMain {
    public static void main(String[] args) {

        Radnik radnik1 = new Radnik("Marko", "Markovic", 2000);
        Radnik radnik2 = new Radnik("Petar", "Petrovic", 2015);
        Radnik radnik3 = new Radnik("Ivana", "Ivanovic", 2005);

        System.out.println(radnik1.getName() + " " + radnik1.getSurname() + " radi vise od 10 godina: " + radnik1.workingTenYears());
        System.out.println(radnik2.getName() + " " + radnik2.getSurname() + " radi vise od 10 godina: " + radnik2.workingTenYears());
        System.out.println(radnik3.getName() + " " + radnik2.getSurname() + " radi vise od 10 godina: " + radnik3.workingTenYears());
    }
}
