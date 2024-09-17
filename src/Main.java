import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer liczba = wpiszLiczbeZKlawiatury();
        Integer liczbaNajblizszaPalindroma = najblizszaDoPalindroma(liczba);
        System.out.println("Najbliższa liczba palindromowa to: " + liczbaNajblizszaPalindroma);

        String slowo = wpiszStringZKlawiatury(); // Declare 'slowo' with correct type
        String cezar = Cezar(slowo, 3);
        System.out.println("Szyfr Cezara: " + cezar);
    }

    private static String wpiszStringZKlawiatury() {
        System.out.println("Podaj słowo: ");
        Scanner klawiatura = new Scanner(System.in);
        return klawiatura.nextLine();
    }

    private static Integer wpiszLiczbeZKlawiatury() {
        System.out.println("Podaj liczbę: ");
        Scanner klawiatura = new Scanner(System.in);
        return klawiatura.nextInt();
    }

    private static Integer najblizszaDoPalindroma(Integer liczba) {
        int mniejsza = liczba - 1;
        int wieksza = liczba + 1;

        if (palindrom(Integer.toString(liczba))) {
            return liczba;
        }

        while (true) {
            if (palindrom(Integer.toString(mniejsza))) {
                return mniejsza;
            }
            if (palindrom(Integer.toString(wieksza))) {
                return wieksza;
            }
            mniejsza--;
            wieksza++;
        }
    }

    private static boolean palindrom(String slowo) {
        for (int i = 0, j = slowo.length() - 1; i < j; i++, j--) {
            if (slowo.charAt(i) != slowo.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    private static String Cezar(String slowo, int klucz) {
        StringBuilder zaszyfrowane = new StringBuilder();
        for (int i = 0; i < slowo.length(); i++) {
            char znak = slowo.charAt(i);

            if (Character.isLetter(znak)) { // Check if it's a letter
                char base = Character.isUpperCase(znak) ? 'A' : 'a';
                char znakPrzesuniety = (char) ((znak - base + klucz) % 26 + base);
                zaszyfrowane.append(znakPrzesuniety);
            } else {
                zaszyfrowane.append(znak); // Keep non-letter characters as they are
            }
        }

        return zaszyfrowane.toString();
    }
}

