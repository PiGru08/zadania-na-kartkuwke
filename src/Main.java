import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String slowo = wpiszLiczbyZKlawiatury();
        boolean palindrom = palindrom(slowo);
        if(palindrom){
            System.out.println("tak jest palindronem");
        }else{
            System.out.println("Nie jest palindronem");
        }
    }
    private static String wpiszLiczbyZKlawiatury(){
        System.out.println("Podaj słowo: ");
        Scanner Klawiatura = new Scanner(System.in);
        String slowo = Klawiatura.nextLine();
        return slowo;
    }
    private static boolean palindrom(String slowo){
        boolean palindrom = true;
        for (int i = 0,j = slowo.length()-1; i < slowo.length()/2; i++,j--) {
            if(slowo.charAt(i) != slowo.charAt(j)){
                palindrom = false;
                return palindrom;
            }
        }
        return palindrom;
    }
}
