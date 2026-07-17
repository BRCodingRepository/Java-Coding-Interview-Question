package java8Example;

//29. sort a list of strings based on their lengths and then alphabetically using streams.

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Example29 {
    static void main() {
        List<String> stringList = List.of(
                "Apple", "Banana", "Cherry", "Date", "Elderberry",
                "Fig", "Grape", "Honeydew", "Kiwi", "Lemon",
                "Mango", "Nectarine", "Orange", "Papaya", "Quince"
        );
List<String> list= stringList.stream().sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).collect(Collectors.toList());
        System.out.println(list);
    }
}