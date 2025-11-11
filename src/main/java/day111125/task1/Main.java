package day111125.task1;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String s1 = String.valueOf((Object) null);
        String s2 = String.valueOf(null);

        System.out.println(Objects.equals(s1, s2));
    }
}
