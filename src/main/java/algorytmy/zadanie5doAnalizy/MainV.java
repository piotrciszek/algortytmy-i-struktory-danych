package algorytmy.zadanie5doAnalizy;

public class MainV {
    public static void main(String[] args) {
        String wyraz = "makeithappen";
        String haslo = "math";
        Vigener c = new Vigener();

        c.decrypt(c.crypt(wyraz,haslo));

    }
}
