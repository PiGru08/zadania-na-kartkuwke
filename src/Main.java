import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wpisz pierwsze słowo: ");
        ArrayList<Character> listaSlowo1 = wpiszDoTablicy();

        System.out.println("Wpisz drugie słowo: ");
        ArrayList<Character> listaSlowo2 = wpiszDoTablicy();

        System.out.println(czyAnagram(listaSlowo1, listaSlowo2));
    }

    private static ArrayList<Character> wpiszDoTablicy() {
        System.out.println("Podaj słowo: ");
        Scanner klawiatura = new Scanner(System.in);
        String slowo = klawiatura.nextLine();
        ArrayList<Character> slowoLista = new ArrayList<>();
        for (int i = 0; i < slowo.length(); i++) {
            slowoLista.add(slowo.charAt(i));
        }
        return slowoLista;
    }

    private static String czyAnagram(ArrayList<Character> listaSlowo1, ArrayList<Character> listaSlowo2) {
        Collections.sort(listaSlowo1);
        Collections.sort(listaSlowo2);

        if (listaSlowo1.size() != listaSlowo2.size()) {
            return "Słowa nie są tej samej długości, więc nie są anagramami.";
        } else {
            for (int i = 0; i < listaSlowo1.size(); i++) {
                if (!listaSlowo1.get(i).equals(listaSlowo2.get(i))) {
                    return "Słowa nie są anagramami.";
                }
            }
            return "Podane słowa są anagramami.";
        }
    }
}
