package java8Example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//1.Filter a list of strings to find all elements that contain a specific
// substring and then sort them in reverse order?

public class Java8Example1 {
    static void main() {
        List<String> stringList = List.of("apple", "app", "application", "apply");
        List<String> subStringList = stringList.stream().filter(s -> s.contains("app")).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(subStringList);
    }
}
