package algorytmy.zadanie2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Metody metody = new Metody();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbę");
        int a = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        int b = scanner.nextInt();
        System.out.println("Wynik mnozenia to: " + metody.mnozenie(a, b));
        System.out.println("Wynik potegowania to: " + metody.potega(a, b));
    }
}
