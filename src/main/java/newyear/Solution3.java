package newyear;

import java.util.Arrays;

public class Solution3 {
    public static void main(String[] args) {
        int[] data = {12, 5, 28, 9, 45};
        int idx = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
                idx = i;
            }
        }
        System.out.println("Максимум = "+max+" (индекс "+idx+")");
        int temp = data[0];
        data[0] = data[idx];
        data[idx] = temp;
        System.out.println(Arrays.toString(data));
    }
}
