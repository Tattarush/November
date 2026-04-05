package newyear;

public class Main {
    public static void main(String[] args) {
        double price = 100.50;
        int quantity = 3;
        double discount = 0.1;

        double total = (price * quantity) * (1 - discount);
        System.out.println(total);
    }
}
