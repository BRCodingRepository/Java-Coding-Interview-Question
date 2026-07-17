package java8Example;

//21.Collect even and odd lengths of strings into maps with key being the length and value being the string and also sort them by length using stream.

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Example21 {
    static void main() {
        List<String> stringList = List.of("Apple", "Banana", "Cherry", "Date", "Elderberry",
                "Fig", "Grape", "Honeydew", "Kiwi", "Lemon", "Mango", "Nectarine", "Orange", "Papaya", "Quince");
        Map<Integer, List<String>> collect = stringList.stream().collect(Collectors.groupingBy(String::length, Collectors.toList()));
        System.out.println(collect);
    }
}