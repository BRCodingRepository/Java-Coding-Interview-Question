package java8Example;

//31.Given a list of integers, sort all the values present in it in descending order using Stream functions.


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Example31 {
    static void main() {
        List<Integer> integerList = List.of(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        List<Integer> collect = integerList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);

    }
}