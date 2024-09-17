import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // The variable i was not declared, removed it as it serves no purpose here.

        String slowo = wpiszStringZKlawiatury();
        boolean palindrom = palindrom(slowo);

        if (palindrom) {
            System.out.println("Tak, jest palindromem.");
        } else {
            System.out.println("Nie jest palindromem.");
        }

        Integer liczba = wpiszLiczbeZKlawiatury();
        Integer liczbaNajblizszaPalindroma = najblizszaDoPalindroma(liczba);
        System.out.println("Najbliższa liczba palindromowa to: " + liczbaNajblizszaPalindroma);
    }

    private static String wpiszStringZKlawiatury() {
        System.out.println("Podaj słowo: ");
        Scanner Klawiatura = new Scanner(System.in);
        return Klawiatura.nextLine();
    }

    private static Integer wpiszLiczbeZKlawiatury() {
        System.out.println("Podaj liczbę: ");
        Scanner Klawiatura = new Scanner(System.in);
        return Klawiatura.nextInt();
    }

    private static boolean palindrom(String slowo) {
        for (int i = 0, j = slowo.length() - 1; i < j; i++, j--) {
            if (slowo.charAt(i) != slowo.charAt(j)) {
                return false;
            }
        }
        return true;
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
}
