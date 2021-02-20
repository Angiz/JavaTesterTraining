import java.util.Scanner;

public class ExampleClass {

    //mała rozgrzewka :)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę 1: ");
        int liczba1 = scanner.nextInt();
        System.out.println("Podaj liczbę 2: ");
        int liczba2 = scanner.nextInt();
        int wynikDodawania = liczba1 + liczba2;
        int wynikOdejmowania = liczba1 - liczba2;
        int wynikMnozenia = liczba1 * liczba2;
        int wynikDzielenia = liczba1 / liczba2;
        int wynikModulo = liczba1%liczba2;

        System.out.println("Wynik dodawania: " + wynikDodawania);
        System.out.println("Wynik odejmowania: " + wynikOdejmowania);
        System.out.println("Wynik mnożenia: " + wynikMnozenia);
        System.out.println("Wynik dzielenia: " + wynikDzielenia);
        System.out.println("Wynik modulo: " + wynikModulo);

    }
}
