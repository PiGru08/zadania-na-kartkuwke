import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Wczytanie liczby od użytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        // Obliczenie sumy silni cyfr
        int sumaSilni = sumaSilniCyfr(liczba);
        System.out.println("Suma silni cyfr liczby " + liczba + " to: " + sumaSilni);
    }

    // Funkcja obliczająca sumę silni cyfr liczby
    private static int sumaSilniCyfr(int liczba) {
        int suma = 0;

        // Dla każdej cyfry liczby obliczamy jej silnię
        while (liczba > 0) {
            int cyfra = liczba % 10;  // Pobranie ostatniej cyfry
            suma += silnia(cyfra);    // Dodanie silni cyfry do sumy
            liczba /= 10;             // Usunięcie ostatniej cyfry
        }

        return suma;
    }

    // Funkcja obliczająca silnię danej liczby
    private static int silnia(int n) {
        if (n == 0 || n == 1) {
            return 1; // Silnia 0! i 1! to 1
        }

        int wynik = 1;
        for (int i = 2; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }
}
