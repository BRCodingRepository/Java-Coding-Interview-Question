
package java8Example;

//9.Given a String, find the first non-repeated character in it using Stream functions.

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Example10{
    static void main() {
        String s="swiss";
        Character c1 = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() >1).map(Map.Entry::getKey).findFirst().get();
        System.out.println(c1);
    }
}