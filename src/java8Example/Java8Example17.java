package java8Example;

//19.calculate the total length of all strings in a list using streams.
// (the sum of length's of all the strings in the list).

import java.util.List;
import java.util.stream.Collectors;

public class Java8Example17 {
    static void main() {
        List<String> stringList = List.of(
                "Apple", "Banana", "Cherry", "Date", "Elderberry",
                "Fig", "Grape", "Honeydew", "Kiwi", "Lemon",
                "Mango", "Nectarine", "Orange", "Papaya", "Quince"
        );

        long sum = stringList.stream().collect(Collectors.summarizingInt(String::length)).getSum();
        System.out.println(sum);

    }
}