package javazadaci;
/*
Implementirati metodu koja vraca slovo koje fali u nizu alfabeta.
  Alfabet : A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
  ABD -> "C"
  IJKLN -> "M"
  WXYZ -> ""

 */
public class Zadatak14 {
    public static void main(String[] args) {
        String niz = "ABD";
        System.out.println(slovoKojeNedostaje(niz));
        System.out.println(slovoKojeNedostaje("IJKLN"));
        System.out.println(slovoKojeNedostaje("WXYZ"));
        System.out.println(slovoKojeNedostajeNiz(new char[]{'A', 'B', 'D'}));
        System.out.println(slovoKojeNedostajeNiz(new char[]{'I', 'J', 'K', 'L', 'N'}));
        System.out.println(slovoKojeNedostajeNiz(new char[]{'W', 'X', 'Y', 'Z'}));
    }
    public static String slovoKojeNedostaje(String niz) {
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int aInx = alfabet.indexOf(niz.charAt(0));
        for(int i = 0; i < niz.length(); i++) {
            if (niz.charAt(i) != alfabet.charAt(aInx)) {
                return "" + alfabet.charAt(aInx);
            }
            aInx++;
        }
        return "";
    }

    public static String slovoKojeNedostajeNiz(char[] niz) {
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int aInx = alfabet.indexOf(niz[0]);
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] != alfabet.charAt(aInx)) {
                return "" + alfabet.charAt(aInx);
            }
            aInx++;
        }
        return "";
    }
}
