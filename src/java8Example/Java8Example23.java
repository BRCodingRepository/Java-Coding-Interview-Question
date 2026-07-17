package java8Example;

//23.remove all elements in a list that appear more than once using streams.

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Example23 {
    static void main() {

        List<Integer> integerList = List.of(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,10, 11, 12, 13, 14, 15, 16, 17);
List<Integer> list=integerList.stream().collect(Collectors.groupingBy(Function.identity()
        ,Collectors.counting()))
        .entrySet().stream()
        .filter(entry->entry.getValue()<=1).map(Map.Entry::getKey)
        .collect(Collectors.toList());
        System.out.println(list);
    }
}
