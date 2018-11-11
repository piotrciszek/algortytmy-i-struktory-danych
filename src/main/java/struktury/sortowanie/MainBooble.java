package struktury.sortowanie;

import java.util.Arrays;

public class MainBooble {
    public static void main(String[] args) {
        int[] table = new int[]{4,5,6,2,1,23,5,67,8,4,3,1,0};

        BubbleSort.sort(table);
        System.out.println(Arrays.toString(table));


    }
}
