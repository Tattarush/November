package june230626;

import java.util.List;
import java.util.stream.Collectors;

public class Main23 {
    public static void main(String[] args) {

        List<String> list = List.of("Bob","Lina","Bob", "Andrew");

        System.out.println(filter(list));

    }

    public static List<String> filter(List<String> list ){

        return list.stream().distinct().sorted(String::compareTo).collect(Collectors.toList());


    };
}





