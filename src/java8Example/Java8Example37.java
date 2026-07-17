package java8Example;

//37.convert a list of integers into a list of their hexadecimal string representations.

import java.util.List;
import java.util.stream.Collectors;

public class Java8Example37 {
    static void main() {
        List<Integer> integerList = List.of(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        List<String> collect = integerList.stream().map(Integer::toHexString).collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}