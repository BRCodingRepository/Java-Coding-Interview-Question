package java8Example;

//18.filter a list of strings to find those with even lengths and then convert them to uppercase.

import java.util.List;
import java.util.stream.Collectors;

public class Java8Example18 {
    static void main() {
        List<String> stringList = List.of(
                "Apple", "Banana", "Cherry", "Date", "Elderberry",
                "Fig", "Grape", "Honeydew", "Kiwi", "Lemon",
                "Mango", "Nectarine", "Orange", "Papaya", "Quince"
        );
        List<String> collect = stringList.stream().filter(s -> s.length() % 2 == 0).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);
    }
}