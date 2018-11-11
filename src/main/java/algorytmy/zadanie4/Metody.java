package algorytmy.zadanie4;

public class Metody {
    public void pokazLiczby(int a, int b){
        for (int i=a; i<=b; i++){
            System.out.print(i);
            if (i < b){
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }
    }
}
