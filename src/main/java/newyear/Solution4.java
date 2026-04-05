package newyear;

public class Solution4 {
    public static void main(String[] args) {

        System.out.println(Calculator.formatResult(Calculator.calculateArea(5.5, 4.2)));


    }
}

class Calculator {

    static double calculateArea(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Размеры должны быть положительными");
        } else {
            return width * height;
        }
    }

    static String formatResult(double value) {
        return "Площадь: "+String.format("%.2f", value)+ " кв.м";
    }
}