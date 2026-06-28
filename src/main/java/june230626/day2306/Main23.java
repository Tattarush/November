package june230626.day2306;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main23 {
    public static void main(String[] args) {

        List<String> list = List.of("Bob","Lina","Bob", "Andrew");

        System.out.println(filter(list));

    }

    public static Set<String> filter(List<String> list ){

        return new TreeSet<>(list);
    };
}





