package algorytmy.zadanie3;


public class Metody {

    public double bokKwadratu (double pole){
        return Math.sqrt(pole);
    }
    public double bokTrojkata (double pole){
        return Math.sqrt((4 * pole * Math.sqrt(3)/3));
    }
    public double promienKola (double pole) {
        return Math.sqrt(pole/Math.PI);

                /*pole = pi * r2
                r2 = pole/pi
                        r = pier(pole/pi)*/
    }
}
