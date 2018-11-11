package algorytmy.zadanie1;

import java.util.Scanner;

//    i -> od uzytkownika;
//    j -> od uzytkownika;
//    dopoki i-j != 0
//       jeżeli ( i > j)
//           i = i - j
//       jeżeli nie
//           j = j - i
//

public class Euklides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int liczba1 = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int liczba2 = scanner.nextInt();

        if (liczba1 < 0 || liczba2 < 0) throw new IllegalArgumentException();



        while(liczba1 != liczba2) {
            if (liczba1 > liczba2){
                liczba1 -= liczba2;
            } else {
                liczba2 -= liczba1;
            }
        }
        System.out.println(liczba1);
    }
}
