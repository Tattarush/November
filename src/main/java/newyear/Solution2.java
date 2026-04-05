package newyear;

public class Solution2 {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 8, 3, 19, 7, 25, 1};
        int oddSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddSum += numbers[i];
            }
        }
        System.out.println("Сумма нечетных чисел: "+ oddSum);
    }
}
