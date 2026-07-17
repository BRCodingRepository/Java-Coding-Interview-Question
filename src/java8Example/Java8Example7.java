package java8Example;

//7.find the longest string in a list of strings using streams.

import java.util.Comparator;
import java.util.List;

public class Java8Example7{
    static void main() {
        List<String> stringList = List.of(
                "Apple", "Banana", "Cherry", "Date", "Elderberry",
                "Fig", "Grape", "Honeydew", "Kiwi", "Lemon",
                "Mango", "Nectarine", "Orange", "Papaya", "Quince"
        );

        String s = stringList.stream().max(Comparator.comparing(String::length)).get();
        System.out.println(s);
    }

}