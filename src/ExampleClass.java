import java.sql.SQLOutput;
import java.util.Scanner;

public class ExampleClass {

    //mała rozgrzewka :)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę 1: ");
        int liczba1 = scanner.nextInt();
        System.out.println("Podaj liczbę 2: ");
        int liczba2 = scanner.nextInt();
        int wynik = liczba1 + liczba2;
        System.out.println("Wynik: " + wynik);

    }
}
