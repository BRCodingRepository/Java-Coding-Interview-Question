package java8Example;


//39.How do you count the frequency of each character in a string using streams

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Example39 {
    static void main() {
        String s="bheemaraya";
        Map<String, Long> collect = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("collect = " + collect);
    }
}