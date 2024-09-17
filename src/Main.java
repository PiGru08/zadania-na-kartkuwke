import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Wczytanie liczby od użytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        // Sprawdzenie, czy liczba jest liczbą pierwszą
        if (czyLiczbaPierwsza(liczba)) {
            System.out.println("Liczba " + liczba + " jest liczbą pierwszą.");
        } else {
            System.out.println("Liczba " + liczba + " nie jest liczbą pierwszą.");
        }
    }

    // Funkcja sprawdzająca, czy liczba jest liczbą pierwszą
    private static boolean czyLiczbaPierwsza(int liczba) {
        // Liczby mniejsze niż 2 nie są pierwsze
        if (liczba < 2) {
            return false;
        }

        // Sprawdzanie dzielników od 2 do pierwiastka z liczby
        for (int i = 2; i <= Math.sqrt(liczba); i++) {
            if (liczba % i == 0) {
                return false; // Znaleziono dzielnik, więc liczba nie jest pierwsza
            }
        }

        // Jeśli nie znaleziono żadnego dzielnika, liczba jest pierwsza
        return true;
    }
}
