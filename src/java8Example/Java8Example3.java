package java8Example;
import java.util.List;
import java.util.stream.Collectors;

//3.group a list of strings by their length and collect the result into a map.

public  class Java8Example3 {
    static void main() {

        List<String> stringList = List.of("Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grape",
                "Honeydew", "Kiwi", "Lemon", "Mango", "Nectarine", "Orange", "Papaya", "Quince");
        System.out.println(stringList.stream().collect(Collectors.groupingBy(String::length)));
    }
}
