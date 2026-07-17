package java8Example;
//22. find the top N highest values in a list of integers.


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Example22 {
    static void main() {
        List<Integer> integerList = List.of(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        List<Integer> collect = integerList.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).limit(3).collect(Collectors.toList());
        System.out.println(collect);
    }
}