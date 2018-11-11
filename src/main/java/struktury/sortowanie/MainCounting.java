package struktury.sortowanie;

import java.util.Arrays;

public class MainCounting {
     public static void main(String[] args) {

            int[] tablica = new int[]{4,5,6,7,8,9,3,1,2,3,4,5,6,1,2};

            CountigSort.sort(tablica);

            System.out.println(Arrays.toString(tablica));
        }
    }

