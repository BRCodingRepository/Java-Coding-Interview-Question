package java8Example;

//17. create a comma-separated string from a list of integers using streams.

import java.util.List;
import java.util.stream.Collectors;

public class Java8Example16 {
    static void main() {
        List<String> stringList = List.of(
                "Apple", "Banana", "Cherry", "Date", "Elderberry",
                "Fig", "Grape", "Honeydew", "Kiwi", "Lemon",
                "Mango", "Nectarine", "Orange", "Papaya", "Quince"
        );
      String completeSentence=  stringList.stream().collect(Collectors.joining(","));
        System.out.println(completeSentence);
    }
}