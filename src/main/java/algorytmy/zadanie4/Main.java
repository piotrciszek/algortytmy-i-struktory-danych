package algorytmy.zadanie4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Podaj pierwsza liczbe");
        a = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        b = scanner.nextInt();

        Metody metody = new Metody();
        metody.pokazLiczby(a, b);
    }

}