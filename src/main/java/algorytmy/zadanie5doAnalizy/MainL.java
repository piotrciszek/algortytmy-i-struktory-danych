package algorytmy.zadanie5doAnalizy;


public class MainL {
    public static void main(String[] args) {
        Levenshtein c = new Levenshtein();

        int[][] tab = c.initTable("foka","kotka");


        c.fillTable(tab);
        c.printTable(tab);
    }
}
