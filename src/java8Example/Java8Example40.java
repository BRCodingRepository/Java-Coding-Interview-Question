package java8Example;


//40.calculate the sum of the squares of all even numbers in a list using streams.

import java.util.List;

public class Java8Example40 {
    static void main() {
        List<Integer> integerList = List.of(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        int sum = integerList.stream().filter(i -> i % 2 == 0).mapToInt(i -> i * i).sum();
        System.out.println("sum = " + sum);
    }
}