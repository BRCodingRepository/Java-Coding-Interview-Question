package java8Example;

//16.filter a list of strings to find only those that start with a
// specific prefix and then concatenate them into a single string.

import java.util.List;
import java.util.stream.Collectors;

public class Java8Example19 {
    static void main() {
        List<String> listString = List.of("App", "Application", "Java", "Apply");
        String s1 = listString.stream().filter(s -> s.startsWith("Ap")).collect(Collectors.joining(","));
        System.out.println(s1);
    }
}