package java8Example;

//11.convert a list of strings to a map where
// key is the string and the value is its length using streams.

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Example11 {
    static void main() {
        List<String> stringList = List.of(
                "Apple", "Banana", "Cherry", "Date", "Elderberry",
                "Fig", "Grape", "Honeydew", "Kiwi", "Lemon",
                "Mango", "Nectarine", "Orange", "Papaya", "Quince"
        );

        Map<String, Integer> collect = stringList.stream().collect(Collectors.toMap(s -> s, String::length));
        System.out.println(collect);

    }
}