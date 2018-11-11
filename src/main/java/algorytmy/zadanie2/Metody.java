package algorytmy.zadanie2;

public class Metody {
    
    public int mnozenie(int a, int b) {
        int sum = 0;
        for (int i = 0; i<a; i++){
            sum += b;
        }
        return  sum;
    }

    public int potega(int a, int b){
        int power = a;
        for (int i=0; i<b; i++) {
            power = mnozenie(a, power);
        }
        return power;
    }
}
