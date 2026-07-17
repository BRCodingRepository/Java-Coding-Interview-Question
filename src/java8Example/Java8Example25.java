package java8Example;

import java.util.List;
import java.util.stream.Collectors;

//25. find the common elements between two lists of strings using streams.

public class Java8Example25 {
    static void main() {
        List<Integer> integerList = List.of(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        List<Integer> integerList1=List.of(10, 11, 12, 13, 14, 15, 16, 17);
        List<Integer> collect = integerList.stream().filter(integerList1::contains).collect(Collectors.toList());
        System.out.println(collect);
    }
}