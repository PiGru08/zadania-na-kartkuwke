import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        // Długość hasła
        int dlugoscHasla = 20;

        // Znaki, które mogą wystąpić w haśle
        String wielkieLitery = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String maleLitery = "abcdefghijklmnopqrstuvwxyz";
        String cyfry = "0123456789";
        String znakiSpecjalne = "!@#$%^&*()-_=+<>?";

        // Wszystkie możliwe znaki
        String wszystkieZnaki = wielkieLitery + maleLitery + cyfry + znakiSpecjalne;

        // Generowanie losowego hasła
        String haslo = generujHaslo(wszystkieZnaki, dlugoscHasla);
        System.out.println("Wygenerowane hasło: " + haslo);
    }

    private static String generujHaslo(String znaki, int dlugosc) {
        SecureRandom random = new SecureRandom();
        StringBuilder haslo = new StringBuilder(dlugosc);

        // Dodawanie losowych znaków do hasła
        for (int i = 0; i < dlugosc; i++) {
            int index = random.nextInt(znaki.length());
            haslo.append(znaki.charAt(index));
        }

        return haslo.toString();
    }
}
