package algorytmy.zadanie3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Metody metody = new Metody();

        System.out.println("Podaj pole figury");
        double pole = scanner.nextDouble();
        System.out.println("Bok kwadratu to: " + metody.bokKwadratu(pole));
        System.out.println("Bok trojkata rownobocznego to: " + metody.bokTrojkata(pole));
        System.out.println("Promien kola to: " + metody.promienKola(pole));
    }


}
